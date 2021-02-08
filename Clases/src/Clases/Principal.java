package Clases;

public class Principal {
public static void main (String [] args) {
	Vehiculo v1 = new Vehiculo("Megane", " Renault"); 
	Vehiculo v2 = new Vehiculo("Golf", " Volskwagen");
	Persona p1 = new Persona("Alejandro", 28, 175, 85.3);
	Persona p2 = new Persona("Laura", 28, 174, 80.0);
	v1.arrancar();
	v2.arrancar();
	p1.hablar("Hola");
	p2.hablar("Adiós");
	p1.conducir(v2);
	p2.conducir(v1);
	}
}
