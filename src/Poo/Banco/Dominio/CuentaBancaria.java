package Poo.Banco.Dominio;

public class CuentaBancaria {
    public String numero;
    public double balance;
    public String contrasena;
    public String tipo;
    public Persona titular;
    public Banco banco;

    public CuentaBancaria(String numero, double balance, String contrasena, String tipo, Persona titular, Banco banco) {
        this.numero = numero;
        this.balance = balance;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.titular = titular;
        this.banco = banco;
    }
    public void depositar(double cantidad){
        // this.saldo = this.saldo + cantidad es la forma larga
        this.balance += cantidad;
    }
    public void retirar(double cantidad){
        if (cantidad <= this.balance){
            this.balance -= cantidad;
            System.out.println("Realizado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void transferir(double cantidad, CuentaBancaria destinatario){
        retirar(cantidad);
        destinatario.depositar(cantidad);
        System.out.println("Transferencia exitosa");
    }
    public void mostrarSaldo(){
        System.out.println("Su numero de cuenta " + this.numero);
        System.out.println("Su saldo es de " + this.balance);
        System.out.println("A nombre de " + this.titular.nombre);
        System.out.println("El banco es " + this.banco.nombre);
    }
}
