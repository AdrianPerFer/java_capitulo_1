import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = 5;
		int asterisco = 1;
		for ( int i = 1 ; i <= altura ; i++ ) {
			for ( int espacio = i ; espacio <= altura ; espacio++ ) {
				System.out.print(" ");
			}
			for ( asterisco = 1 ; asterisco <= ( i * 2 ) - 1 ; asterisco++ ) {
				if (i == altura || (asterisco == 1 || asterisco == (2 * i) - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}
}