package Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

import Enums.EstadoRecurso;
import Interfaces.Prestamista;
import Model.DVDs;
import Model.Libros;
import Model.Revistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Biblioteca implements Prestamista {
	
	private static ArrayList<Libros> listaLibros;
    private static ArrayList<Revistas> listaRevistas;
    private static ArrayList<DVDs> listaDvds;
	private Scanner sc;

    
    
    public Biblioteca() {

        inColecciones(); 
    }

	@Override
	public String toString() {
		return "Biblioteca [listaLibros=" + listaLibros + ", listaRevistas=" + listaRevistas + ", listaDvds="
				+ listaDvds + "]";
	}

	
	public ArrayList<Libros> getListaLibros() {
		return listaLibros;
	}

	public ArrayList<Revistas> getListaRevistas() {
		return listaRevistas;
	}

	public ArrayList<DVDs> getListaDvds() {
		return listaDvds;
	}


	public void Alquilar() {
		
		int parametro;
		sc = new Scanner(System.in);
		System.out.println("¿Que es lo que quiere  1. Libro"
											    + "2. revista"
											    + "3. DVD");
		parametro = sc.nextInt();
		sc.nextLine();
		switch(parametro) {
		case 1:
		    System.out.println("Indique el título del libro");
		    for (int i = 0; i < listaLibros.size(); i++) {
		        System.out.println((i + 1) + ". " + listaLibros.get(i).getNombre() +
		                           " (Estado: " + listaLibros.get(i).getEstado() + ")");
		    }
		    System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del libro");
		    String eleccionLibro = sc.nextLine();
		    for (int i = 0; i < listaLibros.size(); i++) {
		        if (listaLibros.get(i).getNombre().equals(eleccionLibro)) {
                    if (listaLibros.get(i).getEstado() == EstadoRecurso.DISPONIBLE) {
                        	listaLibros.get(i).setEstado(EstadoRecurso.PRESTADO);
                        	System.out.println("Has alquilado: " + eleccionLibro);
                        	System.out.println("Tiene en alquiler el libro" + eleccionLibro + " a partir del día de hoy:" + LocalDate.now() + " hasta el día " + LocalDate.now().plusDays(30));
                    }
                    break;
		        }else {
                    System.out.println("El libro no está disponible.");
                    break;
                }
		    }
			break;
			case 2: 
				System.out.println("Indique el título de la revista");
				for (int i = 0; i < listaRevistas.size(); i++) {
					System.out.println((i + 1) + ". " + listaRevistas.get(i).getNombre() + 
							" (Estado: " + listaRevistas.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo de la revista");
				String eleccionRevista;
				eleccionRevista = sc.nextLine();
				    for (int i = 0; i < listaRevistas.size(); i++) {
				    	if (listaRevistas.get(i).getNombre().equals(eleccionRevista)) {
	                        if (listaRevistas.get(i).getEstado() == EstadoRecurso.DISPONIBLE) {
	                        	System.out.println("Has alquilado: " + eleccionRevista);
				            break;
				        }else {
                            System.out.println("La revista no está disponible.");
                            break;
                        }
				    }
				    }
				break;
			case 3: 
				System.out.println("Indique el título del DVD");
				for (int i = 0; i < listaDvds.size(); i++) {
					System.out.println((i + 1) + ". " + listaDvds.get(i).getNombre() + 
							" (Estado: " + listaDvds.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del DVD");
				String eleccionDVD;
				eleccionDVD = sc.nextLine();
				    for (int i = 0; i < listaDvds.size(); i++) {
				    	if (listaDvds.get(i).getNombre().equals(eleccionDVD)) {
	                        if (listaDvds.get(i).getEstado() == EstadoRecurso.DISPONIBLE) {
				            System.out.println("Has alquilado: " + eleccionDVD);
				            break;
				        }else {
                            System.out.println("El DVD no está disponible.");
                            break;
                        }
				    	} 
				    }
		}
	}
		public void Reservar() {
			int parametro;
			sc = new Scanner(System.in);
			System.out.println("¿Que es lo que quiere un 1. Libro"
													  + "2. revista"
													  + "3. DVD");
			parametro = sc.nextInt();
			sc.nextLine();
			switch(parametro) {
			case 1:
				System.out.println("Indique el título del libro");
				for (int i = 0; i < listaLibros.size(); i++) {
		            System.out.println((i + 1) + ". " + listaLibros.get(i).getNombre() + 
		            				   " (Disponibilidad: " + listaLibros.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del libro");
				String eleccionLibro = sc.nextLine();
			    for (int i = 0; i < listaLibros.size(); i++) {
			        if (listaLibros.get(i).getNombre().equals(eleccionLibro)) {
	                    if (listaLibros.get(i).getEstado() == EstadoRecurso.DISPONIBLE) {
	                        listaLibros.get(i).setEstado(EstadoRecurso.RESERVADO);
			            System.out.println("Has reservado: " + eleccionLibro);
			            break;
			        }else {
                        System.out.println("El libro no está disponible.");
                        break;
                    }
			    }
			break;
                        }
				        
			case 2: 
				System.out.println("Indique el título de la revista");
				for (int i = 0; i < listaRevistas.size(); i++) {
		            System.out.println((i + 1) + ". " + listaRevistas.get(i).getNombre() + 
		            		" (Estado: " + listaRevistas.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo de la revista");
				String eleccionRevista;
				eleccionRevista = sc.nextLine();
				    for (int i = 0; i < listaRevistas.size(); i++) {
				        if (listaRevistas.get(i).getNombre().equals(eleccionRevista)) {
				        	listaDvds.get(i).setEstado(EstadoRecurso.PRESTADO);
				            System.out.println("Has reservado: " + eleccionRevista);
				            break;
				        }else {
                            System.out.println("La revista no está disponible.");
                            break;
                        }
				    }
				break;
			case 3: 
				System.out.println("Indique el título del DVD");
				for (int i = 0; i < listaDvds.size(); i++) {
		            System.out.println((i + 1) + ". " + listaDvds.get(i).getNombre() + 
		            		" (Estado: " + listaDvds.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del DVD");
				String eleccionDVD;
				eleccionDVD = sc.nextLine();
				    for (int i = 0; i < listaDvds.size(); i++) {
				        if (listaDvds.get(i).getNombre().equals(eleccionDVD)) {
				        	listaDvds.get(i).setEstado(EstadoRecurso.PRESTADO);
				            System.out.println("Has reservado: " + eleccionDVD);
				            break;
				        }else {
                            System.out.println("El DVD no está disponible.");
                            break;
                        }
				    }
				break;
			
			
		}
	}
		public void Listar() {
			int parametro;
			sc = new Scanner(System.in);
			System.out.println("¿Que es lo que quiere un 1. Libro"
													  + "2. revista"
													  + "3. DVD");
			parametro = sc.nextInt();
			sc.nextLine();
			switch(parametro) {
			case 1:
				System.out.println("Indique el título del libro");
				for (int i = 0; i < listaLibros.size(); i++) {
		            System.out.println((i + 1) + ". " + listaLibros.get(i).getNombre() + 
		            				   " (Disponibilidad: " + listaLibros.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del libro");
				String eleccionLibro = sc.nextLine();
			    for (int i = 0; i < listaLibros.size(); i++) {
			        if (listaLibros.get(i).getNombre().equals(eleccionLibro)) {
	                    if (listaLibros.get(i).getEstado() == EstadoRecurso.DISPONIBLE) {
	                        listaLibros.get(i).setEstado(EstadoRecurso.RESERVADO);
			            System.out.println("Has reservado: " + eleccionLibro);
			            break;
			        }else {
                        System.out.println("El libro no está disponible.");
                        break;
                    }
			    }
			break;
                        }
				        
			case 2: 
				System.out.println("Indique el título de la revista");
				for (int i = 0; i < listaRevistas.size(); i++) {
		            System.out.println((i + 1) + ". " + listaRevistas.get(i).getNombre() + 
		            		" (Estado: " + listaRevistas.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo de la revista");
				String eleccionRevista;
				eleccionRevista = sc.nextLine();
				    for (int i = 0; i < listaRevistas.size(); i++) {
				        if (listaRevistas.get(i).getNombre().equals(eleccionRevista)) {
				        	listaDvds.get(i).setEstado(EstadoRecurso.PRESTADO);
				            System.out.println("Has reservado: " + eleccionRevista);
				            break;
				        }else {
                            System.out.println("La revista no está disponible.");
                            break;
                        }
				    }
				break;
			case 3: 
				System.out.println("Indique el título del DVD");
				for (int i = 0; i < listaDvds.size(); i++) {
		            System.out.println((i + 1) + ". " + listaDvds.get(i).getNombre() + 
		            		" (Estado: " + listaDvds.get(i).getEstado() + ")");
		        }
				System.out.println("Por favor, copie (ctrl+c) y pegue (ctrl+v) el titulo del DVD");
				String eleccionDVD;
				eleccionDVD = sc.nextLine();
				    for (int i = 0; i < listaDvds.size(); i++) {
				        if (listaDvds.get(i).getNombre().equals(eleccionDVD)) {
				        	listaDvds.get(i).setEstado(EstadoRecurso.PRESTADO);
				            System.out.println("Has reservado: " + eleccionDVD);
				            break;
				        }else {
                            System.out.println("El DVD no está disponible.");
                            break;
                        }
				    }
				break;
			
			
		}
	}

	public static void inColecciones() {
		listaLibros.add(new Libros("Cien años de soledad", 1967, "Gabriel García Márquez", "Sudamericana", EstadoRecurso.DISPONIBLE, "Dura", 417));
		listaLibros.add(new Libros("Don Quijote de la Mancha", 1605, "Miguel de Cervantes", "Francisco de Robles", EstadoRecurso.DISPONIBLE, "Blanda", 863));
		listaLibros.add(new Libros("El Señor de los Anillos", 1954, "J.R.R. Tolkien", "Allen & Unwin", EstadoRecurso.DISPONIBLE, "Dura", 1178));
		listaLibros.add(new Libros("1984", 1949, "George Orwell", "Secker & Warburg", EstadoRecurso.DISPONIBLE, "Blanda", 328));
		listaLibros.add(new Libros("Fahrenheit 451", 1953, "Ray Bradbury", "Ballantine Books", EstadoRecurso.DISPONIBLE, "Blanda", 194));
		listaLibros.add(new Libros("La sombra del viento", 2001, "Carlos Ruiz Zafón", "Planeta", EstadoRecurso.DISPONIBLE, "Dura", 565));
	
		listaRevistas.add(new Revistas("Revista Cultura Hoy", 2025, "Ana Pérez", "Editorial Cultura", EstadoRecurso.DISPONIBLE, "Cultura"));
		listaRevistas.add(new Revistas("Ciencia Actual", 2025, "Luis Gómez", "Editorial Ciencia", EstadoRecurso.DISPONIBLE, "Ciencia"));
		listaRevistas.add(new Revistas("Salsa Rosa Magazine", 2025, "María López", "Editorial Rosa", EstadoRecurso.DISPONIBLE, "Salsa Rosa"));
		listaRevistas.add(new Revistas("Deportes al Día", 2025, "Carlos Sánchez", "Editorial Deportes", EstadoRecurso.DISPONIBLE, "Deportes"));
		listaRevistas.add(new Revistas("Naturaleza Viva", 2025, "Laura Martínez", "Editorial Naturaleza", EstadoRecurso.DISPONIBLE, "Naturaleza"));
		
		listaDvds.add(new DVDs("El Padrino", 1972, "Francis Ford Coppola", "Paramount", EstadoRecurso.DISPONIBLE, 175, "drama"));
		listaDvds.add(new DVDs("La La Land", 2016, "Damien Chazelle", "Summit", EstadoRecurso.DISPONIBLE, 128, "romántica"));
		listaDvds.add(new DVDs("Forrest Gump", 1994, "Robert Zemeckis", "Paramount", EstadoRecurso.DISPONIBLE, 142, "drama"));
		listaDvds.add(new DVDs("El secreto de sus ojos", 2009, "Juan José Campanella", "100 Bares", EstadoRecurso.DISPONIBLE, 129, "suspense"));
		listaDvds.add(new DVDs("Super Size Me", 2004, "Morgan Spurlock", "Hart Sharp", EstadoRecurso.DISPONIBLE, 100, "documental"));
		
    }

	@Override
	public void Devolver() {
		// TODO Auto-generated method stub
		
	}
	
    
    
}
