package opgave2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiOpgave2 extends Application {
    private int counterValue = 0;
    private Label counterLabel = new Label(String.valueOf(counterValue));

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("opgave2");
        GridPane pane = new GridPane();
        this.counterContent(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void counterContent(GridPane pane){
        pane.setGridLinesVisible(true);

        Label number = new Label("Number");
        pane.add(number, 0,2);

        pane.add(counterLabel, 1, 2);

        Button oneUp = new Button("+1");
        pane.add(oneUp, 1,1);
        oneUp.setOnMouseClicked(e -> counterOneUp());

        Button oneDown = new Button("-1");
        pane.add(oneDown, 1, 3);
        oneDown.setOnMouseClicked(e -> counterOnedown());
    }
    private void counterOneUp(){
        counterLabel.setText(String.valueOf(counterValue++));
    }
    private void counterOnedown(){
        counterLabel.setText(String.valueOf(counterValue--));
    }
}
