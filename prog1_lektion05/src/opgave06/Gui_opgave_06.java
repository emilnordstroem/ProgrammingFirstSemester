package opgave06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_06 extends Application {
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
        int y_start = 100; // starting point
        int y_end = 110; // end point
        int max_lines = 11; // Max amount of lines

        // Iteration for vertical lines
        for (int i = 0; i < max_lines; i++) { // for loop to interate over number of lines
            int x = 10 + i * 15;
            if(i % 5 == 0){ // if remaining of position i equals 0
                gc.strokeLine(x, y_start - 3, x, y_end + 3); // modifies line (twich the dimention)

                int position = i; // position of i : 0, 5, 10 ...
                String number = String.valueOf(position); // Stringify integer i into string - value of position
                gc.fillText(number, x, y_end + 15); // value of number will be shown
            } else {
                gc.strokeLine(x, y_start, x, y_end);
            }
        }

        // Varibales for horizontal line
        int x_line = 0;
        final int y_line = 105;
        int line_ending_point = 170;

        // Horizontal line
        gc.strokeLine(x_line + line_ending_point, y_line, x_line, y_line);

        // Varibales for arrow
        int x_arrow = line_ending_point;
        int y_arrow = y_line;

        // Ending arrow
        gc.strokeLine(x_arrow, y_arrow,x_arrow - 5, y_arrow + 5);
        gc.strokeLine(x_arrow, y_arrow, x_arrow - 5, y_arrow - 5);
    }
}
