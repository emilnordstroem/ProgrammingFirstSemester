package opgave07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_opgave_07 extends Application {
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

    public static void exercise_05(GraphicsContext gc){
        final int x = 10; // constant value of x
        int y = 10; // vanue of y

        String word = "Datamatiker"; // Variable we will iterate over

        for(int i = 0; i <= word.length(); i++){ // for loop: iterates over the position of i
            gc.fillText(word.substring(0,i), x, y); // within method substring index 0 to index of i
            y += 15; // y = y + 15 => 'new line'
        }
    }
}
