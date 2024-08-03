package sucursal;

public class Empleado<String> {
    private final String nombre;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void trabajar() {
        java.lang.Object System = null;
        System.out.println(nombre + " está trabajando.");
    }

    public void tomarOrden() {
        java.lang.Object System = null;
        System.out.println(nombre + " está tomando una orden.");
    }
}
