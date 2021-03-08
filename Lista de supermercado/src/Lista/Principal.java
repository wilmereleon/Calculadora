package Lista;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
 * @ author: Wílmer E, León Díaz
 * Lista de supermercado usando listas doblemente enlazadas
 * 
 */
public class Principal extends Applet {
	
	/* 
	 * Se extienden características de la librería «Applet»
	*/
	class lista {
		Integer posicion = null; // Se crea la clase «Integer»: este encierra la variable «posicion» como «int» en un objeto.
		String producto = null; // Se crea un «String» con la variable «producto».
		lista siguiente = null; // Se crea el objeto «lista» con la variable «siguiente».
		
		String registro;
		
		/*
		 * Se crea el método «asigna_siguiente» que recibe un parámetro de tipo «lista».
		 */
		public void asigna_siguiente (lista nodos) { 
			siguiente = nodos; // Se asigna la variable «nodos» al objeto «siguiente».'
		}
		
		/*
		 * Se crea un método para imprimir los datos de la lista.
		 */
		public void imprime_nodo () {
			System.out.println ("Posición = " + posicion + "Producto = " + producto);
		}
		
		/*
		 * Se crea almacenador de datos ingresados.
		 */
		public String contenido () {
			registro = new String ("posicion = " + posicion + "Producto = " + producto + "\n"); // Se asigna valores ingresados a «registro».
			return registro;
		}
		
		/*
		 * Se crea constructor que retorna posición.
		 */
		public Integer retorna_posicion () {
			return posicion;
		}
		
		/*
		 * Se crea método que recibe posición.
		 */
		public void recibe_posicion (int pos) {
			posicion = new Integer (pos);
		}
		
		/*
		 * Se crea método que recibe producto.
		 */
		public void recibe_producto (String pro) {
			producto = pro;
		}
	}
	  
}
