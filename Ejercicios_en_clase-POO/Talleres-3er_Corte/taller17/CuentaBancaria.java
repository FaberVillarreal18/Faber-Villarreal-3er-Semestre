public abstract class CuentaBancaria {
    protected double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente o cantidad inválida.");
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método abstracto para los detalles específicos de la cuenta
    public abstract void detallesCuenta();
}
