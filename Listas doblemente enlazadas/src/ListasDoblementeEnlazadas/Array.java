package ListasDoblementeEnlazadas;


public class Array {
  private String marca;
  private String modelo;
  
  public Array (String ma, String mo) {
    marca = ma;
    modelo = mo;
    
  }
  public void arrancar(){
    System.out.println("Arrancando el vehículo. la marca es " + marca + " y el modelo: " + modelo);
  }
  
  public String getMarca (){
    return marca;
  }
/*
 private Nodo cabecera;
 private Nodo ultimoNodo;
 
 public Array () {
 
 }
 
 public void annadirDato () {
 
 }
 
 public void annadirDato(int posicion, Object dato) {
 
 }
 
 public void borrarDato (Object dato) {
 
 }
 
 public int obtenerTamanno () {
 
 }
 
 public Object obtenerDato (int posicion) {
 
 }
 
 public void borrarDato (int posicion) {
 
 }
 * */
 
}