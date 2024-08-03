package sucursal;

import ingrediente.Ingrediente;
import pizzeria.Pizza;

public class Sucursal<String> {
    private final List<Empleado> empleados;
    private final List<Ingrediente> ingredientes;
    private final List<Equipo> equipos;
    private final List<Pizza> especialidades;

    public Sucursal(String nombre  ) {
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Pizza pizza) {
        especialidades.add(pizza);
    }
}
