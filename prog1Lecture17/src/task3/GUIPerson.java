package task3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

import java.util.ArrayList;

public class GUIPerson extends Application {

    private final TextField personNameTextField = new TextField();
    private final TextField personTitleTextField = new TextField();
    private final CheckBox personSeniorCheckBox = new CheckBox();

    private final ArrayList<Person> personArrayList = new ArrayList<>();
    private final ListView<Person> personListView;

    public GUIPerson(ListView<Person> personListView){
        this.personListView = personListView;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Person Information");
        GridPane primaryPane = new GridPane();
        this.innerContents(primaryPane);
        Scene firstScene = new Scene(primaryPane);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }

    private void innerContents(GridPane pane) {
        Label nameLabel = new Label("Name:");
        Label titleLabel = new Label("Title:");
        pane.add(nameLabel, 0, 0);
        pane.add(personNameTextField, 1, 0);
        pane.add(titleLabel, 0, 1);
        pane.add(personTitleTextField, 1, 1);

        pane.add(personSeniorCheckBox, 1, 2);
        Label seniorLabel = new Label("Senior");
        pane.add(seniorLabel, 2, 2);

        Button cancelButton = new Button("Cancel");
        Button okButton = new Button("OK");
        pane.add(cancelButton, 1, 3);
        pane.add(okButton, 2, 3);

        //Functionality
        okButton.setOnMouseClicked(e -> {
            if (validUserInput()) {
                Person person = createPerson();
                addPersonToArrayList(person);
                addPersonsArrayListToViewList();
                clearAll();
            } else {
                alertMessageMissingInformation();
            }
        });
    }

    private boolean validUserInput() {
        return !personNameTextField.getText().isBlank() || !personTitleTextField.getText().isBlank();
        // isBlank because it takes whitespace into account
    }

    private Person createPerson() {
        String name = personNameTextField.getText().trim();
        String title = personTitleTextField.getText().trim();
        boolean senior = personSeniorCheckBox.isSelected();
        return new Person(name, title, senior);
    }

    private void addPersonToArrayList(Person person){
        personArrayList.add(person);
    }
    private void addPersonsArrayListToViewList(){
        personListView.getItems().setAll(personArrayList);
    }

    private void clearAll(){
        personNameTextField.clear();
        personTitleTextField.clear();
        personSeniorCheckBox.setSelected(false);
    }

    private void alertMessageMissingInformation(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error: Missing Information");
        alert.setHeaderText("Please enter both name and title");
    }
}
