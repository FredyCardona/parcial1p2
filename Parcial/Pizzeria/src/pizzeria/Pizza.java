package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

public abstract class Pizza<String> {
    private final String nombre;
    private double precio;
    private Masa masa;
    private Salsa salsa;
    private Queso queso;

    public Pizza(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso) {
        this.nombre = nombre;
        this.precio = precio;
        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;
    }

    public void preparar() {
        java.lang.Object System = null;
        System.out.println("Preparando " + nombre);
    }

    public void hornear() {
        System.out.println("Horneando " + nombre);
    }

    public void cortar() {
        java.lang.Object System = null;
        System.out.println("Cortando " + nombre);
    }

    public void empacar() {
        java.lang.Object System = null;
        System.out.println("Empacando " + nombre);
    }

    public abstract void especial();
}
