package Clases;

public class Persona {
private String nombre;
private int edad;
private int altura;
private double peso;

public Persona (String n, int e, int a, double d) {
	nombre = n;
	edad = e;
	altura = a;
	peso = d;
}
public void hablar (String mensaje) {
	System.out.println(mensaje);
}
public void conducir(Vehiculo v) {
	System.out.println("Soy " + nombre + " tengo " + edad +  " años, una altura de " + altura + " cm, un peso de " + peso + " kg y estoy conduciendo un " + v.getMarca ());
}
public float obtenerIMC () {
	float alturaEnMetros = (float) altura / 100; // Almacena la conversión de metros a centímetros
	float alturaEnMetrosCuadrado = alturaEnMetros * alturaEnMetros; // Calculo de la variable al cuadrado
	double imc = peso / alturaEnMetrosCuadrado;
	return (float) imc;
}
}
