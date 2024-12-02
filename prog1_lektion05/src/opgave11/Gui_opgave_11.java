package opgave11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_11 extends Application {
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
        drawCircle(gc);
    }

    public static void drawCircle (GraphicsContext gc){
        int x = 50; // value of x axis
        int y = 100; // value of y axis
        int r = 40; // radius: r

        int x_limit = 150; // Limit to value of x

        // While x less or equal to x_limit
        while (x <= x_limit) {
            gc.strokeOval(x - r, y - r, 2 * r, 2 * r); // circles

            int current = 0; // Current value of lines
            int line_limit = 2; // Limit to lines (one vertical, one horizontal)

            while (current <= line_limit){ // While loop to iterate over current value in comparison to limit
                gc.strokeLine(x, y - 5, x, y + 5); // vertical line
                gc.strokeLine(x + 5, y, x - 5, y); // horizontal line
                current++; // control value
            }
            x = x + 25; // control value
        }
    }
}
