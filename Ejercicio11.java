import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//variables//
			int	numero, i, temp, j=0, indice ;
			
		//vector//
			int[] vector;
			vector = new int[10];
			
		// filtro//
			
			System.out.println("Introduzca el n�mero para la posici�n " + 0 + " del vector.");
			numero = entrada.nextInt();
			vector[0] = numero;
			
		for(i = 1; i<5; i++ ) { 
			do {
				System.out.println("Introduzca el n�mero para la posici�n " + i + " del vector.");
				System.out.println("El n�mero a de ser mayor que el anterior");
				numero = entrada.nextInt();
				vector[i] = numero;
			} while (vector[i]<vector[i-1]);
		}
			
		// proceso//
		
		System.out.println("Introduzca el n�mero para introducir en el vector.");
		numero = entrada.nextInt();
		while (vector[j]<numero && j!=9) {
			if (numero < vector[j]) {
				indice = j;
			} else {
				j++;
			}
		}
		
		
		for (i=vector.length-1; i>j; i--) {
			vector[i] = vector[i-1];
		}
		
		vector[j] = numero;
		
		//imprimir//
				for (i = 0; i < vector.length; i++) {
					System.out.println("\n Posici�n " + i + " | Valor " + vector[i]);
				}
				
		
	}

}
