
public class Empleado {
private String nombre;
private int numeroDeHijos;

public Empleado (String nb, int n) {
	nombre = nb;
	numeroDeHijos = n;
}

public void hablar (Empleado n) {
	System.out.println("El empleado "+ nombre + " tiene " + n.getNumeroDeHijos() + " hijos");
}
public int getNumeroDeHijos () {
	return numeroDeHijos;
	}

public String getNombre () {
	return nombre;
	}
}
