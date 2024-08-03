package sucursal;

public class Equipo<String> {
    private final String tipo;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
    }

    public void encender() {
        java.lang.Object System = null;
        System.out.println(tipo + " está encendido.");
    }

    public void apagar() {
        java.lang.Object System = null;
        System.out.println(tipo + " está apagado.");
    }

    public void reparar() {
        System.out.println(tipo + " está siendo reparado.");
    }
}
