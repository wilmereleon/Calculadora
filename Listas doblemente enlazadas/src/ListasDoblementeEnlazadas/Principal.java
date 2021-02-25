package ListasDoblementeEnlazadas;


public class Principal {
  public static void main(String[] args) {
    Array a = new Array("Ohkj", "sjdkljfklsd");
    Array b = new Array("Ohkj", "sjdkljfklsd");
    Array c = new Array("Ohkj", "sjdkljfklsd");
    Array arrayVehiculo[] = new Array[3];
    arrayVehiculo[0] = a;
    arrayVehiculo[1] = b;
    arrayVehiculo[2] = c;
    
    for (int i = 0; i < arrayVehiculo.length; i++){
      Array v = arrayVehiculo[i];
      v.arrancar();
    }
    
  }
}

