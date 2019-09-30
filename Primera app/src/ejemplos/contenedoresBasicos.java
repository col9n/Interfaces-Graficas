package ejemplos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class contenedoresBasicos extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Label label = new Label("Contenido TitledPane");
        VBox vbox = new VBox(label);
        TitledPane titledpane = new TitledPane("Titulo",vbox);

        Scene scene = new Scene(titledpane,200,200);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }


}
