package Model;

import Enums.EstadoRecurso;

public class Libros extends RecursosBiblioteca{

	private String pasta;
	private int volumen;
	
	public Libros(String nombre, int año, String autor, String editorial, EstadoRecurso estado, String pasta,
			int volumen) {
		super(nombre, año, autor, editorial, estado);
		this.pasta = pasta;
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Libros [pasta=" + pasta + ", volumen=" + volumen + " hojas]";
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	

	
}
