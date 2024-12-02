package task3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GUIPersonAdministration extends Application {
    private final ListView<Person> personsListView = new ListView<>();

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

        Label personsLabel = new Label("Persons:");
        pane.add(personsLabel, 0,0);
        pane.add(personsListView,0,1);

        Button addPersonButton = new Button("Add person");
        pane.add(addPersonButton, 1,1);
        addPersonButton.setOnMouseClicked(e -> {
            GUIPerson guiPerson = new GUIPerson(personsListView);
            Stage secondaryStage = new Stage();
            guiPerson.start(secondaryStage);
        });
    }
}
