package Ejercicios;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Variables
		int x;
		int[] arrayA;
		arrayA = new int[10];

		// For para pedir n�meros
		for (int i = 0; i < 10; i++) {
			System.out.println("arrayA[" + i + "]:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// Pedimos la posicion a borrar
		System.out.println("Dame la posicion del array que deseas borrar:");
		x = entrada.nextInt();

		// For para hacer que desaparezca
		for (int y = x; y < 9; y++) {
			arrayA[y] = arrayA[y + 1];
		}
		arrayA[9] = 0;// el 9 se volver� 0 pase lo que pase, evita duplicar el �ltimo valor

		// Mostrar
		for (int m = 0; m < 10; m++) {
			System.out.println("arrayA[" + m + "]: " + arrayA[m]);
		}
	}

}
