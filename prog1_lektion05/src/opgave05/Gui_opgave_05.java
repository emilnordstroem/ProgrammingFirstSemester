package opgave05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_05 extends Application {
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
        exercise_05(gc);

    }

    // Make with while loop
    public static void exercise_05(GraphicsContext gc){
        final int x = 10; // constant value of x
        int y = 10; // vanue of y
        int index = 0;

        String word = "Datamatiker"; // Variable we will iterate over

        while(index <= word.length()){ // while loop: iterates over the position of index
            gc.fillText(word.substring(0,index), x, y); // within method substring index 0 to index of i
            y += 15; // y = y + 15 => 'new line'
            index++; // additional operator on control value
        }
    }
}
