package Poo.VehiculosHerencia.App;

import Poo.VehiculosHerencia.Dominio.Avioneta;
import Poo.VehiculosHerencia.Dominio.Carro;
import Poo.VehiculosHerencia.Dominio.Moto;

public class AppVehiculo {

    public static void main(String[] args) {

        Carro miCarro = new Carro(4, "BCSP", 50);

        miCarro.encender();
        miCarro.acelerar(10);
        miCarro.frenar();

        Moto miMoto = new Moto(2, "opale", 70);

        System.out.println("placa de la moto " + miMoto.getPlaca());

        miMoto.encender();
        miMoto.acelerar(20);
        miMoto.frenar();

        Avioneta miAvioneta = new Avioneta(4, 3000, "terrestre", 300);
        miAvioneta.despegar();
        miAvioneta.acelerarVuelo(100);
        miAvioneta.aterrizar();

    }


}
