public class PruebaMantenimiento {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        Reparacion reparador = new Reparador();
        Limpieza limpiador = new Limpiador();
        MantenimientoCompleto mantenimiento = new MantenimientoCompleto();

        // Ejecutar tareas de mantenimiento
        reparador.reparar();  // Se espera que solo se imprima "Realizando reparaciones."
        limpiador.limpiar();  // Se espera que solo se imprima "Realizando limpieza."
        mantenimiento.reparar();  // Se espera que imprima "Realizando reparaciones."
        mantenimiento.limpiar();  // Se espera que imprima "Realizando limpieza."
    }
}

