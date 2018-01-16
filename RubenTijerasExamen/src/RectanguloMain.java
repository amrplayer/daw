import java.util.*;

public class RectanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); // Scanner de introducci�n

		Rectangulo rectanguloA = new Rectangulo(); // Establezco todos los rectangulos que hay

		Rectangulo rectanguloB = new Rectangulo(52.3, 21.5);

		Rectangulo rectanguloC = new Rectangulo(2.1, 8.3);

		Rectangulo rectanguloD = new Rectangulo();
		rectanguloD.setBase(70.4); // seteo base y altura con el constructor por defecto
		rectanguloD.setAltura(20.7);

		Rectangulo rectanguloE = new Rectangulo(6.8, 1.9);

		Rectangulo rectanguloF = new Rectangulo(1.9, 6.8);

		// VARIABLES

		int opcion; // para el men�
		int n; // contadores para los while/for
		double baseA, alturaA, baseG, alturaG, baseB, alturaB; // variables
		alturaA = 0;

		do { // Para que las opciones salgan antes de entrar al men� las ponemos en el bucle
				// pero fuera de �l.
				// OPCIONES
			System.out.println("Las opciones disponibles son:");
			System.out.println("Opci�n 1: Completar datos del rect�ngulo A");
			System.out.println("Opci�n 2: Crear un nuevo rect�ngulo (rect�ngulo G)");
			System.out.println("Opci�n 3: Mostrar rect�ngulo B");
			System.out.println("Opci�n 4: Modificar rect�ngulo B");
			System.out.println("Opci�n 5: Calcular �rea del rect�ngulo C");
			System.out.println("Opcion 6: Cacular per�metro del rect�ngulo C");
			System.out.println("Opci�n 7: Calcular diagonal del rect�ngulo C");
			System.out.println("Opci�n 8: Invertir atributos del rect�ngulo D");
			System.out.println("Opci�n 9: Cambiar tama�o por porcentaje del rect�ngulo C.");
			System.out.println("Opci�n 10: Operar rect�ngulos E-F y D-C");
			System.out.println("Opci�n 11: Cambiar el rectanguloC a un cuadrado");
			System.out.println("Opci�n 12: Introduce 12 para salir.");
			System.out.println("�Qu� opci�n quieres realizar?");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1: // Completar datos para el rectangulo A creado previamente creado por defecto
				do {
					System.out.println("Introducir la base");
					baseA = entrada.nextDouble();
					if (baseA > 0) {
						rectanguloA.setBase(baseA);
					}
				} while (baseA <= 0); // Bucle para asegurar que la base es mayor que 0

				while (alturaA <= 0) {
					System.out.println("Introducir la altura");
					alturaA = entrada.nextDouble();
					if (alturaA > 0) {
						rectanguloA.setAltura(alturaA);
					}

				}
				break;

			case 2: // Crea el rectangulo G y le da valores por pantalla
				Rectangulo rectanguloG = new Rectangulo(); // creamos el item rectanguloG

				do {
					System.out.println("Introducir la base"); // filtramos y asiganmos el valor de la base y altura de G
					baseG = entrada.nextDouble();
					if (baseG > 0) { // Si el valor no es mayor a 0 volver� a pedirlo hasta que lo sea
						rectanguloG.setBase(baseG);
					}
				} while (baseG <= 0);

				do {
					System.out.println("Introducir la base");
					alturaG = entrada.nextDouble();
					if (alturaG > 0) {
						rectanguloG.setBase(baseG);
					}
				} while (baseG <= 0);

				break;

			case 3: // Saca los valores del rect�ngulo B por pantalla

				System.out.println(
						"La base de B es " + rectanguloB.getBase() + " y la altura es " + rectanguloB.getAltura()); // Utilizamos
																													// el
																													// getter
																													// para
																													// sacar
																													// info
				break;

			case 4: // Modifica los valores del rect�ngulo B recibidos por pantalla.

				do {
					System.out.println("Introducir la nueva base del rect�ngulo B");
					baseB = entrada.nextDouble();
					if (baseB > 0) {
						rectanguloB.setBase(baseB);
					}
				} while (baseB <= 0);

				do {
					System.out.println("Introducir la altura");
					alturaB = entrada.nextDouble();
					if (alturaB > 0) {
						rectanguloB.setAltura(alturaB);
					}
				} while (alturaB <= 0);

				break;

			case 5: // Calcula el �rea del rect�ngulo C

				System.out.println("El �rea del rect�ngulo C es " + rectanguloC.area());

				break;

			case 6: // Calcular el per�metro del rect�ngulo C

				System.out.println("El per�metro del rect�ngulo C es " + rectanguloC.perimetro());

				break;

			case 7: // Calcular la diagonal del rect�ngulo C

				System.out.println("La diagonal del rect�ngulo C es " + rectanguloC.diagonal());

				break;

			case 8: // Invertir valores de B

				System.out.println("La base sin invertir del rect�ngulo B es " + rectanguloB.getBase()
						+ " y la altura es " + rectanguloB.getAltura());
				rectanguloB.invierte(); // Invertimos los valores de B para sacarlos por pantalla
				System.out.println("La base invertida del rect�ngulo B es " + rectanguloB.getBase() + " y la altura es "
						+ rectanguloB.getAltura());

				break;

			case 9: // Cambiar tama�o.
				int max, a; // Variables necesarias para este case.

				System.out.println("Introduce el primer n�mero");
				max = entrada.nextInt(); // El primer valor ser� el maximo hasta ahora as� que lo almacenamos
											// directamente ah�, por ahora.

				for (n = 0; n < 4; n++) { // Pedimos 4 n�meros ya que antes habiamos pedido uno
					System.out.println("Introducir otro n�mero");
					a = entrada.nextInt();

					if (a > max) // Si el nuevo valor es mayor a max se modifica max.
						max = a;
				}

				if (rectanguloC.cambiaTamano(max) == true) { // Cambiamos el tama�o y sacamos por pantalla la
																// informaci�n modificada
					System.out.println("La base del rect�ngulo C modificada es " + rectanguloC.getBase()
							+ " y la altura es " + rectanguloC.getAltura());
					System.out.println("El valor usado ha sido " + max); // Informamos de cual de los 5 valores se ha
																			// usado
				}

				else {
					System.out.println("No se ha podido modificar el tama�o"); // Si no se puede cambiar el tama�o
																				// sacamos por pantalla este mensaje
				}

				break;

			case 10: // Operar entre E-F y C-D. Saca mensaje y resultado si funciona y mensaje si no.

				if (rectanguloE.opera(rectanguloF) == true) { // Si funciona sacar� el resultado, sino sacar� un mensaje
																// de informaci�n (ambos casos)

					System.out.println("La base resultante es " + rectanguloE.getBase() + " y la altura es "
							+ rectanguloE.getAltura());
				} else {
					System.out.println("La operaci�n entre los rect�ngulos E y F no se ha podido realizar.");
				}

				if (rectanguloD.opera(rectanguloC) == true) {

					System.out.println("La base resultante es " + rectanguloD.getBase() + " y la altura es "
							+ rectanguloD.getAltura());
				} else {
					System.out.println("La operaci�n entre los rect�ngulos D y C no se ha podido realizar.");

				}

				break;

			case 11: // Cambia el rectanguloC a cuadrado

				if (rectanguloC.cambiaACuadrado() == true) { // En caso de poder saca los nuevos valores. Sino saca un
																// mensaje de informaci�n
					System.out.println("El lado de C ahora vale " + rectanguloC.getAltura());
				}

				else {
					System.out.println("No se ha podido cambiar a cuadrado");
				}

				break;

			case 12:
				System.out.println("Hasta luego profesora, tenga un buen d�a :)");
				break;

			default:
				System.out.println("Opci�n no v�lida, redireccionando al inicio.");
				break;

			}
			System.out.print("\n");
		} while (opcion != 12);

	}

}
