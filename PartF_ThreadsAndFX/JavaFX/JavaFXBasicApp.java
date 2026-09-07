// JavaFX Application Demo demonstrating Stage, Scene, Layout (VBox, HBox), Controls (Label, Button, TextField), and Event Handling

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXBasicApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Interactive Demo");

        // Labels & Controls
        Label titleLabel = new Label("Welcome to JavaFX Application!");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        Label nameLabel = new Label("Enter Your Name:");
        TextField nameField = new TextField();
        nameField.setPromptText("e.g. John Doe");

        Label greetingLabel = new Label();
        greetingLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #27ae60;");

        Button submitBtn = new Button("Greet Me");
        Button clearBtn = new Button("Clear");

        submitBtn.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-weight: bold;");
        clearBtn.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-weight: bold;");

        // Event Handling
        submitBtn.setOnAction(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                greetingLabel.setText("Hello, " + name + "! Welcome to Java GUI Development.");
            } else {
                greetingLabel.setText("Please enter your name first!");
            }
        });

        clearBtn.setOnAction(e -> {
            nameField.clear();
            greetingLabel.setText("");
        });

        // Layouts
        HBox buttonBox = new HBox(10, submitBtn, clearBtn);
        buttonBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(titleLabel, nameLabel, nameField, buttonBox, greetingLabel);

        // Scene & Stage setup
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
