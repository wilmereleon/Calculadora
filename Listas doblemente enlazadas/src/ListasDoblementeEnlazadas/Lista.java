package ListasDoblementeEnlazadas;

import javax.swing.JOptionPane;

public class Lista {
	private Nodo cabeza;
	private Nodo cola;
	int contador = 0;
	int contadorPuntero = 0;
	
	public Lista () { // Se inician los nodos de cabeza y cola apuntando a null para asegurar que se reconozca el inicio y el final de la lista.
		cabeza = null;
		cola = null;
	}
	
	public void agregarALaCola (String x) { // Agrega nodos al final de la lista
		contador++;
		contadorPuntero++;
		if (!verificarListaVacia()) { // Verifica si el método verificarListaVacia está efectivamente vacía (!: símbolo para verificar métodos).
			cola = new Nodo (x, null, cola); // Recibe datos del constructor de 3 parámetros: «x», cola apunta a null, y cabeza va a cola.
			/* Recibe la nueva asignación de «cola» que viene del constructor; pasa de punteroAnterior a punteroSiguiente;
			 esto garantiza el desplazamiento de los datos:
			*/
			cola.punteroAnterior.punteroSiguiente = cola;
		}
		else { // De no cumplirse la sentencia anterior, va al constructor vacío
			cola = cabeza = new Nodo (x);
		}
	}
	
	public String mostrarPosicion(String x, int pos) { // Imprime el valor del incremento que da lugar a la posición y el elemento
		for(int i = 0; i < 5; i ++) {
			contadorPuntero ++;
		}
		contadorPuntero = pos;
		pos++;
		return x + pos;
		
		
	}
	/*
	public void agregarALaCabeza (String x, int contadorPuntero) { // Agrega nodos al inicio de la lista
		
		contadorPuntero++;
		if (!verificarListaVacia ()) { // Verifica si el método verificarListaVacia está efectivamente vacía (!: símbolo para verificar métodos).
			cabeza = new Nodo (x, cabeza, null); // Recibe datos del constructor de 3 parámetros: «x», cabeza apunta a null, y cola va a cabeza.
			// Recibe la nueva asignación de «cola» que viene del constructor; pasa de punteroAnterior a punteroSiguiente;
			// esto garantiza el desplazamiento de los datos:
			
			cabeza.punteroSiguiente.punteroAnterior = cabeza; 
		}
		else { // De no cumplirse la sentencia anterior, va al constructor vacío
			cabeza = cola = new Nodo (x);
		}
		
	}
	*/
	public void mostrarListaDeCabezaACola () { // Muestra la lista de cabeza a cola
		
		if(!verificarListaVacia ()) {
			String y = "♦";
			Nodo aux = cabeza;
			
			while (aux != null) {
				y = y + contadorPuntero + ". " + aux.dato + ", ";
				aux = aux.punteroSiguiente;
			}
			JOptionPane.showMessageDialog(null, y, "Lista de la cabeza a la cola: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void mostrarListaDeColaACabeza () { // Muestra la lista de cola a cabeza
		if(!verificarListaVacia ()) {
			String y = "...";
			Nodo aux = cola;
			while (aux != null) {
				y = y + "<"+ contadorPuntero + "|" + aux.dato + "|" + contadorPuntero +"> ---->";
				aux = aux.punteroAnterior;
			}
			JOptionPane.showMessageDialog(null, y, "Lista de la cola a la cabeza: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public String borrarElementoFinal () { // Método para borrar el último elemento en la lista
		String almacenado = cabeza.dato;
		if (cabeza == cola) {
			cabeza = null;
			cola = null;
			
		}
		else {
			cabeza = cabeza.punteroSiguiente;
			cabeza.punteroAnterior = null; // dirección cabeza <--- nodo anterior.
		}
		return almacenado;
		
	}
	
	public String borrarElementoInicial () { // Borra el elemento almacenado al incio de la lista
		String almacenado = cola.dato; // Se lamacena el dato de la cola en un String almacenado
		if (cabeza == cola) { // Se condiciona cabeza = cola; si son iguales, se borra el único elemento existente o no se ejecuta el método si está vacío
			cabeza = null;
			cola = null;
			
		}
		else {
			cola = cola.punteroAnterior; // De lo contrario, la cola apunta al puntero anterior para verificación
			cola.punteroSiguiente = null; // El puntero
		}
		return almacenado;
	}
	/*
	public void mostrarElementos () { // Comprobación de datos almacenados por consola en frío
		Nodo avanzar = cabeza;
		System.out.println("");
		while (avanzar != null) {
			System.out.print("<" + avanzar.dato + ">...");
			avanzar = avanzar.punteroSiguiente;
		}
	}
	*/
	public boolean verificarListaVacia () { // Verifica si la lista está vacía
		return (cabeza == null); // Solo se necesita verificar uno de los estados para estimar si la lista está acia; se usa la cabeza
	}

	public String contarElementos () { // Por medio del contador en el método de agregarALaCabeza se lleva el conteo de los datos ingresados
		String contadorString = Integer.toString(contador);
		return contadorString;
	}
	
	public String borrarElementoEsp (String x) { // Borra un dato especídifo de los ingresados
		//String x = "";
		if(!verificarListaVacia ()){ // 
			if(cabeza == cola && x == cabeza.dato) {
				cabeza = null;
				cola = null;
			}
			else if (x == cabeza.dato) { //Condición para mínimo dos datos ingresados para evaluación
				cabeza = cabeza.punteroSiguiente; // Apunta al siguiente, desde un dato ingresado
			}
			else {
				Nodo previo;
				Nodo temporal;
				previo = cabeza; // Se almacena contenido de variable «previo» en la cabeza, en el objecto «Nodo»
				temporal = cabeza.punteroSiguiente; // Se almacena contenido de variable «temporal» apuntando hacia el siguiente nodo, en el objecto «Nodo»
				while (temporal != null && temporal.dato != x) { // Recorre la lista siguiendo la restricción que temporal sea diferente a un nodo vacío y el dato temporal sea diferente del dato ingresado
					previo = previo.punteroSiguiente;
					temporal = temporal.punteroSiguiente;
				}
				if (temporal != null) { // Si hay dato almacenado...
					previo.punteroSiguiente = temporal.punteroSiguiente; // El dato en el nodo anterior asume posición de dato siguinete en «temporal»
					if(temporal == cola) {
						cola = previo; // Se mueve el dato que se quiere borrar al temporal
					}
				}
			}
		}
		return x;	
	}
	
	public boolean buscarElemento (String x) {
		Nodo temporal = cabeza;
		while (temporal != null && temporal.dato != x) {
			temporal = temporal.punteroSiguiente;
		}
		return temporal != null;
	}
	
	public void reemplazarElementoEsp (String x) {
		if (!verificarListaVacia ()) {
			if (cabeza == cola && x == cabeza.dato) {
				cabeza = cola = null;
			}
			else if (x == cabeza.dato) {
				cabeza = cabeza.punteroSiguiente;
			}
			else {
				Nodo previo;
				Nodo temporal;
				previo = cabeza;
				temporal = cabeza.punteroSiguiente;
				while (temporal != null && temporal.dato != x) {
					previo = previo.punteroSiguiente;
					temporal = temporal.punteroSiguiente;
				}
				if (temporal != null) {
					previo.punteroSiguiente = temporal.punteroSiguiente;
					if (temporal == cola) {
						cola = previo;
					}
				}
			}
		}
	}
}
