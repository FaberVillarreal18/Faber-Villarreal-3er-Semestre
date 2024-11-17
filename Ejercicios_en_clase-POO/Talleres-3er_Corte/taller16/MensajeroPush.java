public class MensajeroPush extends Mensajero {
    public void enviarPush(String dispositivoDestinatario, String mensaje) {
        System.out.println("Enviando notificación Push a: " + dispositivoDestinatario);
        System.out.println("Mensaje: " + mensaje);
        // Lógica para enviar notificación Push
    }
}

