package introduccion_poo;

class NaveEspacial {
    String nombre;
    double combustible;
    final double LIMITE_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 2; // Cada unidad de distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar esa distancia.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Total: " + combustible);
        } else {
            System.out.println("No se puede superar el límite de " + LIMITE_COMBUSTIBLE);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }
}

public class SimulacionNave {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Robert", 50);
        nave1.mostrarEstado();
        nave1.avanzar(10); // insuficiente
        nave1.recargarCombustible(40);
        nave1.despegar();
        nave1.avanzar(15);
        nave1.mostrarEstado();
    }
}
