package opgave10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_10 extends Application {
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
        int x = 50; // center: (x,y)
        int y = 100;
        int r = 40; // radius: r
        while (x <= 150) {
            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
            x = x + 25;
        }
    }
}
