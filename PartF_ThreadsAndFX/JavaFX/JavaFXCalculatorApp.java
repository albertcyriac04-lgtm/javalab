// JavaFX Application Demo for a simple Calculator UI with Event Handling

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Calculator");

        Label header = new Label("JavaFX Calculator");
        header.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #1a5276;");

        TextField num1Field = new TextField();
        num1Field.setPromptText("First Number");

        TextField num2Field = new TextField();
        num2Field.setPromptText("Second Number");

        Label resultLabel = new Label("Result: ");
        resultLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #2e4053;");

        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");

        addBtn.setPrefWidth(50);
        subBtn.setPrefWidth(50);
        mulBtn.setPrefWidth(50);
        divBtn.setPrefWidth(50);

        HBox opsBox = new HBox(10, addBtn, subBtn, mulBtn, divBtn);
        opsBox.setAlignment(Pos.CENTER);

        // Event Listeners for Operations
        addBtn.setOnAction(e -> calculate(num1Field, num2Field, resultLabel, '+'));
        subBtn.setOnAction(e -> calculate(num1Field, num2Field, resultLabel, '-'));
        mulBtn.setOnAction(e -> calculate(num1Field, num2Field, resultLabel, '*'));
        divBtn.setOnAction(e -> calculate(num1Field, num2Field, resultLabel, '/'));

        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(header, num1Field, num2Field, opsBox, resultLabel);

        Scene scene = new Scene(layout, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate(TextField f1, TextField f2, Label resLabel, char op) {
        try {
            double n1 = Double.parseDouble(f1.getText().trim());
            double n2 = Double.parseDouble(f2.getText().trim());
            double res = 0;
            switch (op) {
                case '+': res = n1 + n2; break;
                case '-': res = n1 - n2; break;
                case '*': res = n1 * n2; break;
                case '/':
                    if (n2 == 0) {
                        resLabel.setText("Result: Cannot divide by zero!");
                        return;
                    }
                    res = n1 / n2;
                    break;
            }
            resLabel.setText("Result: " + res);
        } catch (NumberFormatException ex) {
            resLabel.setText("Result: Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
