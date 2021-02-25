package ListasDoblementeEnlazadas;

public class Nodo {
	public int dato;
	Nodo siguiente;
	Nodo anterior;
	public Nodo (int x) {
		this (x, null, null); // Recibe los datos del constructor con 3 parametros de entradas (x, an y sg)
	}
	public Nodo (int x, Nodo an, Nodo sg) {
		dato = x;
		anterior = an;
		siguiente = sg;
	}
}
