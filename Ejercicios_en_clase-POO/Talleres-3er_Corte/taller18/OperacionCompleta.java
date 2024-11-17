public class OperacionCompleta implements Transferencia, PagoFactura {
    @Override
    public void transferir() {
        System.out.println("Realizando transferencia.");
    }

    @Override
    public void pagarFactura() {
        System.out.println("Realizando pago de factura.");
    }
}