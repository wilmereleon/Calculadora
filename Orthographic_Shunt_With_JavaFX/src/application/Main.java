package application;
	
import com.sun.prism.Image;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application{
	
	//@Override
	//public void handle(ActionEvent event) { // Se esqueletea el evento con el botón que redireccionara a otro estado del juegfo
		//if(event.getSource()==button) {
		//System.out.println("Escoja la respuesta correcta");	
		//}
		
//	}
	Button button;
	
	
	
	//@Override
	//public void start(Stage primaryStage) {
		//try {
			//Image img = new Image("application/Logo.png");
			//ImageView imgView = new ImageView(img);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			//root.setCenter(imgView);
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
		//} catch(Exception e) {
			//e.printStackTrace();
		//}
	//}
	//
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		primaryStage.setTitle("Ortografía por derivación");
		
		button = new Button();
		
		
		
		button.setText("Empezar"); // Se cambie el botón "Iniciar" por "Empezar"
		
		
		button.setOnAction(e ->System.out.println("Poner evento para enviar a algunas de las clases"));	//En esta sección de direccione el enlace a la clase Despliegue de interfaz
		//gráfica, que mostraría el primer escenario de 
	
		
		StackPane layout = new StackPane ();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 500, 350); // Tamaño del entorno de despliegue de la ventana del juego
		primaryStage.setScene(scene);
		primaryStage.show(); //Muestra el escenario
		
	}
	
	
	
}
