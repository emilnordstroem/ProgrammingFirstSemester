package task1and2;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

import java.util.ArrayList;

public class Gui extends Application {
    private final TextField personNameTextField = new TextField();
    private final TextField personTitleTextField = new TextField();
    private final Button addPersonButton = new Button("Add person");
    private final CheckBox seniorCheckBox = new CheckBox();

    private final ListView<Person> personsListView = new ListView<>();
    private final ArrayList<Person> personsArrayList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Person administration");
        GridPane primaryPane = new GridPane();
        this.innerContents(primaryPane);
        Scene firstScene = new Scene(primaryPane);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }

    private void innerContents(GridPane pane){
        pane.setGridLinesVisible(true);

        Label nameLabel = new Label("Name:");
        pane.add(nameLabel, 0,0);
        pane.add(personNameTextField, 1, 0);

        Label titleLabel = new Label("Title:");
        pane.add(titleLabel, 0,1);
        pane.add(personTitleTextField,1,1);

        Label sensiorLabel = new Label("Senior");
        pane.add(seniorCheckBox, 1,3);
        pane.add(sensiorLabel, 2,3);

        pane.add(addPersonButton, 3,3);
        addPersonButton.setOnMouseClicked(e -> {
            if(!checkUserInput()){
                addPersonToViewList();
            } else {
                outputToUser();
            }
        });

        Label personsLabel = new Label("Persons:");
        pane.add(personsLabel,0,4);
        GridPane.setValignment(personsLabel, VPos.TOP);

        pane.add(personsListView, 1,4);
    }

    private boolean checkUserInput(){
        return personNameTextField.getText().isBlank() || personTitleTextField.getText().isBlank();
    }
    private void outputToUser(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Missing input");
        alert.setContentText("Type both a name and title of the person");
        alert.show();
    }

    private void addPersonToViewList(){
        String name = personNameTextField.getText().trim();
        String title = personTitleTextField.getText().trim();
        boolean senior = seniorCheckBox.isSelected();

        Person person = new Person(name, title, senior);
        personsArrayList.add(person);
        personsListView.getItems().setAll(personsArrayList);
        clearAllFields();
    }

    private void clearAllFields(){
        personNameTextField.clear();
        personTitleTextField.clear();
        seniorCheckBox.setSelected(false);
    }

}
