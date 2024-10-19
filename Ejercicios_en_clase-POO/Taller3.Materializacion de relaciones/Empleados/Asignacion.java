public class Asignacion {
    private Empleado empleado;
    private Proyectos proyectos;
    public Asignacion(Empleado empleado, Proyectos proyectos) {
        this.empleado = empleado;
        this.proyectos = proyectos;
    }

    public void Asiganar(){
        System.out.println(empleado.getNombreEmpleado() + "Este usuario esta registrado en: " + proyectos.getNombre());
    }
}
