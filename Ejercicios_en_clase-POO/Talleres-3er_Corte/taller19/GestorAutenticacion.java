// Clase que gestiona la autenticación
public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    // Constructor que recibe un servicio de autenticación
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    // Método para autenticar a un usuario
    public void autenticarUsuario(String usuario, String contraseña) {
        if (servicioAutenticacion.autenticar(usuario, contraseña)) {
            System.out.println("Autenticación exitosa");
        } else {
            System.out.println("Autenticación fallida");
        }
    }
}

