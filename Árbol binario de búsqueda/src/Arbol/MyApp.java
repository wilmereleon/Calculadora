/**
 * 
 */
package Arbol;

/**
 * @author Wilme
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MyApp extends JFrame {
  String cad;
  Nodo raiz = null;
  Nodo ref = null;
  ins_nodo ins = new ins_nodo();
  ver_arbol_inorden ver1 = new ver_arbol_inorden ();
  ver_arbol_inorden ver2 = new ver_arbol_inorden ();
  ver_arbol_inorden ver3 = new ver_arbol_inorden ();
  
  Border borde = new BevelBorder (BevelBorder.RAISED);
  Border pulsado = new LineBorder (Color.red);
  JPanel panel1 = new JPanel ();
  JPanel panel2 = new JPanel ();
  JPanel panel3 = new JPanel ();
  JLabel label1 = new JLabel ("Valor a insertar en árbol");
  JTextField texto1 = new JTextField (5);
  JButton boton1 = new JButton ("INSERTAR");
  JButton boton2_a = new JButton ("ÁRBOL EN INORDEN");
  JButton boton2_b = new JButton ("ÁRBOL EN PREORDEN");
  JButton boton2_c = new JButton ("ÁRBOL EN POSORDEN");
  JButton boton3 = new JButton ("SALIR");
  
  JTextArea area1 = new JTextArea (10, 20);
  
  public MyApp () {
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    getContentPane ().setLayout (new BorderLayout () );
    getContentPane ().add (panel1, BorderLayout.NORTH);
    
    panel1.setBorder (borde);
    panel1.setLayout (new FlowLayout (1, 14, 14));
    panel1.add(label1);
    panel1.add(texto1);
    panel1.add(boton1);
    boton1.addActionListener(ins);
    
    panel2.setBorder (borde);
    getContentPane().add (panel2, BorderLayout.CENTER);
    panel2.add (area1);
    panel2.add (boton2_a);
    boton2_a.addActionListener (ver1);
    panel2.add (boton2_b);
    boton2_b.addActionListener (ver2);
    panel2.add (boton2_c);
    boton2_c.addActionListener (ver3);
    
    getContentPane ().add (panel3, BorderLayout.SOUTH);
    panel3.add (boton3);
  }
  
  /*
  * Se crea la clase «Nodo» para almacenar los datos del árbol y las variables que las almacenará.
  *
  */
  public class Nodo {
  int contenido;
  Nodo izq = null;
  Nodo der = null;
  Nodo (int valor) {
    contenido = valor;
  }
}
  
  /*
  * «ins_nodo» implementa interfaz de ActionListener.
  *
  */
  public class ins_nodo implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      System.out.println("Inserte nodo");
      ref = raiz;
      insercion (Integer.parseInt (texto1.getText ().trim()));
    }
  }
  
  /*
  * El método «insercion» inserta (valga la redundancia) un nodo al árbol.
  *
  */
  public void insercion (int val) {
    ref = raiz;
    Nodo aux = ref;
    if (raiz == null) {
      raiz = new Nodo (val);
    }
    else {
      while (ref != null) {
        aux = ref;
        if (val < ref.contenido) {
          ref = ref.izq;
        }
        else {
          if (val > ref.contenido) {
          ref = ref.der;
        }
      }
    }
    ref = aux;
    if (aux != null) {
      if (val < ref.contenido) {
        Nodo nuevo = new Nodo (val);
        ref.izq = nuevo;
      }
      else {
        if (val > ref.contenido && aux != null) {
          Nodo nuevo = new Nodo (val);
          ref.der = nuevo;
        }
        else {
          System.out.println("Nunca se presenta");
        }
      }
    }
    else {
      System.out.println("Nodo repetido");
    }
  }
}
  
  public class ver_arbol_inorden implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      System.out.println("Ver árbol");
      cad = "";
      inorden (raiz);
      area1.setText (cad);
    }
  }
  
  public class ver_arbol_preorden implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      System.out.println("Ver árbol");
      cad = "";
      preorden (raiz);
      area1.setText (cad);
    }
  }
  
  public class ver_arbol_posorden implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      System.out.println("Ver árbol");
      cad = "";
      posorden (raiz);
      area1.setText (cad);
    }
  }
  
  public void inorden (Nodo nodin) {
    if (nodin != null) {
      inorden (nodin.izq);
      String st = new String ("" + nodin.contenido);
      cad = cad + nodin.contenido + " ";
      inorden (nodin.der);
    }
  }
  
  public void preorden (Nodo nodin) {
    if (nodin != null) {
      String st = new String ("" + nodin.contenido);
      cad = cad + nodin.contenido + " ";
      preorden (nodin.izq);
      preorden (nodin.der);
    }
  }
  public void posorden (Nodo nodin) {
    if (nodin != null) {
      posorden (nodin.izq);
      posorden (nodin.der);
      String st = new String ("" + nodin.contenido);
      cad = cad + nodin.contenido + " ";
    }
  }
  
  public static void main (String args []) {
    MyApp f = new MyApp ();
    f.setSize (750, 550);
    f.show ();
  }
}


