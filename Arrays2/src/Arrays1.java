import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz [i][j] = i + j;
		}
	}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
		}
			System.out.println();
		}
	}
}