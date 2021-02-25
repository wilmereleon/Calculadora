package ListasDoblementeEnlazadas;

public class Nodo {
	public int dato;
	Nodo punteroAnterior;
	Nodo punteroSiguiente;
	
	// Constructor sin nodos:
	public Nodo (int x) {
		this (x, null, null); // Recibe los datos del constructor con 3 parámetros de entradas (x, an y sg); this asegura uso de constructor Nodo
	}
	
	// Constructor para recibir tres parámetros:
	public Nodo (int x, Nodo an, Nodo sg) { // «x» es el elemento que recibe la información; «an» y «sg», los que recibe elemento anterios y posterior
		dato = x;
		punteroAnterior = an;
		punteroSiguiente = sg;
	}
}
