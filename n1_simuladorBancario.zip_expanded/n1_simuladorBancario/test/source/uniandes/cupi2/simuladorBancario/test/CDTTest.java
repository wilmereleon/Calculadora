/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_simuladorBancario
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.simuladorBancario.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uniandes.cupi2.simuladorBancario.mundo.CDT;

/**
 * Clase usada para verificar que los m�todos de la clase CDT est�n correctamente implementados.
 */
public class CDTTest
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * CDT usada para las pruebas.
     */
    private CDT cdt;

    // -----------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------

    /**
     * Escenario 1: Crea un nuevo CDT e inicializa sus atributos.
     */
    private void setupEscenario1( )
    {
        cdt = new CDT( );
    }

    /**
     * Prueba 1: M�todo que se encarga de verificar el m�todo inicializar.<br>
     * <b> M�todos a probar: </b> <br>
     * inicializar<br>
     * darInteresMensual<br>
     * calcularValorPresente<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El CDT fue incializado correctamente.
     */
    @Test
    public void testCDT( )
    {
        setupEscenario1( );
        assertEquals( "El interes mensual no es el esperado", 0.0, cdt.darInteresMensual( ), 0.00001 );
        assertEquals( "El valor presente no es el esperado", 0, cdt.calcularValorPresente( 1 ), 0.00001 );
    }

    /**
     * Prueba 2: M�todo que se encarga de verificar el m�todo invertir.<br>
     * <b> M�todos a probar: </b> <br>
     * invertir<br>
     * calcularValorPresente<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El CDT no tiene dinero invertido.
     */
    @Test
    public void testInvertir( )
    {
        setupEscenario1( );
        cdt.invertir( 100000, 0.05, 1 );
        assertEquals( "El valor presente del CDT no es el esperado", 100000, cdt.calcularValorPresente( 1 ), 2 );

    }

    /**
     * Prueba 3: M�todo que se encarga de verificar el m�todo calcularValorPresente.<br>
     * <b> M�todos a probar: </b> <br>
     * invertir<br>
     * calcularValorPresente<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El CDT tiene dinero invertido.
     */
    @Test
    public void testCalcularValorPresesente( )
    {
        setupEscenario1( );
        cdt.invertir( 100000, 0.05, 1 );
        assertEquals( "El valor presente del CDT no es el esperado", 100000 * ( 1 + 0.05 ), cdt.calcularValorPresente( 2 ), 0.01 );

    }

    /**
     * Prueba 4: M�todo que se encarga de verificar el m�todo cerrar.<br>
     * <b> M�todos a probar: </b> <br>
     * invertir<br>
     * calcularValorPresente<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El CDT tiene dinero invertido.
     */
    @Test
    public void testCerrar( )
    {
        setupEscenario1( );
        cdt.invertir( 100000, 0.05, 1 );
        assertEquals( "El valor presente del CDT no es el esperado", 100000 * ( 1 + 0.05 ), cdt.cerrar( 2 ), 0.01 );
        assertEquals( "El interes mensual no es el esperado", 0.0, cdt.darInteresMensual( ), 0.00001 );
        assertEquals( "El valor presente no es el esperado", 0, cdt.calcularValorPresente( 1 ), 0.00001 );

    }

}
