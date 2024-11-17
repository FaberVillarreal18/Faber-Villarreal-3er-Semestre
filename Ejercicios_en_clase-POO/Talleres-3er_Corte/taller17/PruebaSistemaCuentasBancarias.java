public class PruebaSistemaCuentasBancarias {
    public static void main(String[] args) {
        // Crear una CuentaBancaria genérica
        CuentaBancaria cuenta1 = new CuentaBancaria(1000) {
            @Override
            public void detallesCuenta() {
                System.out.println("Cuenta Bancaria - Saldo: " + saldo);
            }
        };

        // Crear una CuentaAhorros
        CuentaAhorros cuentaAhorros = new CuentaAhorros(5000, 2.5);

        // Realizar operaciones en ambas cuentas
        cuenta1.depositar(500); // Depositar en cuenta1
        cuenta1.retirar(200); // Retirar de cuenta1
        cuentaAhorros.depositar(1000); // Depositar en cuenta de ahorros
        cuentaAhorros.aplicarInteres(); // Aplicar interés en cuenta de ahorros

        // Consultar saldos
        System.out.println("Saldo de cuenta1: " + cuenta1.consultarSaldo());
        System.out.println("Saldo de cuentaAhorros: " + cuentaAhorros.consultarSaldo());

        // Mostrar detalles de ambas cuentas
        cuenta1.detallesCuenta();
        cuentaAhorros.detallesCuenta();
    }
}
