package introduccion_poo;

class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplio años. Ahora tiene " + edad );
    }
}

public class RegistroMascotas {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "Perro", 3);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}
