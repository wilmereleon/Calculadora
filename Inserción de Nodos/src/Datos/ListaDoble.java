package Datos;

public class ListaDoble {
	 protected Nodo cabeza;
	 protected Nodo cola;
	 
	 public ListaDoble () {
		 cabeza = null;
		 cola = null;
	 }
	 
	 public ListaDoble insertarCabeza (TipoDato entrada) {
		 
	 }
	 
	 public ListaDoble insertarDespues (Nodo anterior, TipoDato entrada) {
		 Nodo nuevo;
		 
		 nuevo = new Nodo (entrada);
		 nuevo.adelante = anterior.adelante;
		 
		 if (anterior.adelante != null)
			 anterior.adelante.atras = nuevo;
		 anterior.adelante = nuevo;
		 nuevo.atras = anterior;
		 if (anterior == cola)
			 cola = nuevo;
		 return this;
	 }
	 public void eliminar (TipoDato entrada) {
		 
	 }
	 public void visualizar () {
		 
	 }
	 public void buscarLista (TipoDato destino) {
		 
	 }
	 
}