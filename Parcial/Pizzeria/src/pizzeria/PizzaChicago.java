package pizzeria;

import ingrediente.Masa;
import ingrediente.Override;
import ingrediente.Salsa;
import ingrediente.Queso;

public class PizzaChicago<String> extends Pizza {
    private final String grosorMasa;

    public PizzaChicago(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String grosorMasa) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.grosorMasa = grosorMasa;
    }

    @Override
    public void especial() {
        java.lang.Object System = null;
        System.out.println("Grosor de la masa: " + grosorMasa);
    }
}
