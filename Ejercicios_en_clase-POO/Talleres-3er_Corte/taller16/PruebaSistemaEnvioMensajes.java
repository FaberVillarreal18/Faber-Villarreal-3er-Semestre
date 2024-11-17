public class PruebaSistemaEnvioMensajes {
    public static void main(String[] args) {
        // Enviar correo electrónico
        Mensajero mensajeroCorreo = new Mensajero();
        mensajeroCorreo.enviarCorreo("correo@ejemplo.com", "Este es un mensaje de prueba por correo");

        // Enviar SMS
        MensajeroSMS mensajeroSMS = new MensajeroSMS();
        mensajeroSMS.enviarSMS("+1234567890", "Este es un mensaje de prueba por SMS");

        // Enviar notificación Push
        MensajeroPush mensajeroPush = new MensajeroPush();
        mensajeroPush.enviarPush("dispositivoXYZ", "Este es un mensaje de prueba por notificación Push");
    }
}
