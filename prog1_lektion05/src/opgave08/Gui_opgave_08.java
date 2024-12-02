package opgave08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_08 extends Application {
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
        // Variables for vertical lines
        int y_start = 180; // starting point
        int y_end = 110; // end point

        int max_lines = 10; // Max amount of lines

        // Iteration for vertical lines
        for (int i = 0; i < max_lines; i++) { // for loop to interate over number of lines
            int x = 10 + i * 15;
            gc.strokeLine(x, y_start, x, y_end); // modifies line (twich the dimention)
            y_start -= 12;
            y_end -= 6;
        }
    }
}
