/*
    ************************************************************************************
    *                                                                                  *
    *         1.   Salida por pantalla                                                 *
    *                                                                                  *
    *         5.   Modifica el programa anterior añadiendo colores. Puedes             *
    *              mostrar cada asignatura de un color diferente.                      *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        //Variables
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String azul_claro = "\033[36m";
        String blanco = "\033[37m";
        //Outputs
        System.out.println(azul + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println(blanco + "------\t------\t------\t------\t-------");
        System.out.println(verde + "Progr." + morado + "\tS.Info." + rojo + "\tE.D." + verde + "\tProgr." + blanco + "\tFOL");
        System.out.println(verde + "Progr." + morado + "\tS.Info." + rojo + "\tE.D." + verde + "\tProgr." + blanco + "\tFOL");
        System.out.println(azul_claro + "L.Marc" + morado + "\tS.Info." + verde + "\tProgr." + azul_claro + "\tL.Marc" + blanco + "\tFOL");
        System.out.println(azul_claro + "L.Marc" + verde + "\tProgr." + verde + "\tProgr." + azul_claro + "\tL.Marc" + morado + "\tS.Info");
        System.out.println(naranja + "BBDD" + verde + "\tProgr." + naranja + "\tBBDD" + naranja + "\tBBDD" + morado + "\tS.Info");
        System.out.println(naranja + "BBDD" + rojo + "\tE.D." + naranja + "\tBBDD" + naranja + "\tBBDD" + morado + "\tS.Info");
    }
}
