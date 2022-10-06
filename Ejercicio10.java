import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String azul_claro = "\033[36m";
        String blanco = "\033[37m";

        System.out.println(morado + ".---------------------------------------------------------"+ morado + "."+ blanco);
        System.out.println(morado + ":"+ rojo +"      __                                                 "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   =='_))  __-:!:-     "+ verde + "(Adrian Perogil Fernandez)        "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"     ,:' .'  ))-:!:-   "+ verde + "(1º DAM - Programacion)           "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"    ((_,'  .'-:!:-     "+ verde + "(CPIPF Nuevo)                     "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   ~^~~~^~~^~~~^~                                        "+ morado + ":"+ blanco); 
        System.out.println(morado + "'---------------------------------------------------------"+ morado + "'"+ blanco);
		} catch (InputMismatchException ex) {
			System.out.println("Dato introducido incorrecto");
		}
		sc.close();
	}
}