package opgave4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiOpgave4 extends Application {
    private TextField celsius = new TextField();
    private TextField fahrenhait = new TextField();

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("opgave4");
        GridPane pane = new GridPane();
        this.innerContents(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void innerContents(GridPane pane){
        Label labelCelcius = new Label("Celcius");
        pane.add(labelCelcius, 2,1);
        pane.add(celsius, 2,2);
        Label labelFahrenhait = new Label("Fahrenheit");
        pane.add(labelFahrenhait, 4, 1);
        pane.add(fahrenhait, 4,2);

        Button celciusToFahrenhait = new Button(">>");
        pane.add(celciusToFahrenhait, 3, 1);
        celciusToFahrenhait.setOnMouseClicked(e -> celciusToFahrenhait());

        Button fahrenheitToCelcius = new Button("<<");
        pane.add(fahrenheitToCelcius, 3,2);
        fahrenheitToCelcius.setOnMouseClicked(e -> fahrenheitToCelcius());
    }
    private void celciusToFahrenhait(){
        Double celsius = Double.parseDouble(this.celsius.getText());
        Double result = (celsius * 1.8) + 32;
        this.fahrenhait.setText(result.toString());
    }
    private void fahrenheitToCelcius(){
        Double fahrenhait = Double.parseDouble(this.fahrenhait.getText());
        Double result = ((fahrenhait - 32) * 5) / 9;
        this.celsius.setText(result.toString());
    }
}
