package ListasDoblementeEnlazadas;

public class Principal {
	private Nodo cabeza;
	private Nodo cola;
	
	public Principal () { // Se inician los nodos de cabeza y cola apuntando a null para asegurar que se reconozca el inicio y el final de la lista
		cabeza = null;
		cola = null;
	}
	
	public void agregarALaCola (int x) { // Agrega nodos al final de la lista
		if (!verificarListaVacia()) { // Verifica si el método verificarListaVacia está efectivamente vacía (!: símbolo para verificar métodos)
			cola = new Nodo (x, cola, null); // Recibe datos del constructor de 3 parámetros: «x», cola paunta a null, y cabeza va a cola
			cola.punteroAnterior.punteroSiguiente = cola;
		}
		else { // De no cumplirse la sentencia anterior, va al constructor vacío
			cabeza = new Nodo (x);
			cola = new Nodo (x);
		}
	}
	
	
	public boolean verificarListaVacia () { // Verifica si la lista está vacía
		return (cabeza == null); // Solop se necesita verificar uno de los estados para estimar si la lista está acia; se usa la cabeza
	}
}
