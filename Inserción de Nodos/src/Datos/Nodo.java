package Datos;

public class Nodo {
	protected TipoDato dato;
	protected Nodo adelante;
	protected Nodo atras;
	
	public Nodo (int entrada) {
		dato = entrada;
		adelante = null;
		atras = null;
	}
	

}
