package opgave01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_01 extends Application {
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
    // Exercise 1 - Make with while loop

        // First arrow
        int x1 = 100;
        int y1 = 75;

        gc.strokeLine(x1, y1,x1 + 10, y1 + 4);
        gc.strokeLine(x1, y1, x1 + 10, y1 - 4);

        // Second arrow
        int x2 = 100;
        int y2 = 125;

        gc.strokeLine(y2, x2, y2 + 10, x2 + 4);
        gc.strokeLine(y2, x2, y2 + 10, x2 - 4);

        // Third arrow
        int x3 = 20;
        int y3 = 50;

        gc.strokeLine(x3, y3, x3 + 10, y3 + 4);
        gc.strokeLine(x3, y3, x3 + 10, y3 - 4);
    }
}
