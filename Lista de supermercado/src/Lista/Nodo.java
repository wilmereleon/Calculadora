package Lista;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
	
/*
 * Esta clase se encarga de ejecutar las tareas en un entorno gráfico e interactivo.
 */
public class Nodo {
	int posicion;
	String producto;
	Nodo (int valor, String producto) {
		posicion = valor;
		this.producto = producto;
	}
	Nodo siguiente;
}
