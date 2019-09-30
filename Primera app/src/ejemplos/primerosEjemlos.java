package ejemplos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primerosEjemlos extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        /* ejer 1
        Label label = new Label("label");
        Label label1 = new Label("label1");
        Label label2 = new Label("label2");


        Label label3 = new Label("labe3");
        Label label4 = new Label("label4");
        Label label5 = new Label("label5");

        //No se puede meter un elemento en 2 nodos diferentes

        Button boton = new Button("click aqui");

        VBox vbox = new VBox(30,label,label1,label2); // hacerlos vertical
        HBox hboxPrincipal= new HBox();
        HBox hboxSecundario= new HBox(30,label3,label4,label5); //hacerlo horizontal

        hboxPrincipal.getChildren().addAll(hboxSecundario,vbox);

        Scene scene = new Scene( hboxPrincipal,200,200);
        stage.setScene(scene);
        stage.show();
        */


        Label label = new Label("Hoola");

        Button boton = new Button("click aqui");
        TextField textField = new TextField();

        VBox  vboxPrincipal= new VBox(label,boton,textField);
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label labelMensaje = new Label();
                labelMensaje.setText("hola"+textField.getText());
                vboxPrincipal.getChildren().add(labelMensaje);



            }
        });

        Scene scene = new Scene( vboxPrincipal,200,200);
        stage.setScene(scene);
        stage.show();

        /* 3 añadir labels alfinal
        Label label = new Label("Dale al boton y escribe tu texto");
        Button boton = new Button("click aqui");
        TextField textField = new TextField();
        Label label1 =new Label();
        VBox  vboxPrincipal= new VBox(label,textField,boton);
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label1 =new Label(("Hola "+textField.getText()));
                vboxPrincipal.getChildren().addAll(label1);

            }
        });
        Scene scene = new Scene( vboxPrincipal,200,200);
        stage.setScene(scene);
        stage.show();
        */

    }


    public static void main(String[] args) {
        launch(args);
    }


}
