
import javafx.application.Application;
import javafx.stage.Stage;     
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PruebaJavaFX extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    //recibe un parámetro que va ha ser la ventana de la aplicación.
    public void start(Stage primaryStage)
    {
        //título de la ventan.
        primaryStage.setTitle("Prueba JavaFX");

        Button boton = new Button("Saludo");
        
        //asigna la imagen a la escena.
        Image fileImage = new Image("0.jpg");
        ImageView imagen = new ImageView(fileImage);   

        boton.setOnAction(event -> {
                System.out.println("Hola");
                //el objeto imagen antes declarado vale para insertat la nueva imagen al activar el botón
                imagen.setImage(new Image("1.jpg"));
            });

        /** 
        Forma antigua de conseguir el mismo resultado que en la línea 26    
        boton.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent event)
        {
        System.out.println("Hola");
        imagen.setImage(new Image("1.jpg"));
        }
        });
         **/
        //situa al botón en la escena.
        boton.setLayoutY(30);
        boton.setLayoutX(30);
        //dá tamaño al botón.
        boton.setPrefSize(100, 50);

        //Group contenedor es un tipo de contenedor que colocamos dentro de la escena.
        Group contenedor = new Group();
        //El grupo que se desea agregar, y el tamaño ancho y alto y root que es el contenedor
        Scene scene = new Scene(contenedor, 500, 375);

        contenedor.getChildren().add(imagen);    
        contenedor.getChildren().add(boton);

        primaryStage.setScene(scene); 
        primaryStage.show();

    }

}
