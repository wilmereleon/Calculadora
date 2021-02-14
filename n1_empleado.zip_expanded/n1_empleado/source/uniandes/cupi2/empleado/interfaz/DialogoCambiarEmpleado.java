/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.empleado.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import uniandes.cupi2.empleado.mundo.Fecha;

/**
 * Di�logo para cambiar el empleado.
 */
@SuppressWarnings("serial")
public class DialogoCambiarEmpleado extends JDialog implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para aceptar los cambios.
     */
    private final static String SELECCIONAR_IMAGEN = "SELECCIONAR_IMAGEN";

    /**
     * Constante para aceptar los cambios.
     */
    private final static String ACEPTAR = "ACEPTAR";

    /**
     * Constante para cancelar los cambios.
     */
    private final static String CANCELAR = "CANCELAR";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Venta principal de la aplicaci�n.
     */
    private InterfazEmpleado principal;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de texto para el nombre.
     */
    private JTextField txtNombre;

    /**
     * Campo de texto para el apellido.
     */
    private JTextField txtApellido;

    /**
     * Combo para el g�nero.
     */
    private JComboBox cbGenero;

    /**
     * Campo de texto para el fecha de nacimiento.
     */
    private JDateChooser dcFechaNacimiento;

    /**
     * Campo de texto para el fecha de ingreso.
     */
    private JDateChooser dcFechaIngreso;

    /**
     * Campo de texto para el salario.
     */
    private JTextField txtSalario;

    /**
     * Campo de texto para la imagen.
     */
    private JTextField txtImagen;

    /**
     * Bot�n para seleccionar la imagen.
     */
    private JButton btnSelecImagen;

    /**
     * Bot�n para aceptar cambios.
     */
    private JButton btnAceptar;

    /**
     * Bot�n para cancelar cambios.
     */
    private JButton btnCancelar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el di�logo para modificar los datos del empleado.
     * @param pPrincipal Ventana principal de la aplicaci�n. pPrincipal != null.
     */
    public DialogoCambiarEmpleado( InterfazEmpleado pPrincipal )
    {
        principal = pPrincipal;

        setTitle( "Cambiar empleado" );
        setSize( 450, 250 );
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE );

        setLayout( new GridLayout( 8, 2 ) );

        add( new JLabel( "Nombre:" ) );
        txtNombre = new JTextField( );
        add( txtNombre );

        add( new JLabel( "Apellido:" ) );
        txtApellido = new JTextField( );
        add( txtApellido );

        add( new JLabel( "Genero:" ) );
        cbGenero = new JComboBox( );
        cbGenero.addItem( "femenino" );
        cbGenero.addItem( "masculino" );
        add( cbGenero );

        add( new JLabel( "Fecha de nacimiento:" ) );
        dcFechaNacimiento = new JDateChooser( );
        add( dcFechaNacimiento );

        add( new JLabel( "Fecha de ingreso:" ) );
        dcFechaIngreso = new JDateChooser( );
        add( dcFechaIngreso );

        add( new JLabel( "Salario:" ) );
        txtSalario = new JTextField( );
        add( txtSalario );

        add( new JLabel( "Imagen:" ) );
        JPanel panelAux = new JPanel( );
        panelAux.setLayout( new BorderLayout( ) );
        txtImagen = new JTextField( );
        txtImagen.setEditable( false );
        panelAux.add( txtImagen, BorderLayout.CENTER );
        btnSelecImagen = new JButton( "Seleccionar" );
        btnSelecImagen.setActionCommand( SELECCIONAR_IMAGEN );
        btnSelecImagen.addActionListener( this );
        panelAux.add( btnSelecImagen, BorderLayout.EAST );
        add( panelAux );

        btnAceptar = new JButton( "Aceptar" );
        btnAceptar.setActionCommand( ACEPTAR );
        btnAceptar.addActionListener( this );
        add( btnAceptar );

        btnCancelar = new JButton( "Cancelar" );
        btnCancelar.setActionCommand( CANCELAR );
        btnCancelar.addActionListener( this );
        add( btnCancelar );

        setModal( true );
        setLocationRelativeTo( principal );
        setResizable( false );
    }

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Acci�n que gener� el evento. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( comando.equals( ACEPTAR ) )
        {
            String nombre = txtNombre.getText( );
            String apellido = txtApellido.getText( );
            int genero = cbGenero.getSelectedIndex( );
            Date fechaIngreso = dcFechaIngreso.getDate( );
            Fecha fechaIngreso2 = new Fecha( fechaIngreso.getDate( ), fechaIngreso.getMonth( ) + 1, fechaIngreso.getYear( ) + 1900 );
            Date fechaNacimiento = dcFechaNacimiento.getDate( );
            Fecha fechaNacimiento2 = new Fecha( fechaNacimiento.getDate( ), fechaNacimiento.getMonth( ) + 1, fechaNacimiento.getYear( ) + 1900 );
            String salarioStr = txtSalario.getText( );
            String imagen = txtImagen.getText( );
            if( nombre.equals( "" ) || apellido.equals( "" ) || fechaIngreso == null || fechaNacimiento == null || salarioStr.equals( "" ) || imagen.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe llenar todos los datos.", "Cambiar empleado", JOptionPane.ERROR_MESSAGE );
            }
            else
            {
                try
                {
                    int salario = Integer.parseInt( salarioStr );
                    if( salario <= 0 )
                    {
                        JOptionPane.showMessageDialog( this, "El salario debe ser mayor a cero.", "Cambiar empleado", JOptionPane.ERROR_MESSAGE );
                    }
                    else if( fechaNacimiento2.darDiferenciaEnMeses( fechaIngreso2 ) < 0 )
                    {
                        JOptionPane.showMessageDialog( this, "La fecha de ingreso no puede ser anterior a la fecha de nacimiento.", "Cambiar empleado", JOptionPane.ERROR_MESSAGE );
                    }
                    else
                    {
                        principal.cambiarEmpleado( nombre, apellido, genero, fechaNacimiento2, fechaIngreso2, salario, imagen );
                        dispose( );
                    }

                }
                catch( NumberFormatException e )
                {
                    JOptionPane.showMessageDialog( this, "El salario debe ser un n�mero.", "Cambiar empleado", JOptionPane.ERROR_MESSAGE );
                }
            }
        }
        else if( comando.equals( SELECCIONAR_IMAGEN ) )
        {
            JFileChooser jfc = new JFileChooser( "./data/imagenes" );
            int resultado = jfc.showOpenDialog( this );
            if( resultado == JFileChooser.APPROVE_OPTION )
            {
                File elegida = jfc.getSelectedFile( );
                if( elegida != null )
                {
                    txtImagen.setText( elegida.getName( ) );
                }
            }
        }
        else if( comando.equals( CANCELAR ) )
        {
            dispose( );
        }

    }

}
