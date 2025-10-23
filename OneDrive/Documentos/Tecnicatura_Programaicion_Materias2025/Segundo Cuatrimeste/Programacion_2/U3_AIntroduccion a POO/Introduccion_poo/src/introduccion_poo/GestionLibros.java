package introduccion_poo;

class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    // Setter con validación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 1400 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Año invalido. No se modifico el valor.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion);
    }
}

public class GestionLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupery", 1943);
        libro1.mostrarInfo();
        libro1.setAñoPublicacion(3000); 
        libro1.setAñoPublicacion(2005); 
        libro1.mostrarInfo();
    }
}
