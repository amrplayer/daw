
public class Entornos {

	public static void Burbuja(int[] array) {

		for (int i = 0; i < 10 - 1; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {

				if (array[j + 1] < array[j]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
	}

public static void seleccion(int[] array) {
		int menor;
		int posicion;
		int aux;

		for (int i = 0; i <= 10 - 2; i++) {
			menor = array[i];
			posicion = i;

			for (int j = i + 1; j <= array.length - 1; j++) {

				if (array[j] < menor) {
					menor = array[j];
					posicion = j;
				}
			}
			if (posicion != i) {
				aux = array[i];
				array[i] = array[posicion];
				array[posicion] = aux;

			}
		}

	}
}
