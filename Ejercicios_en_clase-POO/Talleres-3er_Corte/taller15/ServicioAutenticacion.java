public class ServicioAutenticacion {
    // Método para autenticar al usuario
    public boolean autenticar(Usuario usuario, String correo, String contrasena) {
        return usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena);
    }
}
