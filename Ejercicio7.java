/*
    ************************************************************************************
    *                                                                                  *
    *         1.   Salida por pantalla                                                 *
    *                                                                                  *
    *         7.   Igual que el programa anterior, pero esta vez la pirámide           *
	*			   estará hueca (se debe ver únicamente el contorno hecho con *)       *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio7 {
	public static void main(String[] args) {
		//Variable "altura" & "asterisco"
		int altura = 5;
		int asterisco = 1;
		//Variable "i"
		//First loop for "altura"
		for ( int i = 1 ; i <= altura ; i++ ) {
			//Variable "espacio"
			//Second loop for "espacio"
			for ( int espacio = i ; espacio <= altura ; espacio++ ) {
				System.out.print(" ");
			}
			//Third loop for "asterisco"
			for ( asterisco = 1 ; asterisco <= ( i * 2 ) - 1 ; asterisco++ ) {
				if (i == altura || (asterisco == 1 || asterisco == (2 * i) - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}