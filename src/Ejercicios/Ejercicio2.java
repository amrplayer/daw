package Ejercicios;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escaner
		Scanner entrada=new Scanner(System.in);
		
		//declaraci�n de variables
		int x;
		int[] arrayA;
		arrayA= new int[5];
		
		//For para introducir los 5 n�meros
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un n�mero:");
			x=entrada.nextInt();
			arrayA[i]=x;
		}
		
		//For para mostrar los n�meros de forma inversa
		for(int y=4;y>=0;y--) {
			System.out.println(arrayA[y]);
		}
	}

}
