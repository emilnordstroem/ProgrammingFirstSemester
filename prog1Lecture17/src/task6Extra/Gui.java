package task6Extra;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

public class Gui extends Application {

    Slider redSlider = new Slider(0,250,0);
    Slider greenSLider = new Slider(0,250,0);
    Slider blueSlider = new Slider(0,250,0);



    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Color manipulator");
        GridPane primaryPane = new GridPane();
        this.innerContents(primaryPane);
        Scene firstScene = new Scene(primaryPane);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }

    private void innerContents(GridPane pane){
        Label redLabel = new Label("Red:");
        pane.add(redLabel,0,0);
        pane.add(redSlider, 1,0);
        redSlider.valueProperty().addListener(
                e -> sliderValueChange(pane)
        );

        Label greenLabel = new Label("Green:");
        pane.add(greenLabel,0,1);
        pane.add(greenSLider,1,1);
        greenSLider.valueProperty().addListener(
                e -> sliderValueChange(pane)
        );

        Label blueLabel = new Label("Blue");
        pane.add(blueLabel,0,2);
        pane.add(blueSlider,1,2);
        blueSlider.valueProperty().addListener(
                e -> sliderValueChange(pane)
        );
    }

    private void sliderValueChange(GridPane pane){
        int red = redSlider.valueProperty().intValue();
        int green = greenSLider.valueProperty().intValue();
        int blue = blueSlider.valueProperty().intValue();

        String color = String.format("#%02X%02X%02X", red, green, blue);


        pane.setStyle("-fx-background:" + color);
    }
}
