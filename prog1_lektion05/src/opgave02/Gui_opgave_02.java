package opgave02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.logging.XMLFormatter;

public class Gui_opgave_02 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
    // Exercise 2

        int count = 0; // Current number of iterations
        int limit = 9; // Number of iterations

        final int x_point = 100; // constant varibale with x_point 100 - must be the same
        int x_degree = 20; // x value degree of line
        int y = 100;

        while(count <= limit){
            while(x_degree >= 20 && x_degree <= 180){
                gc.strokeLine(x_point, y, x_degree, y - 100);
                x_degree += 20; // degree now added with 20
            }
            count++; // Using additonal operator to count + 1
        }
    }
}
