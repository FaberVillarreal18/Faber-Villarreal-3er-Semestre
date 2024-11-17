public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación local
        System.out.println("Autenticando localmente...");
        return usuario.equals("usuario") && contraseña.equals("contraseña123");
    }
}