package EjercicioCuenta;
public class Cuenta {
    private int numeroCuenta;
    private double saldoCuenta;

    public Cuenta(int numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldoCuenta;
    }

    public void depositarDinero(double cantidad){
        saldoCuenta += cantidad;
    }

    public void retirarDinero(double cantidad){
        saldoCuenta -= cantidad;
    }
}