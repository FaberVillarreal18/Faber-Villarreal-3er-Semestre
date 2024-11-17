public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación usando OAuth
        System.out.println("Autenticando usando OAuth...");
        return usuario.equals("oauthUser") && contraseña.equals("oauthToken");
    }
}
