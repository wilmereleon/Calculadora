package Lista;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import Lista.Principal.lista;
	
/*
 * Esta clase se encarga de ejecutar las tareas en un entorno gráfico e interactivo.
 */
public class Nodo {
	lista cabeza = null;
	lista ultimo = null;
	lista posicion = null;
	
	/*
	 * Se crea el primer panel de interacción.
	 */
	Panel panelUno = new Panel (); // Se crea contenedor para los datos ingresados.
	TextField txtPosicion = new TextField (" "); // Se crea control para ingreso de cadena de caracteres en la variable «txtPosicion»: ingreso de posición.
	TextField txtProducto = new TextField (" ");// Se crea control para ingreso de cadena de caracteres en la variable «txtProdcuto»: ingreso de producto.
	Button insertar = new Button ("Insertar"); // Se crea botón para la ejecución de la tarea de inserción de datos.
	
	/*
	 * Se crea el segundo panel de interacción.
	 */
	Panel panelDos = new Panel ();
	TextArea texto = new TextArea (10, 60); // Se inserta tamaño de panel
	Button listado = new Button ("Ver lista");
	
	/*
	 * Se crea método que recibe los datos parametrizados en la interfaz gráfica creada en «panelUno».
	 */
	public void captura () {
		
	}
}
