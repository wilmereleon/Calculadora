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
	Nodo raiz, itera, nuevo, unionUno, unionDos;
	Panel paneles [] = new Panel [3]; // Se crea un arreglo para los paneles con 4 elementos.
	Panel panelDos = new Panel ();
	Panel panelTres = new Panel ();
	TextField titulo [] = new TextField [3];
	int creada = 0;
	
	TextField numeros [] = new TextField [4];
	List lista;
	TextField inserteUno = new TextField ("Inserte valor");
	TextField inserteDos = new TextField ("Número 5");
	List listaPeque = new List(5); // Se crea limitación de 5 elementos en «Inserte valor».
	
	Button botones [] = new Button [2]; // Se crean tres botones.
	public void paint (Graphics g) {
		
	}
	
	public void init () { // Método de inicialiazación
		
		setLayout (new GridLayout (1, 3));
		lista = new List (4);
		
		titulo [0] = new TextField ("Crear lista de 4");
		titulo [1] = new TextField ("Insertar en posición");
		titulo [2] = new TextField ("Ver lista");
		
		botones [0] = new Button ("Crear");
		botones [1] = new Button ("Insertar");
		
		for (int j = 0; j < 3; j++) { // Se realiza un recorrido en los tres elementos de la lista
			paneles [j] = new Panel ();
			add(paneles [j]);
			paneles[j].setForeground(Color.blue);
			titulo[j].setBackground(Color.blue);
			titulo[j].setBackground(Color.blue);
			paneles[j].setForeground(Color.blue);
			paneles[j].setForeground(Color.blue);
			paneles[j].setForeground(Color.blue);
		}
		
		
	}
}
