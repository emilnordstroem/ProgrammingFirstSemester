package opgave01.gui;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import opgave01.application.controller.Controller;
import opgave01.application.model.Company;

public class CompanyWindow extends Stage {
    private Company company;
    private TextField nameTextField;
    private TextField hoursTextField;
    private Label errorLabel;

    public CompanyWindow(String title, Company company) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.company = company;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    public CompanyWindow(String title) {
        this(title, null);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        pane.add(new Label("Name"), 0, 0);

        nameTextField = new TextField();
        pane.add(nameTextField, 0, 1);
        nameTextField.setPrefWidth(200);

        pane.add(new Label("Weekly Hours"), 0, 2);

        hoursTextField = new TextField();
        pane.add(hoursTextField, 0, 3);

        Button cancelButton = new Button("Cancel");
        pane.add(cancelButton, 0, 4);
        GridPane.setHalignment(cancelButton, HPos.LEFT);
        cancelButton.setOnAction(event -> this.cancelAction());

        Button okButton = new Button("OK");
        pane.add(okButton, 0, 4);
        GridPane.setHalignment(okButton, HPos.RIGHT);
        okButton.setOnAction(event -> this.okAction());

        errorLabel = new Label();
        pane.add(errorLabel, 0, 5);
        errorLabel.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    private void initControls() {
        if (company != null) {
            nameTextField.setText(company.getName());
            hoursTextField.setText("" + company.getHours());
        } else {
            nameTextField.clear();
            hoursTextField.clear();
        }
    }

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        String name = nameTextField.getText().trim();
        if (name.isEmpty()) {
            errorLabel.setText("Name is empty");
            return;
        }
        int hours = -1;
        try {
            hours = Integer.parseInt(hoursTextField.getText().trim());
        } catch (NumberFormatException ex) {
            errorLabel.setText("Enter a valid number of hours");
            return;
        }
        if (hours < 0) {
            errorLabel.setText("Hours is not a positive number");
            return;
        }
        // Call application.controller methods
        if (company != null) {
            Controller.updateCompany(company, name, hours);
        } else {
            Controller.createCompany(name, hours);
        }
        this.hide();
    }
}