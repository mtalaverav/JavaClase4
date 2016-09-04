package py.edu.uaa.poo.mtalavera;

public class Libro {
	private Persona autor;
	private String titulo;
	private Edicion edicionLibro;
	private Ejemplar ejemplar;
	private String recomendacion; 
	
	
	
	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Edicion getEdicionLibro() {
		return edicionLibro;
	}
	public void setEdicionLibro(Edicion edicionLibro) {
		this.edicionLibro = edicionLibro;
	}
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	public String getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
	
	

}
