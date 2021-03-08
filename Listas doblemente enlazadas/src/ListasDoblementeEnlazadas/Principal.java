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
		String x = null;
		int pos = 0;
		do {
			try {
				opcion = (JOptionPane.showInputDialog(null,
						"1. Contar número de elementos de la lista"
						+ "\n2. Mostrar elemento en posición concreta de la lista"
						+ "\n3. Buscar elemento en la lista"
						+ "\n4. Imprimir elementos de la lista"
						+ "\n5. Insertar elemento a la lista"
						+ "\n6. Eliminar elemento específico"
						+ "\n7. Sacar elemento por posición en la lista"
						+ "\n8. Concatenar dos elementos"
						+ "\n9. Reemplazar elemento en la lista"
						+ "\n10. Salir", "Ingrese una de las opciones", JOptionPane.INFORMATION_MESSAGE));
			switch (opcion)	{
				case "1":
					if(!list.verificarListaVacia ()) {
						x = list.contarElementos();
						JOptionPane.showMessageDialog(null, "La cantidad de elementos en la lista es: " + x, "Mostrando cantidad de datos", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "2":
					break;
				case "3":
					x = (JOptionPane.showInputDialog(null, "Ingresa el dato que se quiere buscar", "Buscar dato en la lista", JOptionPane.INFORMATION_MESSAGE));
					list.buscarElemento(x);
					if(list.buscarElemento(x) == true) {
						JOptionPane.showMessageDialog(null, "El elemento " + x + " está en la lista", "Dato encontrado", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "El elemento " + x + " no está en la lista", "Dato no encontrado", JOptionPane.INFORMATION_MESSAGE);
					}
				case "4":
					if(!list.verificarListaVacia ()) {
						list.mostrarListaDeCabezaACola();
					}
					else {
						JOptionPane.showMessageDialog(null, "No hay elementos almacenados", "Vacío", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case "5":
					try {
						x = (JOptionPane.showInputDialog(null, "Ingresa el dato", "Inserta nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
						list.agregarALaCola(x);
					}
					catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					break;
				case "6":
					try {
						x = (JOptionPane.showInputDialog(null, "Ingresa el dato que se quiere eliminar", "Eliminar dato específico", JOptionPane.INFORMATION_MESSAGE));
						list.borrarElementoEsp(x);
					}
					catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					JOptionPane.showMessageDialog(null, "El elemento eliminado es: ", "Eliminar dato específico", JOptionPane.INFORMATION_MESSAGE);
					break;
				case "7":
					x = list.mostrarPosicion(x,pos);
					JOptionPane.showMessageDialog(null, "La cantidad de elementos en la lista es: " + x, "Mostrando cantidad de datos", JOptionPane.INFORMATION_MESSAGE);
					break;
				case "8":
					break;
				case "9":
					break;
				case "10":
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
		while (!opcion.equalsIgnoreCase("10"));
	}
}
