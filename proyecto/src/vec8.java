import java.util.Scanner;

// Dise�ar una aplicaci�n que declare un array de 10 elementos enteros. Leer
// mediante el teclado 8 n�meros. Despu�s se debe pedir un n�mero y una
// posici�n, insertarlo en la posici�n indicada, desplazando los que est�n detr�s. 

public class vec8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1, vector2;
		int elemento, pos;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < 8; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			vector2[i] = vector1[i];
		}
		
		System.out.println("Introduzca un nuevo elemento: ");
		elemento = entrada.nextInt();
		
		System.out.println("Introduzca su posicion: ");
		pos = entrada.nextInt();
		
		for (int i = pos; i < vector1.length-1; i++) {
			vector1[i+1] = vector2[i];
		}
		
		vector1[pos] = elemento;
		
		// Imprime el vector
		for(int i = 0; i <= 9; i++) {
			System.out.println(vector1[i]);
			
		}
	}
}