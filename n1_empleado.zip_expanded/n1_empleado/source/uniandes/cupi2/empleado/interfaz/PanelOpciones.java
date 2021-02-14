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

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel con las opciones de la aplicaci�n.
 */
@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para cambiar el empleado.
     */
    private final String CAMBIAR_EMPLEADO = "cambiarEmpleado";

    /**
     * Constante para el extensi�n 1.
     */
    private final String OPCION_1 = "opcion1";

    /**
     * Cosntante para la extensi�n 2.
     */
    private final String OPCION_2 = "opcion2";

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
     * Bot�n para cambiar de empleado.
     */
    private JButton btnCambiarEmpleado;

    /**
     * Bot�n para la extensi�n 1.
     */
    private JButton btnOpcion1;

    /**
     * Bot�n para la extensi�n 2.
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel de opciones. <br>
     * <b>post: </b> Construy� el panel.
     * @param pPrincipal Ventana principal de la aplicaci�n. pPrincipal != null.
     */
    public PanelOpciones( InterfazEmpleado pPrincipal )
    {
        principal = pPrincipal;

        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Opciones" ) ) );

        setLayout( new GridLayout( 1, 3 ) );

        btnCambiarEmpleado = new JButton( "Cambiar empleado" );
        btnCambiarEmpleado.setActionCommand( CAMBIAR_EMPLEADO );
        btnCambiarEmpleado.addActionListener( this );

        btnOpcion1 = new JButton( "Opci�n 1" );
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );

        btnOpcion2 = new JButton( "Opci�n 2" );
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );

        add( btnCambiarEmpleado );
        add( btnOpcion1 );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Acci�n que gener� el evento. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( CAMBIAR_EMPLEADO.equals( comando ) )
        {
            principal.mostrarDialogoCambiarEmpleado( );
        }
        else if( OPCION_1.equals( comando ) )
        {
            principal.reqFuncOpcion1( );
        }
        else if( OPCION_2.equals( comando ) )
        {
            principal.reqFuncOpcion2( );
        }
    }

}
