import java.awt.*;
import java.applet.*;

public class Arreglos extends Applet{
	int arreglo[] = {25, 14};
	public void paint(Graphics g) {
		g.drawString("Posici�n cero: "+arreglo[0], 20, 20);
		g.drawString("Posici�n uno: "+arreglo[1], 20, 40);
	}
}
