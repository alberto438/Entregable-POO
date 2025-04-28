package Model;

import Enums.EstadoRecurso;

public abstract class RecursosBiblioteca {

	private String nombre;
	private int año;
	private String autor;
	private String editorial;
	private EstadoRecurso estado;
	
	public RecursosBiblioteca(String nombre, int año, String autor, String editorial, EstadoRecurso estado) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.autor = autor;
		this.editorial = editorial;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "recursosBiblioteca [nombre=" + nombre + ", año=" + año + ", autor=" + autor + ", editorial=" + editorial
				+ ", estado=" + estado + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setEstado(EstadoRecurso estado) {
        this.estado = estado;
    }
	public EstadoRecurso getEstado() {
	    return estado;
	}
	
	
}
