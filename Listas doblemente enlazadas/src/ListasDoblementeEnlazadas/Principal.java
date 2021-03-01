package ListasDoblementeEnlazadas;

import javax.swing.JOptionPane;
/**
 * 
 * Esta es la clase «main» que ejecuta las tareas por medio de un menú
 * @author Wílmer Edilson León Díaz
 *
 */


public class Principal {
	public static void main (String [] args) {
		Lista list = new Lista ();
		String opcion = " ";
		String x;
		do {
			try {
				opcion = (JOptionPane.showInputDialog(null,
						"1. Agregar un dato a la cabeza"
						+ "\n2. Agregar un dato a la cola"
						+ "\n3. Mostrar lista de cabeza a cola"
						+ "\n4. Mostrar lista de cola a cabeza"
						+ "\n5. Borrar dato de la cabeza"
						+ "\n6. Borrar dato de la cola"
						+ "\n7. Cantidad de elementos en la lista"
						+ "\n8. Salir", "Ingrese una de las opciones", JOptionPane.INFORMATION_MESSAGE));
			switch (opcion)	{
				case "1":
					try {
						x = (JOptionPane.showInputDialog(null, "Ingresa el dato", "Inserta nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
						list.agregarALaCabeza(x);
					}
					catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					break;
				case "2":
					try {
						x = (JOptionPane.showInputDialog(null, "Ingresa el dato", "Inserta nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
						list.agregarALaCola(x);
					}
					catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					break;
				case "3":
					if(!list.verificarListaVacia ()) {
						list.mostrarListaDeCabezaACola();
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "4":
					if(!list.verificarListaVacia ()) {
						list.mostrarListaDeColaACabeza();
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "5":
					if(!list.verificarListaVacia ()) {
						x = list.borrarElementoInicial();
						JOptionPane.showMessageDialog(null, "El dato eliminado es: " + x, "Borrar dato inicial", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
				}
					break;
				case "6":
					if(!list.verificarListaVacia ()) {
						x = list.borrarElementoFinal();
						JOptionPane.showMessageDialog(null, "El dato eliminado es: " + x, "Borrar dato final", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "7":
					if(!list.verificarListaVacia ()) {
						x = list.contarElementos();
						JOptionPane.showMessageDialog(null, "La cantidad de elementos en la lista es: " + x, "Mostrando cantidad de datos", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "8":
					JOptionPane.showMessageDialog(null, "Finalización", "Final", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "La opción no hace parte del menú", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
			}
			
					
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
			}
		}
		while (!opcion.equalsIgnoreCase("8"));
	}

}
