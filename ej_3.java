
/* Leer 5 n�meros por teclado y a continuaci�n realizar la media de los n�meros
positivos, la media de los negativos y contar el n�mero de ceros. */

import java.util.*;

public class ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Variables.

		int x;
		int i = 0;
		int positivo = 0;
		int negativo = 0;
		int ceros = 0;
		double mediaPos = 0;
		double mediaNeg = 0;
		int sumaPos = 0;
		int sumaNeg = 0;

		// Declaramos el array.

		int[] vector;
		vector = new int[5];

		// Damos valores al array.

		for (i = 0; i < 5; i++) {
			System.out.println("Introduzca 5 n�meros.");
			x = entrada.nextInt();

			vector[i] = x;

			if (vector[i] == 0) { // Contar el n�mero de ceros.
				ceros++;
			} else if (vector[i] > 0) { // Contar el n�mero de positivos.
				positivo++;
				sumaPos += vector[i];
			} else if (vector[i] < 0) { // Contar el n�mero de negativos.
				negativo++;
				sumaNeg += vector[i];
			}

		}

		// Media de los positivos.

		if (positivo != 0) {
			mediaPos = (sumaPos) / positivo;
			System.out.println("Media n�meros positivos = " + mediaPos);
		} else {
			System.out.println("No hay positivos.");
		}

		// Media de los negativos.

		if (negativo != 0) {
			mediaNeg = (sumaNeg) / negativo;
			System.out.println("Media n�meros negativos = " + mediaNeg);
		} else {
			System.out.println("No hay negativos.");
		}

		System.out.println("N�mero de ceros = " + ceros);

	}

}
