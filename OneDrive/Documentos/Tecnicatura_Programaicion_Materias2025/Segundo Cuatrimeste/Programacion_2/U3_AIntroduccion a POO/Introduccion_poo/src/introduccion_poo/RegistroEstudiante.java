package introduccion_poo;

class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificacion ha aumentado a " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("La calificacion ha disminuido a " + calificacion);
    }
}

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Camila", "Rissi", "Programacion", 8.5);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(0.5);
        estudiante1.bajarCalificacion(0.3);
        estudiante1.mostrarInfo();
    }
}
