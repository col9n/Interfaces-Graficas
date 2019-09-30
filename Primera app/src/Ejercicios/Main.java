package Ejercicios;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) throws Exception{

        Label labelNombreEquipoL = new Label("Nombre del equipo local");
        TextField textFieldEquipoL = new TextField();

        Label label1labelNombreEquipoV = new Label("Nombre del equipo visitante");
        TextField textFieldEquipoV = new TextField();

        Label label1labelDivision = new Label("Division");
        TextField textFieldDivision = new TextField();

        Label label1labelResultado = new Label("Resultado");
        TextField textFieldResultado = new TextField();

        Label label1labelFecha = new Label("Fecha");
        TextField textFieldFecha = new TextField();

        HBox HboxLocal = new HBox(labelNombreEquipoL);
        HBox HboxVisistante = new HBox(labelNombreEquipoL);
        HBox HboxDivision = new HBox(labelNombreEquipoL);
        HBox HboxResultado = new HBox(labelNombreEquipoL);
        HBox HboxFecha = new HBox(labelNombreEquipoL);

        VBox vboxPrincipal = new VBox(  labelNombreEquipoL,textFieldEquipoL,label1labelNombreEquipoV,textFieldEquipoV,
                                        label1labelDivision,textFieldDivision,label1labelResultado,textFieldResultado,
                                        label1labelFecha,textFieldFecha);

        TitledPane titledpane = new TitledPane("Dia del partido",vboxPrincipal);

        Scene scene = new Scene(titledpane,200,200);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }


}
