public class Cliente {

    private String nombre;
    private String apellido;
    private String numIdentificacion;
    EjercicioCuenta.Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String numIdentificacion, EjercicioCuenta.Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIdentificacion = numIdentificacion;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return numIdentificacion;
    }

    //retorno el saldo de la cuenta
    public double consultarSaldo(int indice){
        return cuentas[indice].getSaldo();
    }

    //Creamos el metodo para ingresar dinero
    public void ingresarDinero(int indice,double cantidad){
        cuentas[indice].depositarDinero(cantidad);
    }

    //Creamos el metodo para retirar dinero
    public void retirarDinero(int indice,double cantidad){
        cuentas[indice].retirarDinero(cantidad);
    }
}
