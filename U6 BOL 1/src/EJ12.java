import java.util.Scanner;

public class EJ12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro las variables

		int i, posicion = 0;

		// Declaro el array y pido sus valores
		Scanner sc = new Scanner(System.in);
		int vector[];
		vector = new int[10];
		for (i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor de la posici�n " + i + " del vector");
			vector[i] = sc.nextInt();
		}

		// Pido la posici�n
		do {
			System.out.println("�Qu� posici�n desea seleccionar?");
			posicion = sc.nextInt();
		} while (posicion > 9 || posicion < 0);

		// Proceso

		for (i = posicion; i < 9; i++) {
			vector[i] = vector[i + 1];
		}

		// Se imprime el array

		for (i = 0; i < 10; i++) {
			System.out.println("Posici�n " + i + " del vector: " + vector[i]);
		}
	}

}
