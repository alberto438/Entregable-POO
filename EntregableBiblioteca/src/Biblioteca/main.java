package Biblioteca;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int accion;
		Biblioteca Biblioteca = new Biblioteca();
		while (true) { 
			System.out.println("Hola, buenos días, bienvenido a la biblioteca "
								+ "virtual Tenemos lo que buscas");
			System.out.println("¿Que es lo que deseas, alquilar, reservar, devolver o buscar"
								+ " un producto?");
			System.out.println("1. Alquilar");
			System.out.println("2. Reservar");
			System.out.println("3. Devolver");
			System.out.println("4. Buscar");
			accion = sc.nextInt();
			switch (accion) {
				case 1: 
					Biblioteca.Alquilar();
					break;
				case 2:
					Biblioteca.Reservar();
					break;
					/*case 3:
					Devolver();
					break;
				case 4:
					Buscar();			
					break;
				*/
				default:
					System.out.println("Elija por favor entre las 4 opciones disponibless");
					break;
			}
		} 
			

	}

	
}