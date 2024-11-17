public class PruebaSistemaAutenticacion {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Juan Pérez", "juan.perez@example.com", "contrasena123");

        // Crear servicios de validación y autenticación
        ServicioValidacion servicioValidacion = new ServicioValidacion();
        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion();

        // Validar correo y contraseña
        if (servicioValidacion.validarCorreo(usuario)) {
            System.out.println("Correo válido.");
        } else {
            System.out.println("Correo no válido.");
        }

        if (servicioValidacion.validarContrasena(usuario)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no válida.");
        }

        // Autenticar al usuario
        if (servicioAutenticacion.autenticar(usuario, "juan.perez@example.com", "contrasena123")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }
    }
}

