package opgave09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_09 extends Application {
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
        int y_start = 110; // starting point
        int y_end = 120; // end point

        int current_line = 0;
        int max_lines = 12; // Max amount of lines

        while(current_line <= max_lines){
            int x = 10 + current_line * 15;
            gc.strokeLine(x, y_start, x, y_end); // modifies line (twich the dimention)
            y_start -= 2;
            y_end += 5;
            current_line++;
        }
    }
}
