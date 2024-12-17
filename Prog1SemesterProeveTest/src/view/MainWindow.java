package view;

import domain.controller.Controller;
import domain.models.Område;
import domain.models.Plads;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import storage.Storage;

import java.util.ArrayList;

public class MainWindow extends Application {
    private final GridPane pane = new GridPane();
    private final ArrayList<Label> labelArrayList = new ArrayList<>();
    private final ListView<Plads> pladsListView = new ListView<>();

    private final ToggleGroup områdeToggleGroup = new ToggleGroup();
    private final ArrayList<RadioButton> områdeRadioButtons = new ArrayList<>();
    private final TextField nummerInputTextField = new TextField();
    private final Button opretButton = new Button("Opret");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("");
        initContents();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initContents(){
        setLabels();
        setPladserListView();
        setToggleGroup();
        setButtons();
        setTextField();
        opretButton.setOnAction(event -> {
            if(!områdeToggleGroup.getProperties().isEmpty()
                    || !nummerInputTextField.getText().isBlank()) {
                opretPlads();
                System.out.println("pladsLitView opdateret");
                pladsListView.getItems().setAll(Storage.getPladser());
            }
        });
    }

    private void setLabels(){
        String[] beskrivelse = {"Pladser:", "Område:", "Nummer:"};
        for(int labelNr = 1; labelNr <= beskrivelse.length; labelNr++){
            labelArrayList.add(new Label(beskrivelse[labelNr - 1]));
        }
        pane.add(labelArrayList.get(0), 0,0);
        pane.add(labelArrayList.get(1),0,3);
        pane.add(labelArrayList.get(2), 0,4);
    }

    private void setPladserListView() {
        pane.add(pladsListView, 0,2,2,1);
        pladsListView.getItems().setAll(Storage.getPladser());
    }

    private void setToggleGroup(){
        for(RadioButton radioButton : områdeRadioButtons){
            radioButton.setToggleGroup(områdeToggleGroup);
        }
    }

    private void setButtons(){
        String[] områdeString = {"Standard", "VIP", "Børne", "Turnering"};
        VBox radioButtonVBox = new VBox();
        for (int index = 0; index < områdeString.length; index++) {
            RadioButton radioButton = new RadioButton(områdeString[index]);
            radioButton.setToggleGroup(områdeToggleGroup);
            områdeRadioButtons.add(radioButton);
            radioButtonVBox.getChildren().add(radioButton);
        }
        pane.add(radioButtonVBox, 1,3);
        pane.add(opretButton, 1,5);
    }

    private void setTextField(){
        pane.add(nummerInputTextField, 1,4);
    }

    private void opretPlads(){
        System.out.println("opretPlads() kaldt");
        int valgtPladsNr = Integer.parseInt(nummerInputTextField.getText());
        RadioButton valgtRadioButton = (RadioButton) områdeToggleGroup.getSelectedToggle();
        String valgtOmrådeString = valgtRadioButton.getText();
        System.out.println("valgtOmrådeString: " + valgtOmrådeString);
        switch(valgtOmrådeString){
            case "Standard":
                Controller.opretPlads(valgtPladsNr, Område.STANDARD);
                break;
            case "VIP":
                Controller.opretPlads(valgtPladsNr, Område.VIP);
                break;
            case "Børne":
                Controller.opretPlads(valgtPladsNr, Område.BØRNE);
                break;
            case "Turnering":
                Controller.opretPlads(valgtPladsNr, Område.TURNERING);
                break;
            default:
                System.out.println("default i switch statement");
        }
    }
}