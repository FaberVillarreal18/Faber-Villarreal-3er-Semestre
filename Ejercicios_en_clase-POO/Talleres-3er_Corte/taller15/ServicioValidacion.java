public class ServicioValidacion {
    // Método para validar el correo electrónico
    public boolean validarCorreo(Usuario usuario) {
        return usuario.getCorreo().contains("@");
    }

    // Método para validar la contraseña
    public boolean validarContrasena(Usuario usuario) {
        return usuario.getContrasena().length() >= 8;
    }
}

