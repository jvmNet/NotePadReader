package notePad;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertBox {
    public static void alert() {
        Stage window = new Stage();

        window.setTitle("Error!");
        window.setResizable(false);

        Label label = new Label();
        label.setText("File not found!!!");

        Button button = new Button();
        button.setText("Close");
        button.setOnAction(e-> window.close());

        VBox container = new VBox(25);
        container.getChildren().addAll(label, button);
        container.setAlignment(Pos.CENTER);
        container.setPadding(new Insets(15,15,15,15));

        Scene scene = new Scene(container);
        window.setScene(scene);

        window.showAndWait();
    }

}
