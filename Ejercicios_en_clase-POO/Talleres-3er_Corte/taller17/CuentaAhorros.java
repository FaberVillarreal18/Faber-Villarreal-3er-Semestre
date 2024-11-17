public class CuentaAhorros extends CuentaBancaria {
    private double tasaDeInteres;

    // Constructor que recibe el saldo inicial y la tasa de interés
    public CuentaAhorros(double saldoInicial, double tasaDeInteres) {
        super(saldoInicial);
        this.tasaDeInteres = tasaDeInteres;
    }

    // Método para calcular y agregar el interés al saldo
    public void aplicarInteres() {
        double interes = saldo * tasaDeInteres / 100;
        saldo += interes;
    }

    // Implementación del método abstracto de la clase base
    @Override
    public void detallesCuenta() {
        System.out.println("Cuenta de Ahorros - Saldo: " + saldo + ", Tasa de Interés: " + tasaDeInteres + "%");
    }
}

