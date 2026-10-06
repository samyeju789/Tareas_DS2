package Poo.Banco.App;

import Poo.Banco.Dominio.Banco;
import Poo.Banco.Dominio.CuentaBancaria;
import Poo.Banco.Dominio.Persona;

public class AppBanco {

    public static void main(String[] args) {


        //Bancos
        Banco bancolombia = new Banco("Bancolombia", "badbuunny");
        Banco nequi = new Banco("Nequi", "joani");
        Banco BancoDebogota = new Banco("Banco de bogota", "rorota");
        Banco daviplata = new Banco("DaviPlata", "arcangel");
        Banco bbva = new Banco("BBVA", "locomotora");


        //Persona
        Persona andres = new Persona("Andres", "1012345678", "andres@gmail.com", 22);
        Persona camila = new Persona("Camila", "1023456789", "camila@gmail.com", 25);
        Persona diego = new Persona("Diego", "1034567890", "diego@gmail.com", 19);
        Persona elena = new Persona("Elena", "1045678901", "elena@gmail.com", 27);
        Persona felipe = new Persona("Felipe", "1056789012", "pipe@gmail.com", 20);
        Persona gabriela = new Persona("Gabriela", "1067890123", "gabi@gmail.com", 23);
        Persona hernando = new Persona("Hernando", "1078901234", "nano@gmail.com", 30);
        Persona isabel = new Persona("Isabel", "1089012345", "isa@gmail.com", 18);
        Persona javier = new Persona("Javier", "1090123456", "javi@gmail.com", 26);
        Persona luisa = new Persona("Luisa", "1001234567", "luisa@gmail.com", 21);

// Instancias de CuentaBancaria asociadas
        CuentaBancaria cuentaAndres = new CuentaBancaria("2001", 350000, "4321", "Ahorros", andres, bancolombia);
        CuentaBancaria cuentaCamila = new CuentaBancaria("2002", 800000, "8765", "Corriente", camila, nequi);
        CuentaBancaria cuentaDiego = new CuentaBancaria("2003", 120000, "1091", "Nomina", diego, daviplata);
        CuentaBancaria cuentaElena = new CuentaBancaria("2004", 450000, "3121", "Ahorros", elena, bbva);
        CuentaBancaria cuentaFelipe = new CuentaBancaria("2005", 90000, "5141", "Corriente", felipe, BancoDebogota);
        CuentaBancaria cuentaGabriela = new CuentaBancaria("2006", 600000, "7161", "Nomina", gabriela, bancolombia);
        CuentaBancaria cuentaHernando = new CuentaBancaria("2007", 250000.75, "9181", "Corriente", hernando, bbva);
        CuentaBancaria cuentaIsabel = new CuentaBancaria("2008", 40000, "1202", "Ahorros", isabel, nequi);
        CuentaBancaria cuentaJavier = new CuentaBancaria("2009", 180000, "3222", "Corriente", javier, daviplata);
        CuentaBancaria cuentaLuisa = new CuentaBancaria("2010", 520000, "5242", "Ahorros", luisa, BancoDebogota);

        //Transacciones

        cuentaAndres.transferir(20000,cuentaFelipe);
        cuentaCamila.depositar(15000);
        cuentaDiego.retirar(100000);
        cuentaElena.transferir(50000,cuentaIsabel);
        cuentaFelipe.depositar(100000);
        cuentaGabriela.transferir(50000,cuentaJavier);
        cuentaHernando.retirar(50000);
        cuentaIsabel.retirar(15000);
        cuentaJavier.transferir(50000,cuentaHernando);
        cuentaLuisa.transferir(10000,cuentaElena);

        cuentaAndres.mostrarSaldo();
        cuentaCamila.mostrarSaldo();
        cuentaDiego.mostrarSaldo();
        cuentaElena.mostrarSaldo();
        cuentaFelipe.mostrarSaldo();
        cuentaGabriela.mostrarSaldo();
        cuentaHernando.mostrarSaldo();
        cuentaIsabel.mostrarSaldo();
        cuentaLuisa.mostrarSaldo();
}
}
