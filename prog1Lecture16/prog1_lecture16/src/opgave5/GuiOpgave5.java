package opgave5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiOpgave5 extends Application {
    TextField textFieldName = new TextField();
    ArrayList<String> listOfNames = new ArrayList<>();
    TextArea textAreaNames = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("opgave5");
        GridPane pane = new GridPane();
        this.innerContents(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void innerContents(GridPane pane){
        pane.setGridLinesVisible(true);

        Label name = new Label("Name:");
        pane.add(name, 1,1);

        pane.add(textFieldName, 1,2);
        textFieldName.setOnKeyReleased(e -> {
            if(e.getCode() == KeyCode.ENTER){
                addNameToList();
            }
        });

        pane.add(textAreaNames, 1,4);

        Button addName = new Button("Add name");
        pane.add(addName, 1,3);
        addName.setOnMouseClicked(e -> addNameToList());
    }
    private void addNameToList(){
        listOfNames.add(textFieldName.getText());

        String name = "";

        for(String currentName : listOfNames){
            name += "• " + currentName + "\n";
        }

        textAreaNames.setText(name.toString().trim());

        textFieldName.clear();
    }
}