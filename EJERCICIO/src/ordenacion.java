
public class ordenacion {


	public static void seleccion(int[] array) {
		//Declaraci�n de variables
		int posicion;
		int aux;
		
		//M�todo de la selecci�n orden creciente
		for(int i=0; i<=array.length-2;i++) {
			int menor= array[i];
			posicion=i;
			for(int j=i+1;j<=array.length-1;j++) {
				if(array[j]<menor) {
					menor=array[j];
					posicion=j;
				}
			}
			if(posicion!=i) {
				aux=array[i];
				array[i]=array[posicion];
				array[posicion]=aux;
			}
		}//for

		
		
		
	}
	

	

}
