package ListasDoblementeEnlazadas;

import javax.swing.JOptionPane;

public class Lista {
	private Nodo cabeza;
	private Nodo cola;
	int contador = 0;
	
	public Lista () { // Se inician los nodos de cabeza y cola apuntando a null para asegurar que se reconozca el inicio y el final de la lista.
		cabeza = null;
		cola = null;
	}
	
	public void agregarALaCola (String x) { // Agrega nodos al final de la lista
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
	
	
	public void agregarALaCabeza (String x) { // Agrega nodos al inicio de la lista
		contador++;
		if (!verificarListaVacia ()) { // Verifica si el método verificarListaVacia está efectivamente vacía (!: símbolo para verificar métodos).
			cabeza = new Nodo (x, cabeza, null); // Recibe datos del constructor de 3 parámetros: «x», cabeza apunta a null, y cola va a cabeza.
			/* Recibe la nueva asignación de «cola» que viene del constructor; pasa de punteroAnterior a punteroSiguiente;
			 esto garantiza el desplazamiento de los datos:
			*/
			cabeza.punteroSiguiente.punteroAnterior = cabeza; 
		}
		else { // De no cumplirse la sentencia anterior, va al constructor vacío
			cabeza = cola = new Nodo (x);
		}
	}
	
	public void mostrarListaDeColaACabeza () { // Muestra la lista de cabeza a cola
		if(!verificarListaVacia ()) {
			String y = "<...>";
			Nodo aux = cabeza;
			while (aux != null) {
				y = y + "[" + aux.dato + "] <...>";
				aux = aux.punteroSiguiente;
			}
			JOptionPane.showMessageDialog(null, y, "Lista de la cabeza a la cola: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void mostrarListaDeCabezaACola () { // Muestra la lista de cola a cabeza
		if(!verificarListaVacia ()) {
			String y = "...";
			Nodo aux = cola;
			while (aux != null) {
				y = y + "[" + aux.dato + "] ...";
				aux = aux.punteroAnterior;
			}
			JOptionPane.showMessageDialog(null, y, "Lista de la cola a la cabeza: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public String borrarElementoFinal () {
		String almacenado = cabeza.dato;
		if (cabeza == cola) {
			cabeza = null;
			cola = null;
			
		}
		else {
			cabeza = cabeza.punteroSiguiente;
			cabeza.punteroAnterior = null;
		}
		return almacenado;
		
	}
	
	public String borrarElementoInicial () {
		String almacenado = cola.dato;
		if (cabeza == cola) {
			cabeza = null;
			cola = null;
			
		}
		else {
			cola = cola.punteroAnterior;
			cola.punteroSiguiente = null;
		}
		return almacenado;
	}
	
	public void mostrarElementos () {
		Nodo avanzar = cabeza;
		System.out.println("");
		while (avanzar != null) {
			System.out.print("[" + avanzar.dato + "]...");
			avanzar = avanzar.punteroSiguiente;
		}
	}
	
	public boolean verificarListaVacia () { // Verifica si la lista está vacía
		return (cabeza == null); // Solop se necesita verificar uno de los estados para estimar si la lista está acia; se usa la cabeza
	}

	public String contarElementos () { // por medio del contador en el método de agregarALaCabeza se lleva el conteo de los datos ingresados
		String contadorString = Integer.toString(contador);
		return contadorString;
	}
}
