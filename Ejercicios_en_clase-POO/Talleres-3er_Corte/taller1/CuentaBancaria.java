public class CuentaBancaria {
    protected String n_cuenta;
    protected double saldo;
    protected String tipo;

    public CuentaBancaria(){
        this.n_cuenta = null;
        this.saldo = 0;
        this.tipo = null;
    }

    public CuentaBancaria(String n_cuenta, String tipo) {
        this.n_cuenta = n_cuenta;
        this.tipo = tipo;
    }


    public CuentaBancaria(String n_cuenta, double saldo, String tipo) {
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [n_cuenta=" + n_cuenta + ", saldo=" + saldo + ", tipo=" + tipo + "]";
    }
}
