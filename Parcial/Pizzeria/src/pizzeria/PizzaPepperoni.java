package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

public class PizzaPepperoni extends Pizza {
    private final String tipoPepperoni;

    public PizzaPepperoni(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String tipoPepperoni) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.tipoPepperoni = tipoPepperoni;
    }

    @Override
    public void especial() {
        System.out.println("Tipo de pepperoni: " + tipoPepperoni);
    }
}
