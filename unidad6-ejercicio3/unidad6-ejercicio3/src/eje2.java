//Lee y almacena de 10 elementos enteros en un array. Ordena el
//array usando el m�todo de inserci�n. Muestra los valores antes y despu�s de ordenar el array. 
import java.util.*;
public class eje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int vector[]=new int[10];
		int aux;
		
		System.out.println("Ingrese los n�meros.");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print("["+i+"]"+"=");
                  vector[i]=entrada.nextInt(); 
        }
        
        for(int i=0;i<10-1;i++) {
        	aux=vector[i];
        	int j=i-1;
        	while(j>=0 && vector[j]>aux){
        		vector[j+1]=vector[j];
        		vector[j]=aux;
        		j--;
        	}
        }
        
        System.out.println("numeros ordenados");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print(vector[i]);
                  
        }

	}

}
