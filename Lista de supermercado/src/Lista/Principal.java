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
	class lista {
		Integer posicion = null;
		String producto = null;
		lista siguiente = null;
		
		String registro;
		
		public int retornaPosicion () {
			return posicion.intValue();
		}
		
		public void asignaSiguiente (lista nodos) {
			siguiente = nodos;
		}
		
		public void imprimeNodo () {
			System.out.println("Posicion: "+ posicion + "producto" + producto);
		}
		
		public String contenido () {
			registro = new String ("Posicion: "+ posicion + "producto" + producto + "\n");
			return registro;
		}
		
		public void recibePosicion (int pos) {
			posicion = new Integer(pos);
		}
		
		public void recibeProducto (String pro) {
			producto = pro;
		}
		
		public lista retornaSiguiente () {
			return siguiente;
		}
	}
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
			paneles[j].setForeground(Color.green);
			titulo[j].setBackground(Color.green);
			titulo[j].setEditable(false);
			paneles[j].add(titulo[j]);
			paneles[j].setLayout(new GridLayout(6, 1, 15, 20));
			
		}
		paneles [2].setLayout(new GridLayout (2, 1));
		paneles [1].setBackground(Color.yellow);
		for (int j = 0; j < 4; j++) {
			numeros [j] = new TextField ("Número " + (j + 1));
			paneles [0].add(numeros [j]);
		}
		paneles [1].add(lista);
		lista.setVisible(false);
		paneles [1].add(inserteUno);
		inserteUno.setEditable(false);
		paneles [1].add(inserteDos);
		
		inserteUno.setVisible(false);
		inserteDos.setVisible(false);
		
		botones [0].addActionListener(new crear());
		
		for (int j = 0; j < 2; j++) {
			paneles [j].add(botones[j]);
		}
		botones [1].setVisible(false);
		botones [1].addActionListener(new insertar());
		paneles [2].add(listaPeque);
		listaPeque.setVisible(false);
	}
	class crear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (creada == 0) {
				for (int k = 0; k < 4; k++) {
					lista.add((numeros [k].getText ()).trim());
					System.out.println("Luis ");
					numeros [k].setEditable(false);
				}
				paneles [1].add(lista);
				creada = 1;
				inserteUno.setVisible(true);
				inserteDos.setVisible(true);
				botones [1].setVisible(true);
				botones [0].setVisible(false);
				lista.setVisible(true);
				
				for (int l = 0; l < 4; l++) {
					if (l == 0) {
						raiz = new Nodo (l + 1, numeros [l].getText().trim());
						itera = raiz;
					}
					else {
						nuevo = new Nodo (l + 1, numeros [l].getText().trim());
						itera.siguiente = nuevo;
						itera = nuevo;
					}
				}
			}
		}
	}
	class insertar implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			botones [1].setVisible(false);
			botones [2].setVisible(true);
			inserteDos.setEditable(false);
			listaPeque.setVisible(true);
			int seleccion = lista.getSelectedIndex() + 1;
			
			itera = raiz;
			unionUno = raiz;
			unionDos = raiz.siguiente;
			while (itera != null) {
				if (itera.posicion == seleccion) {
					unionUno = itera;
					unionDos = itera.siguiente;
					nuevo = new Nodo(5, (inserteDos.getText()).trim());
				unionUno.siguiente = nuevo;
				nuevo.siguiente = unionDos;
					itera = itera.siguiente;
					unionUno = itera;
					unionDos = itera.siguiente;
					System.out.println("dentrob" + itera.posicion);
				}
				System.out.println("fuera" + itera.posicion);
				itera = itera.siguiente;
			}
			imprime ();
		}
		
	}
	public void imprime () {
		itera = raiz;
		int y = 1;
		while (itera != null) {
			listaPeque.add("" + itera.posicion + "" + itera.producto);
			itera = itera.siguiente;
			y++;
		}
	}
}
