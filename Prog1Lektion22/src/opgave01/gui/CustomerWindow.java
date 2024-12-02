package opgave01.gui;

import javafx.beans.value.ChangeListener;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import opgave01.application.controller.Controller;
import opgave01.application.model.Company;
import opgave01.application.model.Customer;
import opgave01.application.model.Customer;

public class CustomerWindow extends Stage {
    private Customer customer;
    private TextField pronounsTextField;
    private TextField fullNameTextField;

    private ComboBox<Company> selectCompanyComboBox;

    private Label errorLabel;

    public CustomerWindow(String title, Customer customer) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.customer = customer;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    public CustomerWindow(String title) {
        this(title, null);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        pane.add(new Label("Pronouns"), 0, 0);
        pronounsTextField = new TextField();
        pane.add(pronounsTextField, 0, 1);
        pronounsTextField.setPrefWidth(200);

        pane.add(new Label("Full name"), 0, 2);
        fullNameTextField = new TextField();
        pane.add(fullNameTextField, 0, 3);

        selectCompanyComboBox = new ComboBox<>();
        pane.add(selectCompanyComboBox, 0, 4);
        selectCompanyComboBox.getItems().addAll(Controller.getCompanies());

        Button cancelButton = new Button("Cancel");
        pane.add(cancelButton, 0, 5);
        GridPane.setHalignment(cancelButton, HPos.LEFT);
        cancelButton.setOnAction(event -> this.cancelAction());

        Button okButton = new Button("OK");
        pane.add(okButton, 0, 5);
        GridPane.setHalignment(okButton, HPos.RIGHT);
        okButton.setOnAction(event -> this.okAction());

        errorLabel = new Label();
        pane.add(errorLabel, 0, 6);
        errorLabel.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    private void initControls() {
        if (customer != null) {
            pronounsTextField.setText(customer.getPronouns());
            fullNameTextField.setText("" + customer.getFullName());
            selectCompanyComboBox.getSelectionModel();
        } else {
            pronounsTextField.clear();
            fullNameTextField.clear();
            selectCompanyComboBox.getSelectionModel().select(0);
        }
    }

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        String pronouns = pronounsTextField.getText().trim();
        String fullName = fullNameTextField.getText().trim();
        Company selectedCompany = selectCompanyComboBox.getSelectionModel().getSelectedItem();

        if (pronouns.isEmpty()) {
            errorLabel.setText("Please provide pronouns (Mr./Mrs./Ms.");
            return;
        } else if (fullName.isBlank()) {
            errorLabel.setText("Enter a valid full name");
            return;
        }

        if (customer == null) {
            // Returned null if not re-assigning customer (didn't have to with employee...)
            customer = Controller.createCustomer(pronouns, fullName);
        } else {
            Controller.updateCustomer(customer, pronouns, fullName);
        }

        if(selectedCompany != null){
            Controller.addCustomerToCompany(customer, selectedCompany);
        }
        hide();
    }

    private void selectedCompanyChanged(boolean checked) {
        selectCompanyComboBox.setDisable(!checked);
    }
}
