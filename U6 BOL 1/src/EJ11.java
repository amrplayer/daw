import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro arrays y variables
		int vector[];
		vector = new int[10];
		int vectorclon[];
		vectorclon = new int[10];
		int i, n, tmp = 0, posicion = 0;
		boolean posicionEncontrada = false;
		// Doy valores al vector
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los n�meros de forma creciente.");
		for (i = 1; i < 6; i++) {
			System.out.println("Introduzca el valor de la posici�n " + i + " del vector");
			vector[i] = sc.nextInt();
		}
		// Proceso

		// Doy valores al clon
		for (i = 0; i < 10; i++) {
			vectorclon[i] = vector[i];
		}

		// Pido el n�mero
		System.out.println("Introduzca un n�mero.");
		n = sc.nextInt();
		// Identifico la posici�n que debe tomar el n�mero
		for (i = 0; i < 9; i++) {
			if (n < vector[i] && n > vector[i - 1]) {
				tmp = vector[i];
				posicion = i;
			}
		}
		// Tengo que desplazar el vector una posicion hacia atr�s desde
		// la posicion que tiene que ocupar el numero

		for (i = 0; i < posicion - 1; i++) {
			vector[i] = vectorclon[i + 1];
		}
		vector[posicion] = n;
		vector[posicion - 1] = tmp;

		for (int k = 0; k < 10; k++) {
			System.out.println("Posici�n " + k + " del vector : " + vector[k]);
		}

	}

}
