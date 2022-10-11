import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = 5;
		int asterisco = 1;
		for ( int i = 1 ; i <= altura ; i++ ) {
			for ( int espacio = 1 ; espacio <= altura - i ; espacio++ ) {
				System.out.print(" ");
			}
			for ( asterisco = 1 ; asterisco <= ( i * 2 ) - 1 ; asterisco++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}