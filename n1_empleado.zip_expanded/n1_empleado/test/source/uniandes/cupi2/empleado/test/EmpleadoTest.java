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
package uniandes.cupi2.empleado.test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import uniandes.cupi2.empleado.mundo.Empleado;
import uniandes.cupi2.empleado.mundo.Fecha;

/**
 * Clase usada para verificar que los m�todos de la clase Empleado est�n correctamente implementados.
 */
public class EmpleadoTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase donde se har�n las pruebas.
     */
    private Empleado empleado1;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Escenario 1: Construye un nuevo Empleado.
     */
    private void setupEscenario1( )
    {
        empleado1 = new Empleado( );
    }

    /**
     * Prueba 1: M�todo que se encarga de verificar el m�todo constructor. <br>
     * <b> M�todos a probar: </b> <br>
     * Empleado<br>
     * darNombre<br>
     * darApellido<br>
     * darSexo<br>
     * darFechaNacimiento<br>
     * <b> Caso de prueba: </b> <br>
     * 1. Se construye el empleado correctamente.
     */
    @Test
    public void testEmpleado( )
    {
        setupEscenario1( );
        Fecha fecha1 = new Fecha( 16, 6, 1982 );

        assertEquals( "El nombre del empleado 1 es Pedro", "Pedro", empleado1.darNombre( ) );
        assertEquals( "El apellido del empleado 1 es P�rez", "Matallana", empleado1.darApellido( ) );
        assertEquals( "El sexo del empleado 1 es masculino", 1, empleado1.darGenero( ) );
        assertEquals( "La fecha de nacimiento del empleado 1 es " + fecha1, fecha1.toString( ), empleado1.darFechaNacimiento( ) );
    }

    /**
     * Prueba 2: M�todo que se encarga de verificar el m�todo cambiarImagen. <br>
     * <b> M�todos a probar: </b> <br>
     * cambiarSalario<br>
     * darSalario<br>
     * <b> Caso de prueba 1: </b> <br>
     * 1. Se cambia el salario del empleado.<br>
     */
    @Test
    public void testCambiarSalario( )
    {
        setupEscenario1( );
        int salario = 2000000;

        empleado1.cambiarSalario( salario );
        assertEquals( "El salario del empleado 1 debe ser " + salario, salario, empleado1.darSalario( ), 2 );

    }

    /**
     * Prueba 3: M�todo que se encarga de verificar el m�todo calcularAntiguedad.<br>
     * <b> M�todos a probar: </b> <br>
     * calcularAntiguedad<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El empleado ingres� el 6 / 10 / 2002.
     */
    @Test
    public void testCalcularAntiguedad( )
    {
        setupEscenario1( );

        GregorianCalendar gc = new GregorianCalendar( );

        int dia = gc.get( Calendar.DAY_OF_MONTH );
        int mes = gc.get( Calendar.MONTH ) + 1;
        int anho = gc.get( Calendar.YEAR );
        Fecha hoy = new Fecha( dia, mes, anho );
        Fecha fechaIngreso = new Fecha( 5, 4, 2000 );
        int antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12;

        assertEquals( "El c�lculo de la antig�edad est� equivocado.", antiguedad, empleado1.calcularAntiguedad( ) );

    }

    /**
     * Prueba 4: M�todo que se encarga de verificar el m�todo calcularPrestaciones.<br>
     * <b> M�todos a probar: </b> <br>
     * calcularPrestaciones<br>
     * calcularAntiguedad<br>
     * darSalario<br>
     * <b> Casos de prueba: </b> <br>
     * 1. El empleado ingres� el 6 / 10 / 2002.
     */
    @Test
    public void testCalcularPrestaciones( )
    {
        setupEscenario1( );

        double esperadas = ( empleado1.calcularAntiguedad( ) * empleado1.darSalario( ) ) / 12.0;
        double prestaciones = empleado1.calcularPrestaciones( );

        assertEquals( "El c�lculo de las prestaciones est� equivocado: fue " + prestaciones + " en lugar de " + esperadas, prestaciones, esperadas, 0 );
    }
}