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

import uniandes.cupi2.simuladorBancario.mundo.CuentaCorriente;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Clase usada para verificar que los m�todos de la clase CuentaCorriente est�n correctamente implementados.
 */
public class CuentaCorrienteTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Cuenta de corriente usada para las pruebas.
     */
    private CuentaCorriente cuenta;

    // -----------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------

    /**
     * Escenario 1: Crea una nueva cuenta de corriente y inicializa sus atributos.
     */
    private void setupEscenario1( )
    {
        cuenta = new CuentaCorriente( );
    }

    /**
     * Prueba 1: M�todo que se encarga de verificar el m�todo inicializar.<br>
     * <b> M�todos a probar: </b> <br>
     * inicializar<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta corriente fue inicializada correctamente.
     */
    @Test
    public void testCuentaCorriente( )
    {
        setupEscenario1( );
        assertEquals( "El saldo de la cuenta de ahorros", 0, cuenta.darSaldo( ), 0.00001 );
    }

    /**
     * Prueba 2: M�todo que se encarga de verificar el m�todo consignarMonto.<br>
     * <b> M�todos a probar: </b> <br>
     * consignarMonto<br>
     * darSaldo<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La cuenta corriente no tiene saldo.
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
     * 1. La cuenta corriente tiene saldo suficiente para retirar el monto.
     */
    @Test
    public void testRetirarMonto( )
    {
        setupEscenario1( );
        cuenta.consignarMonto( 10000 );
        cuenta.retirarMonto( 1000 );
        assertEquals( "El saldo de la cuenta no es el esperado", 9000, cuenta.darSaldo( ), 2 );

    }

}
