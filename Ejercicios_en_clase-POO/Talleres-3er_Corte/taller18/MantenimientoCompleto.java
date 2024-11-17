public class MantenimientoCompleto implements Reparacion, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Realizando reparaciones.");
    }

    @Override
    public void limpiar() {
        System.out.println("Realizando limpieza.");
    }
}
