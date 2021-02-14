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

import uniandes.cupi2.simuladorBancario.mundo.CuentaAhorros;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Clase usada para verificar que los m�todos de la clase CuentaAhorros est�n correctamente implementados.
 */
public class CuentaAhorrosTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Cuenta de ahorros usada para las pruebas.
     */
    private CuentaAhorros cuenta;

    // -----------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------

    /**
     * Escenario 1: Crea una nueva cuenta de ahorros y inicializa sus atributos.
     */
    private void setupEscenario1( )
    {
        cuenta = new CuentaAhorros( );
    }

    /**
     * Prueba 1: M�todo que se encarga de verificar el m�todo inicializar.<br>
     * <b> M�todos a probar: </b> <br>
     * inicializar<br>
     * darInteresMensual<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta de ahorros fue inicializada correctamente.
     */
    @Test
    public void testCuentaAhorros( )
    {
        setupEscenario1( );
        assertEquals( "El interes mensual no es el esperado", 0.006, cuenta.darInteresMensual( ), 0.00001 );
        assertEquals( "El saldo de la cuenta de ahorros", 0, cuenta.darSaldo( ), 0.00001 );
    }

    /**
     * Prueba 2: M�todo que se encarga de verificar el m�todo consignarMonto.<br>
     * <b> M�todos a probar: </b> <br>
     * consignarMonto<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta de ahorros no tiene saldo.
     */
    @Test
    public void testConsigarMonto( )
    {
        setupEscenario1( );
        cuenta.consignarMonto( 10000 );
        assertEquals( "El saldo de la cuenta no es el esperado", 10000, cuenta.darSaldo( ) , 2);

    }

    /**
     * Prueba 3: M�todo que se encarga de verificar el m�todo retirarMonto.<br>
     * <b> M�todos a probar: </b> <br>
     * retirarMonto<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta de ahorros tiene saldo suficiente para retirar.
     */
    @Test
    public void testRetirarMonto( )
    {
        setupEscenario1( );
        cuenta.consignarMonto( 10000 );
        cuenta.retirarMonto( 1000 );
        assertEquals( "El saldo de la cuenta no es el esperado", 9000, cuenta.darSaldo( ), 2 );

    }

    /**
     * Prueba 4: M�todo que se encarga de verificar el m�todo actualizarSaldoPorPasoMes.<br>
     * <b> M�todos a probar: </b> <br>
     * actualizarSaldoPorPasoMes<br>
     * consignarMonto<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta de ahorros tiene saldo.
     */
    @Test
    public void testActualizarSaldoPorPasoMes( )
    {
        setupEscenario1( );
        cuenta.consignarMonto( 10000 );
        cuenta.actualizarSaldoPorPasoMes( );
        assertEquals( "El saldo de la cuenta no es el esperado", 10000 * ( 0.006 + 1 ), cuenta.darSaldo( ), 0.0001 );

    }

}
