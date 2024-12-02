package opgave3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiOpgave3 extends Application {
    private final TextField deposit = new TextField();
    private final TextField interestRate = new TextField();
    private final TextField attributions = new TextField();

    private final Label futureValue = new Label(String.valueOf(0));

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("opgave3");
        GridPane pane = new GridPane();
        this.innerContents(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void innerContents(GridPane pane) {
        Label labelDeposit = new Label("Deposit");
        pane.add(labelDeposit,0,0);
        pane.add(deposit, 1,0);

        Label labelInterestRate = new Label("Interest rate (%)");
        pane.add(labelInterestRate, 0, 1);
        pane.add(interestRate, 1,1);

        Label labelAttributions = new Label("Number of attributions");
        pane.add(labelAttributions, 0,2);
        pane.add(attributions, 1,2);

        Button calculate = new Button("Calculate future value");
        pane.add(calculate, 1,3);
        calculate.setOnMouseClicked(e -> calculateInterest());

        Label labelFutureValue = new Label("Future value");
        pane.add(labelFutureValue, 0,4);
        pane.add(futureValue, 1,4);

    }
    private void calculateInterest(){
        double deposit = Double.parseDouble(this.deposit.getText());
        double interestRate = 1 + (Double.parseDouble(this.interestRate.getText()) / 100);
        double attributions = Double.parseDouble(this.attributions.getText());

        double result = deposit;

        for(int numberOfAttributions = 0; numberOfAttributions < attributions; numberOfAttributions++){
            result *= interestRate;
        }

        futureValue.setText(String.valueOf(result));
    }
}
