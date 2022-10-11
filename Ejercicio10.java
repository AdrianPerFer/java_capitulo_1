/*
    ************************************************************************************
    *                                                                                  *
    *         1.   Salida por pantalla                                                 *
    *                                                                                  *
    *         10.  Mejora el ejercicio anterior añadiéndole colores.                   *                                                 *
	*																		           *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio10 {
	public static void main(String[] args) {
        //Variables "rojo", "verde", "morado", "blanco"
		String rojo = "\033[31m";
        String verde = "\033[32m";
        String morado = "\033[35m";
        String blanco = "\033[37m";
        //Outputs
        System.out.println(morado + ".---------------------------------------------------------."+ blanco);
        System.out.println(morado + ":"+ rojo +"      __                                                 "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   =='_))  __-:!:-     "+ verde + "(Adrian Perogil Fernandez)        "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"     ,:' .'  ))-:!:-   "+ verde + "(1º DAM - Programacion)           "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"    ((_,'  .'-:!:-     "+ verde + "(CPIPF Nuevo)                     "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   ~^~~~^~~^~~~^~                                        "+ morado + ":"+ blanco); 
        System.out.println(morado + "'---------------------------------------------------------'"+ blanco);
	}
}