package task4and5;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;

import java.util.ArrayList;

public class Gui extends Application {
    private final ArrayList<String> maleNamesArrayList = new ArrayList<>();
    private final ArrayList<String> femaleNamesArrayList = new ArrayList<>();

    private final ListView<String> namesListView = new ListView<>();
    private final ToggleGroup genderGroup = new ToggleGroup();

    private final TextField nameTextField = new TextField();

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

        VBox box = new VBox();
        pane.add(box, 1,0);

        String[] genders = {"Male", "Female"};

        for (String gender : genders) {
            RadioButton radioButton = new RadioButton();
            box.getChildren().add(radioButton);
            radioButton.setText(gender);

            radioButton.setToggleGroup(genderGroup);

            radioButton.setOnAction(e -> showGenderNames());
        }

        Label namesLabel = new Label("Names:");
        GridPane.setValignment(namesLabel, VPos.TOP);
        pane.add(namesLabel,1,1);
        pane.add(namesListView,2,1);

        Label nameLabel = new Label("Name:");
        pane.add(nameLabel,1,2);
        pane.add(nameTextField, 2,2);

        Button addButton = new Button("Add");
        pane.add(addButton, 3,2);

        addButton.setOnMouseClicked(e -> {
            addNameToArrayList();
            clearAll();
        });
    }

    private void addNameToArrayList(){
        String name = nameTextField.getText().trim();

        RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();

        if(selectedGender.getText().equals("Male")){
            maleNamesArrayList.add(name);
        } else if (selectedGender.getText().equals("Female")) {
            femaleNamesArrayList.add(name);
        }
        showGenderNames();
    }

    private void showGenderNames(){
        RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();

        if(selectedGender.getText().equals("Male")){
            addArrayListToListView(maleNamesArrayList);
        } else if (selectedGender.getText().equals("Female")) {
            addArrayListToListView(femaleNamesArrayList);
        }
    }

    private void addArrayListToListView(ArrayList<String> arrayList){
        namesListView.getItems().setAll(arrayList);
    }

    private void clearAll(){
        nameTextField.clear();
    }

}
