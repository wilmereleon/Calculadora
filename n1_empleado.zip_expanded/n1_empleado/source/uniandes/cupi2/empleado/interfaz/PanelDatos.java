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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel donde se muestran los datos del empleado.
 */
@SuppressWarnings("serial")
public class PanelDatos extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para modificar el salario.
     */
    private final static String MODIFICAR_SALARIO = "MODIFICAR SALARIO";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Venta principal de la aplicaci�n.
     */
    private InterfazEmpleado principal;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta del nombre.
     */
    private JLabel lblNombre;

    /**
     * Etiqueta del apellido.
     */
    private JLabel lblApellido;

    /**
     * Etiqueta de la fecha de ingreso.
     */
    private JLabel lblFIngreso;

    /**
     * Etiqueta de la fecha de nacimiento.
     */
    private JLabel lblFNacimiento;

    /**
     * Etiqueta del g�nero.
     */
    private JLabel lblGenero;

    /**
     * Etiqueta del salario del empleado.
     */
    private JLabel lblSalario;

    /**
     * Etiqueta donde se muestra la imagen.
     */
    private JLabel lblImagen;

    /**
     * Campo de texto para el nombre del empleado.
     */
    private JTextField txtNombre;

    /**
     * Campo de texto para el apellido del empleado.
     */
    private JTextField txtApellido;

    /**
     * Campo de texto para la fecha de ingreso del empleado a la compa�ia.
     */
    private JTextField txtFIngreso;

    /**
     * Campo de texto para la fecha de nacimiento del empleado.
     */
    private JTextField txtFNacimiento;

    /**
     * Campo de texto para el g�nero del empleado.
     */
    private JTextField txtGenero;

    /**
     * Campo de texto para el salario del empleado.
     */
    private JTextField txtSalario;

    /**
     * Bot�n para modificar el salario del empleado.
     */
    private JButton btnModificarSalario;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel con la informaci�n del empleado. <br>
     * <b>post: </b> Panel qued� inicializado.
     * @param pPrincipal Venta principal de la aplicaci�n. pPrincipal != null.
     */
    public PanelDatos( InterfazEmpleado pPrincipal )
    {
        principal = pPrincipal;

        setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Datos" ) ) );

        lblNombre = new JLabel( "Nombre: " );
        lblApellido = new JLabel( "Apellido: " );
        lblGenero = new JLabel( "G�nero: " );
        lblFNacimiento = new JLabel( "Fecha de nacimiento: " );
        lblFIngreso = new JLabel( "Fecha de ingreso: " );
        lblSalario = new JLabel( "Salario: " );

        txtNombre = new JTextField( 15 );
        txtNombre.setEditable( false );
        txtApellido = new JTextField( 15 );
        txtApellido.setEditable( false );
        txtGenero = new JTextField( 2 );
        txtGenero.setEditable( false );
        txtFNacimiento = new JTextField( 10 );
        txtFNacimiento.setEditable( false );
        txtFIngreso = new JTextField( 10 );
        txtFIngreso.setEditable( false );
        txtSalario = new JTextField( 10 );
        txtSalario.setEditable( false );
        txtSalario.setDisabledTextColor( Color.DARK_GRAY );

        btnModificarSalario = new JButton( );
        btnModificarSalario.setText( "Modificar salario" );
        btnModificarSalario.setActionCommand( MODIFICAR_SALARIO );
        btnModificarSalario.addActionListener( this );

        JPanel panelDatos = new JPanel( new GridLayout( 7, 2 ) );
        panelDatos.add( lblNombre );
        panelDatos.add( txtNombre );
        panelDatos.add( lblApellido );
        panelDatos.add( txtApellido );
        panelDatos.add( lblGenero );
        panelDatos.add( txtGenero );
        panelDatos.add( lblFNacimiento );
        panelDatos.add( txtFNacimiento );
        panelDatos.add( lblFIngreso );
        panelDatos.add( txtFIngreso );
        panelDatos.add( lblSalario );
        panelDatos.add( txtSalario );
        panelDatos.add( new JLabel( ) );
        panelDatos.add( btnModificarSalario );

        lblImagen = new JLabel( );
        add( panelDatos, BorderLayout.CENTER );
        add( lblImagen, BorderLayout.EAST );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Actualiza los campos del panel con la informaci�n del empleado. <br>
     * <b>post: </b> Los campos muestran la nueva informaci�n.
     * @param pNombre Nombre del empleado. pNombre != null && pNombre != "".
     * @param pApellido Apellido del empleado. pApellido != null && pApellido != "".
     * @param pSexo Sexo del empleado. pSexo pertenece a {"m","f"}.
     * @param pFechaIngreso Fecha de ingreso a la empresa. pFechaIngreso != null && pFechaIngreso != "".
     * @param pFechaNacimiento Fecha de Nacimiento del empleado. pFechaNacimiento != null && pFechaNacimiento != "".
     * @param pImagen Ruta donde se encuentra la imagen. pImagen != null.
     */
    public void actualizarCampos( String pNombre, String pApellido, String pSexo, String pFechaIngreso, String pFechaNacimiento, String pImagen )
    {
        txtNombre.setText( pNombre );
        txtApellido.setText( pApellido );
        txtGenero.setText( pSexo );
        txtFIngreso.setText( pFechaIngreso );
        txtFNacimiento.setText( pFechaNacimiento );
        remove( lblImagen );
        lblImagen = new JLabel( new ImageIcon( "./data/imagenes/" + pImagen ) );
        lblImagen.setHorizontalAlignment( JLabel.CENTER );
        lblImagen.setVerticalAlignment( JLabel.CENTER );
        lblImagen.setPreferredSize( new Dimension( 170, 0 ) );
        add( lblImagen, BorderLayout.EAST );

    }

    /**
     * Actualiza el salario que se muestra. <br>
     * <b>post: </b> Se cambi� el salario mostrado.
     * @param pSalario Salario del empleado. pSalario > 0.
     */
    public void actualizarSalario( double pSalario )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$###,###.##" );
        txtSalario.setText( df.format( pSalario ) );
    }

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Evento de click sobre un bot�n. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String command = pEvento.getActionCommand( );

        if( command.equals( MODIFICAR_SALARIO ) )
        {
            principal.modificarSalario( );
        }
    }

}
