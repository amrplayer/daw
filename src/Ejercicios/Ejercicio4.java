package Ejercicios;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escaner
		Scanner entrada = new Scanner(System.in);

		// Declaraci�n de variables.
		int x;
		int contadorA = 0, contadorB = 9;
		int[] arrayA;
		arrayA = new int[10];

		// For en el que pedimos n�meros
		for (int i = 0; i < 10; i++) {
			System.out.println("Dime un n�mero entero:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// For para mostrarlos de la manera indicada,
		// primero-�ltimo-segundo-pen�ltimo-etc
		for (int y = 0; y < 5; y++) {
			System.out.println("arrayA[" + contadorA + "]: " + arrayA[contadorA]);
			contadorA += 1;
			System.out.println("arrayA[" + contadorB + "]: " + arrayA[contadorB]);
			contadorB -= 1;
		}
	}

}
