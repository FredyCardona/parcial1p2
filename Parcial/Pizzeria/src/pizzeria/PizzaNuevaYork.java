package pizzeria;

import ingrediente.Masa;
import ingrediente.Override;
import ingrediente.Salsa;
import ingrediente.Queso;

public class PizzaNuevaYork<String> extends Pizza {
    private final String estiloCorte;

    public PizzaNuevaYork(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String estiloCorte) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void especial() {
        java.lang.Object System = null;
        System.out.println("Estilo de corte: " + estiloCorte);
    }
}
