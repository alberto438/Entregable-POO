package Model;

import Enums.EstadoRecurso;

public class Revistas extends RecursosBiblioteca{
	
	private String tematica;

	public Revistas(String nombre, int año, String autor, String editorial, EstadoRecurso estado, String tematica) {
		super(nombre, año, autor, editorial, estado);
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Revistas [tematica=" + tematica + "]";
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	
	
}
