package ingrediente;

public class Salsa<String> implements Ingrediente {
    private final String sabor;
    private int cantidad;

    public Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
