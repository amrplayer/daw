// factorial(n)
// ---> n*n-1 hasta n==1

import java.util.Scanner;

public class calcularFactorial {

	
	public static int factorizar(int n){
	
	int resultado=n;
		while(n>1){
		resultado=resultado*(n-1);
		n--;
		}
	return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el n�mero:");
		n=teclado.nextInt();
		
		System.out.println("El factorial es "+ factorizar(n));
		
	}
}
