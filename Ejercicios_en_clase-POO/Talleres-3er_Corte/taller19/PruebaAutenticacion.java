public class PruebaAutenticacion {
    public static void main(String[] args) {
        // Crear instancias de los servicios de autenticación
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();

        // Crear el gestor de autenticación, pasando el servicio de autenticación como parámetro
        GestorAutenticacion gestorAutenticacionLocal = new GestorAutenticacion(autenticacionLocal);
        GestorAutenticacion gestorAutenticacionOAuth = new GestorAutenticacion(autenticacionOAuth);

        // Probar ambos métodos de autenticación
        gestorAutenticacionLocal.autenticarUsuario("usuario", "contraseña123");  // Debería imprimir: Autenticación exitosa
        gestorAutenticacionOAuth.autenticarUsuario("oauthUser", "oauthToken");   // Debería imprimir: Autenticación exitosa

        // Intentar autenticación fallida
        gestorAutenticacionLocal.autenticarUsuario("usuario", "wrongPassword"); // Debería imprimir: Autenticación fallida
    }
}
