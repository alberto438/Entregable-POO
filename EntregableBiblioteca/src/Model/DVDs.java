package Model;

import Enums.EstadoRecurso;

public class DVDs extends RecursosBiblioteca{

	private int duracion;
	private String genero;
	
	public DVDs(String nombre, int año, String autor, String editorial, EstadoRecurso estado, int duracion,
			String genero) {
		super(nombre, año, autor, editorial, estado);
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "DVDs [duracion=" + duracion + ", genero=" + genero + "]";
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
