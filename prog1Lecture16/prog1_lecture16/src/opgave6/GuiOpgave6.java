package opgave6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiOpgave6 extends Application {
    private TextArea carsListView = new TextArea();
    private ListView<Car> carsList = new ListView<>();

    private ListView<String> brandsList = new ListView<>();
    private ArrayList<String> brandnames = new ArrayList<>();

    private final TextField modelTextField = new TextField();
    private final CheckBox electricCheckBox = new CheckBox();
    private final TextField priceTextField = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("opgave 6");
        GridPane primaryPane = new GridPane();
        this.innerContentsFirstPage(primaryPane);
        Scene firstScene = new Scene(primaryPane);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }

    private void innerContentsFirstPage(GridPane pane){
        pane.setGridLinesVisible(true);

        pane.add(carsListView, 0, 0);
        Button addCarBtn = new Button("Add Car");
        pane.add(addCarBtn, 0,1);
        addCarBtn.setOnMouseClicked(e -> openSecondaryStage());
    }

    private void openSecondaryStage(){
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Add car");
        GridPane secondaryPane = new GridPane();
        this.innerContentsSecondPage(secondaryPane);
        Scene secondScene = new Scene(secondaryPane);
        secondaryStage.setScene(secondScene);
        secondaryStage.show();
    }

    private void innerContentsSecondPage(GridPane pane){
        pane.setGridLinesVisible(true);

        Label brandLabel = new Label("Brand");
        pane.add(brandLabel, 0,0);
        Label modelLabel = new Label("Model");
        pane.add(modelLabel,0,1);
        Label electricLabel = new Label("Electric");
        pane.add(electricLabel, 0,2);
        Label priceLabel = new Label("Price per day");
        pane.add(priceLabel,0,3);

        pane.add(brandsList,1,0);
        addBrandNamesList();
        brandsList.getItems().setAll(brandnames);
        pane.add(brandsList, 1,2);

        pane.add(modelTextField,1,1);
        pane.add(electricCheckBox, 1,2);
        pane.add(priceTextField, 1,3);

        Button createCarBtn = new Button("Create");
        pane.add(createCarBtn, 0,4);
        createCarBtn.setOnMouseClicked(e -> {
            createCarObject();
            presentCarObject();
            clearAllFields();
        });
    }

    private void createCarObject() {
        String brand = brandsList.getSelectionModel().getSelectedItem();
        String model = modelTextField.getText().trim();
        boolean electric = electricCheckBox.isSelected();
        int price = Integer.parseInt(priceTextField.getText().trim());

        Car car = new Car(brand, model, electric, price);
        carsList.getItems().add(car);
    }
    private void presentCarObject(){
        String carString = "";

        for(Car car : carsList.getItems()){
            carString += car.toString() + "\n";
        }

        carsListView.setText(carString.trim());
    }
    private void clearAllFields(){
        modelTextField.clear();
        electricCheckBox.setSelected(false);
        priceTextField.clear();
    }
    private ArrayList<String> addBrandNamesList(){
        brandnames.add("Audi");
        brandnames.add("BMW");
        brandnames.add("Honda");
        brandnames.add("Mercedes");
        brandnames.add("Porsche");
        brandnames.add("Tesla");
        return brandnames;
    }
}