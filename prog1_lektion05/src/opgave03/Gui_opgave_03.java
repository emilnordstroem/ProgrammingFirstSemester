package opgave03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_03 extends Application {
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
        // vertical(gc);
        // horizontal(gc);
        // decreasing(gc);
    }

    public static void vertical(GraphicsContext gc){
    // Exercise 3: A
        int x = 0; // starting point
        int y = 100; // end point on y-axis
        int limit = 100; // limit of x-axis value

        while(x <= limit){
            gc.strokeLine(x, y, x, y - 200);
            x += 20;
        }
    }

    public static void horizontal(GraphicsContext gc) {
    // Exercise 3: B
        int x = 200; // Starting point of X
        int y = 0; // Starting point of Y
        int limit = 100; // limit of x-axis value

        while(y <= limit){
            gc.strokeLine(x, y, x - 200, y);
            y += 20;
        }
    }

    public static void decreasing(GraphicsContext gc) {
    // Exercise 3: C

        int x_starting = 95;
        int x_end = 105;
        int y = 0; // y starting point

        int count = 0; // counting iterations
        int limit = 5; // limit of iterations

        while(count <= limit){
            gc.strokeLine(x_starting, y, x_end, y);
            x_starting -= 10; // decreasing starting point with 10
            x_end += 10; // increading ending point with 10
            y += 20; // y increase due to position on graph
            count++;
        }
    }
}
