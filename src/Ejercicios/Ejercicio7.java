package Ejercicios;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escaner
		Scanner entrada = new Scanner(System.in);

		// Variables
		int x;
		boolean creciente = false;
		boolean decreciente = false;
		int[] arrayA;
		arrayA = new int[10];

		// For para pedir n�meros
		for (int i = 0; i < 10; i++) {
			System.out.println("Dime un n�mero:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		for (int y = 0; y < 9; y++) {
			if (arrayA[y] < arrayA[y + 1]) {
				creciente = true;
			} else if (arrayA[y] > arrayA[y + 1]) {
				decreciente = true;
			}
		}

		if ((creciente == true) && (decreciente == true)) {
			System.out.println("N�meros DESORDENADOS");
		} else if (creciente == true) {
			System.out.println("N�meros ordenados de forma CRECIENTE");
		} else
			System.out.println("N�meros ordenados de forma DECRECIENTE");
	}

}
