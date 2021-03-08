package ListasDoblementeEnlazadas;

public class Nodo {
	public String dato;
	Nodo punteroSiguiente;
	Nodo punteroAnterior;
	
	// Constructor sin nodos:
	public Nodo (String x) {
		this (x, null, null); // Recibe los datos del constructor con 3 parámetros de entradas (x, an y sg); this asegura uso de constructor Nodo
	}
	
	// Constructor para recibir tres parámetros:
	public Nodo (String x, Nodo sg, Nodo an) { // «x» es el elemento que recibe la información; «an» y «sg», los que recibe elemento anterios y posterior
		dato = x;
		punteroSiguiente = sg;
		punteroAnterior = an;
	}
	
}
