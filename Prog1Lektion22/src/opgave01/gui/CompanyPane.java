package opgave01.gui;

import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import opgave01.application.controller.Controller;
import opgave01.application.model.Company;
import opgave01.application.model.Customer;
import opgave01.application.model.Employee;

import java.util.Optional;

public class CompanyPane extends GridPane {
    private TextField nameTextField;
    private TextField hoursTextField;
    private TextArea employeesTextArea;
    private TextArea customersTextArea;
    private ListView<Company> companyListView;

    public CompanyPane() {
        this.setPadding(new Insets(20));
        this.setHgap(20);
        this.setVgap(10);
        this.setGridLinesVisible(false);

        this.add(new Label("Companies"), 0, 0);

        companyListView = new ListView<>();
        this.add(companyListView, 0, 1, 1, 3);
        companyListView.setPrefWidth(200);
        companyListView.setPrefHeight(200);
        companyListView.getItems().setAll(Controller.getCompanies());

        ChangeListener<Company> listener = (ov, oldCompny, newCompany) -> this.selectedCompanyChanged(newCompany);
        companyListView.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblName = new Label("Name:");
        this.add(lblName, 1, 1);

        nameTextField = new TextField();
        this.add(nameTextField, 2, 1);
        nameTextField.setEditable(false);

        Label lblHours = new Label("Weekly Hours:");
        this.add(lblHours, 1, 2);

        hoursTextField = new TextField();
        this.add(hoursTextField, 2, 2);
        hoursTextField.setEditable(false);

        Label employeesLabel = new Label("Employees:");
        this.add(employeesLabel, 1, 3);
        GridPane.setValignment(employeesLabel, VPos.BASELINE);
        employeesLabel.setPadding(new Insets(4, 0, 4, 0));

        employeesTextArea = new TextArea();
        this.add(employeesTextArea, 2, 3);
        employeesTextArea.setPrefWidth(200);
        employeesTextArea.setPrefHeight(100);
        employeesTextArea.setEditable(false);

        // -------------------------------------------------------------------------
        // Opgave 2 - Customer class
        Label customersLabel = new Label("Customers:");
        this.add(customersLabel, 1, 4);
        GridPane.setValignment(customersLabel, VPos.BASELINE);
        customersLabel.setPadding(new Insets(4, 0, 4, 0));

        customersTextArea = new TextArea();
        this.add(customersTextArea, 2, 4);
        customersTextArea.setPrefWidth(200);
        customersTextArea.setPrefHeight(100);
        customersTextArea.setEditable(false);
        // -------------------------------------------------------------------------

        HBox hboxButtons = new HBox(40);
        this.add(hboxButtons, 0, 5, 4, 1);
        hboxButtons.setPadding(new Insets(10, 0, 0, 0));
        hboxButtons.setAlignment(Pos.BASELINE_CENTER);

        Button createButton = new Button("Create");
        hboxButtons.getChildren().add(createButton);
        createButton.setOnAction(event -> this.createAction());

        Button updateButton = new Button("Update");
        hboxButtons.getChildren().add(updateButton);
        updateButton.setOnAction(event -> this.updateAction());

        Button deleteButton = new Button("Delete");
        hboxButtons.getChildren().add(deleteButton);
        deleteButton.setOnAction(event -> this.deleteAction());

        // Opgave 3 - Customer class
        Button createCustomerButton = new Button("Assign New Customer");
        hboxButtons.getChildren().add(createCustomerButton);
        createCustomerButton.setOnAction(event -> this.createCustomer());

        if (!companyListView.getItems().isEmpty()) {
            companyListView.getSelectionModel().select(0);
        }
    }

    // -------------------------------------------------------------------------

    private void createAction() {
        new CompanyWindow("Create Company").showAndWait();
        // Wait for the modal dialog to close
        companyListView.getItems().setAll(Controller.getCompanies());
        int index = companyListView.getItems().size() - 1;
        companyListView.getSelectionModel().select(index);
    }

    private void updateAction() {
        Company company = companyListView.getSelectionModel().getSelectedItem();
        if (company != null) {
            new CompanyWindow("Update Company", company).showAndWait();
            // Wait for the modal dialog to close
            int selectIndex = companyListView.getSelectionModel().getSelectedIndex();
            companyListView.getItems().setAll(Controller.getCompanies());
            companyListView.getSelectionModel().select(selectIndex);
        }
    }

    private void deleteAction() {
        Company company = companyListView.getSelectionModel().getSelectedItem();
        if (company != null) {
            if (company.hasEmployees()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Delete Company");
                alert.setHeaderText("Can't delete a company that has emlpoyees");
                // wait for the modal dialog to close
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Delete Company");
                // alert.setContentText("Are you sure?");
                alert.setHeaderText("Are you sure?");
                Optional<ButtonType> result = alert.showAndWait();
                if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
                    Controller.deleteCompany(company);
                    companyListView.getItems().setAll(Controller.getCompanies());
                    this.updateControls(companyListView.getSelectionModel().getSelectedItem());
                }
            }
        }
    }

    // -------------------------------------------------------------------------
    // Opgave 3 - Create Customer
    private void createCustomer(){
        new CustomerWindow("Assign Customer").showAndWait();
        companyListView.getItems().setAll(Controller.getCompanies());
        int index = companyListView.getItems().size() - 1;
        companyListView.getSelectionModel().select(index);
    }

    // -------------------------------------------------------------------------

    private void selectedCompanyChanged(Company newCompany) {
        this.updateControls(newCompany);
    }

    public void updateControls(Company company) {
        if (company != null) {
            nameTextField.setText(company.getName());
            hoursTextField.setText("" + company.getHours());

            StringBuilder stringBuilderEmployee = new StringBuilder();
            for (Employee emp : company.getEmployees()) {
                if(emp != null){
                    stringBuilderEmployee.append(emp + "\n");
                }
            }
            employeesTextArea.setText(stringBuilderEmployee.toString());

            // Opgave 2 - Customer class
            StringBuilder stringBuilderCustomer = new StringBuilder();
            for (Customer customer : company.getCustomers()) {
                if(customer != null){
                    stringBuilderCustomer.append(customer + "\n");
                }
            }
            customersTextArea.setText(stringBuilderCustomer.toString());

        } else {
            nameTextField.clear();
            hoursTextField.clear();
            employeesTextArea.clear();
            customersTextArea.clear();
        }
    }
}