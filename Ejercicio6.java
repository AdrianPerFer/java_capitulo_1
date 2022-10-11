/*
    ************************************************************************************
    *                                                                                  *
    *         1.   Salida por pantalla                                                 *
    *                                                                                  *
    *         6.   Escribe un programa que pinte por pantalla una pirámide             *
	*			   rellena a base de asteriscos. La base de la pirámide debe           *
	*			   estar formada por 9 asteriscos.                                     *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio6 {
	public static void main(String[] args) {
		//Variable "altura" & "asterisco"
		int altura = 5;
		int asterisco = 1;
		//Variable "i"
		//First loop for "altura"
		for ( int i = 1 ; i <= altura ; i++ ) {
			//Variable "espacio"
			//Second loop for "espacio"
			for ( int espacio = 1 ; espacio <= altura - i ; espacio++ ) {
				System.out.print(" ");
			}
			//Third loop for "asterisco"
			for ( asterisco = 1 ; asterisco <= ( i * 2 ) - 1 ; asterisco++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}