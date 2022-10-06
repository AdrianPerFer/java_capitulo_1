import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
       	System.out.println(".---------------------------------------------------------.");
       	System.out.println(":      __                                                 :"); 
      	System.out.println(":   =='_))  __-:!:-     (Adrian Perogil Fernandez)        :"); 
      	System.out.println(":     ,:' .'  ))-:!:-   (1º DAM - Programacion)           :"); 
      	System.out.println(":    ((_,'  .'-:!:-     (CPIPF Nuevo)                     :"); 
        System.out.println(":   ~^~~~^~~^~~~^~                                        :"); 
        System.out.println("'---------------------------------------------------------'");
		} catch (InputMismatchException ex) {
			System.out.println("Dato introducido incorrecto");
		}
		sc.close();
	}
}