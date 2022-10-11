import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rojo = "\033[31m";
        String verde = "\033[32m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        System.out.println(morado + ".---------------------------------------------------------"+ morado + "."+ blanco);
        System.out.println(morado + ":"+ rojo +"      __                                                 "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   =='_))  __-:!:-     "+ verde + "(Adrian Perogil Fernandez)        "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"     ,:' .'  ))-:!:-   "+ verde + "(1º DAM - Programacion)           "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"    ((_,'  .'-:!:-     "+ verde + "(CPIPF Nuevo)                     "+ morado + ":"+ blanco); 
        System.out.println(morado + ":"+ rojo +"   ~^~~~^~~^~~~^~                                        "+ morado + ":"+ blanco); 
        System.out.println(morado + "'---------------------------------------------------------"+ morado + "'"+ blanco);
		sc.close();
	}
}