package opgave1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiOpgave1 extends Application {

    private final TextField firstName = new TextField();
    private final TextField lastName = new TextField();
    private final TextField fullName = new TextField();

    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("opgave 1");
        GridPane gridPane = new GridPane();
        this.content(gridPane);
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void content(GridPane pane){
        pane.setGridLinesVisible(true);

        Label labelFirstName = new Label("First name:");
        pane.add(labelFirstName, 0, 0);

        pane.add(firstName, 0,1);

        Label labelLastName = new Label("Last name:");
        pane.add(labelLastName, 1, 0);

        pane.add(lastName, 1,1);

        Label labelFullName = new Label("Full name:");
        pane.add(labelFullName, 0,3);

        pane.add(fullName, 0,4);

        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 1, 5);

        btnCombine.setOnMouseClicked(e -> combineFullName());
    }

    private void combineFullName(){
        String firstName = this.firstName.getText().trim();
        String lastName = this.lastName.getText().trim();
        fullName.setText(firstName + " " + lastName);
    }

}
