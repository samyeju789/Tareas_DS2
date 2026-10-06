package Poo.VehiculosHerencia.Dominio;

public class Barco {

    private int helices;
    private int capacidadPasajeros;
    private int velocidadNavegacion;

    public Barco(int helices, int capacidadPasajeros, int velocidadNavegacion) {
        this.helices = helices;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadNavegacion = velocidadNavegacion;
    }

    public int getHelices() {
        return helices;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getVelocidadNavegacion() {
        return velocidadNavegacion;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setVelocidadNavegacion(int velocidadNavegacion) {
        this.velocidadNavegacion = velocidadNavegacion;
    }
}
