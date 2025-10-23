package introduccion_poo;

class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " - Huevos puestos: " + huevosPuestos);
    }
}

public class GranjaDigital {
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 3);

        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
