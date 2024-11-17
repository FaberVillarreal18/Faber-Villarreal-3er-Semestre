public class PruebaOperacionesBancarias {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        Transferencia transferencia = new OperacionTransferencia();
        Retiro retiro = new OperacionRetiro();
        PagoFactura pagoFactura = new OperacionPagoFactura();
        OperacionCompleta operacionCompleta = new OperacionCompleta();

        // Ejecutar operaciones bancarias
        transferencia.transferir();  // Se espera que imprima: "Realizando transferencia."
        retiro.retirar();            // Se espera que imprima: "Realizando retiro."
        pagoFactura.pagarFactura();  // Se espera que imprima: "Realizando pago de factura."
        operacionCompleta.transferir();  // Se espera que imprima: "Realizando transferencia."
        operacionCompleta.pagarFactura();  // Se espera que imprima: "Realizando pago de factura."
    }
}
