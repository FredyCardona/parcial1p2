package pizzeria;

import ingrediente.Masa;
import ingrediente.Override;
import ingrediente.Salsa;
import ingrediente.Queso;

public class PizzaHawaiana<String> extends Pizza {
    private final String ingredientesExtra;

    public PizzaHawaiana(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String ingredientesExtra) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.ingredientesExtra = ingredientesExtra;
    }

    @Override
    public void especial() {
        java.lang.Object System = null;
        System.out.println("Ingredientes extra: " + ingredientesExtra);
    }
}