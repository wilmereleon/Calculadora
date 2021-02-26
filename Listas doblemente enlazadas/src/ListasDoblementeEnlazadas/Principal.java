package ListasDoblementeEnlazadas;

import javax.swing.JOptionPane;

public class Principal {
	public static void main (String [] args) {
		Lista list = new Lista ();
		int opcion = 0;
		String x;
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Agregar un dato a la cabeza"
						+ "\n2. Mostrar los datos de la lista"
						+ "\n3. Salir", "Ingrese una de las opciones"));
			switch (opcion)	{
				case 1:
					try {
						x = (JOptionPane.showInputDialog(null, "Ingresa el dato", "Inserta nodo al inicio", 3));
						list.agregarALaCabeza(x);
					}
					catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					break;
				case 2:
					list.mostrarListaDeCabezaACola();
					break;
				case 3:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción incorrecta");
			}
			
			
					
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
			}
		}
		while (opcion != 3);
	}

}
