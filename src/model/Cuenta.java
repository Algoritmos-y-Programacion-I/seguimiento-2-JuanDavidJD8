package model;

public class Cuenta {
    private String nombreBanco;
    private TipoCuenta tipoCuenta;
    private double saldo; 

    public Cuenta(String nombreBanco, TipoCuenta tipoCuenta, double saldo){
        this.nombreBanco = nombreBanco;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto){
        if (monto > 0){saldo +=;}
        return saldo;
    }

    public double retirar( double monto){
        if (saldo > 0 && monto > 0) {saldo -=;}
        return saldo;
    }


}




