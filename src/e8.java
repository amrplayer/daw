//Dise�ar una aplicaci�n que declare un array de 10 elementos enteros. Leer
//mediante el teclado 8 n�meros. Despu�s se debe pedir un n�mero y una
//posici�n, insertarlo en la posici�n indicada, desplazando los que est�n detr�s. 
import java.util.*;
public class e8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int pos,num;
		
		int[] numeros=new int[10];
		
		for(int i=0;i<8;i++) {//rellenamos el array de datos
			System.out.println((i+1)+".introduce numero");
			numeros[i]=entrada.nextInt();
		}

		//entrada nueva posicion y numero
		
		do {
			System.out.println("introduce posicion del nuevo numero");
			pos=entrada.nextInt();
		}while(pos>9 || pos<0);
		
		System.out.println("introduce nuevo numero");
		num=entrada.nextInt();	
		
		if(pos>=8) {//no habria que hacer desplazamiento
			numeros[pos]=num;
		}else {//se hace desplazamiento
			for(int i=9;i>pos;i--) {
				numeros[i]=numeros[i-1];
			}
			numeros[pos]=num;
		}
			
		//resultado
		for(int i=0;i<10;i++) {
			System.out.println("posicion "+(i+1)+"-"+numeros[i]);
		}
	}
	
		
	
		

}
