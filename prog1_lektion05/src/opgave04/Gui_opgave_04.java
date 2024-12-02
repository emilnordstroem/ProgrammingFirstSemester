package opgave04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_04 extends Application {
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
        // Exercise 4
        // figure_01(gc);
        // figure_02(gc);
        // figure_03(gc);
    }

    public static void figure_01(GraphicsContext gc) {
        int x = 100; // center of X
        int y = 100; // center of Y
        int r = 20; // radius starting point

        int max_radius = 100; // max value of r

        while (r <= max_radius) { // lower of equal to max_radius
            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
            r += 20;
        }
    }

    public static void figure_02(GraphicsContext gc) {
        int x = 20; // center of x - starting point
        final int y = 100; // constant center of Y
        int r = 10; // radius starting point

        // Variables for max values
        int max_radius = 80;
        int max_x = 90;

        // Nested while loop...
        while (x <= max_x) { // value of x lower of equal to 90
            while (r <= max_radius) { // r is lower or equal to 80
                gc.strokeOval(x, y - r, 2 * r, 2 * r);
                r += 10;
            }
            x += 10;
        }
    }

    public static void figure_03(GraphicsContext gc) {
        int x = 80; // center of X
        int y = 50; // center of Y
        int w = 40; // width
        int h = 80; // height

        int max_width = 200;

        while (w <= max_width) { // lower of equal to max_radius
            gc.strokeOval(x, y, w, h);
            x -= 10;
            w += 20;
        }
    }
}