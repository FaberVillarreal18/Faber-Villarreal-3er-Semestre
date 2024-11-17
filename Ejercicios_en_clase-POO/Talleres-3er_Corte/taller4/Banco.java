public class Banco {
    
    protected double saldo;


    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso: $" + cantidad);
        } else {
            System.out.println("Cantidad a depositar debe ser positiva.");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: $" + cantidad);
        } else {
            System.out.println("Retiro no exitoso. Verifique la cantidad.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

