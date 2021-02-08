package Clases;

public class Vehiculo {
private String marca;
private String modelo;

public Vehiculo (String ma, String mo) {
	marca = ma;
	modelo = mo;
}
public void arrancar() {
	System.out.println("Arrancando el vehículo. Marca: " + marca + ". Modelo:" + modelo);
}
public String getMarca () {
	return marca;
	}
}
