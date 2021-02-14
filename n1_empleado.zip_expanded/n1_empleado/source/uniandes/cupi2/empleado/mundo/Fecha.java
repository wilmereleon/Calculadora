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
package uniandes.cupi2.empleado.mundo;

/**
 * Clase para representar una fecha.
 */
public class Fecha
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * D�a de la fecha.
     */
    private int dia;

    /**
     * Mes de la fecha.
     */
    private int mes;

    /**
     * A�o de la fecha.
     */
    private int anio;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Construye una fecha con los par�metros proporcionados <br>
     * <b>post: </b> El d�a, mes y a�o de la fecha tienen los valores dados por par�metro.
     * @param pDia D�a de la fecha. pDia > 0 y pDia <= 31 y pDia es un valor v�lido seg�n el mes.
     * @param pMes Mes de la fecha. pMes > 0 y pMes <= 12.
     * @param pAnio A�o de la fecha. pAnio > 0.
     */
    public Fecha( int pDia, int pMes, int pAnio )
    {
        dia = pDia;
        mes = pMes;
        anio = pAnio;
    }

    /**
     * Retorna el d�a de la fecha.
     * @return D�a de la fecha.
     */
    public int darDia( )
    {
        return dia;
    }

    /**
     * Retorna el mes de la fecha.
     * @return Mes de la fecha.
     */
    public int darMes( )
    {
        return mes;
    }

    /**
     * Retorna el a�o de la fecha.
     * @return A�o de la fecha.
     */
    public int darAnio( )
    {
        return anio;
    }

    /**
     * Retorna la diferencia en meses que hay entre dos fechas.
     * @param pFecha Fecha contra la que se est� comparando. pFecha != null.
     * @return Diferencia en meses de la fechas.
     */
    public int darDiferenciaEnMeses( Fecha pFecha )
    {
        int diferencia = 0;

        int otroAnho = pFecha.darAnio( );
        int otroMes = pFecha.darMes( );
        int otroDia = pFecha.darDia( );

        // Calcula la diferencia en meses
        diferencia = 12 * ( otroAnho - anio ) + ( otroMes - mes );

        // Si el d�a no es mayor, resta un mes
        if( otroDia < dia )
        {
            diferencia--;
        }

        return diferencia;
    }

    /**
     * Retorna una cadena que representa la fecha.
     * @return Cadena con la informaci�n de la fecha, sigue el formato dia-mes-a�o.
     */
    public String toString( )
    {
        return dia + "-" + mes + "-" + anio;
    }
}
