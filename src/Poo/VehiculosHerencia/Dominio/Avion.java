package Poo.VehiculosHerencia.Dominio;

public class Avion {
    private int turbinas;
    private int capacidadPasajeros;
    private int velocidadVuelo;

    public Avion(int turbinas, int capacidadPasajeros, int velocidadVuelo) {
        this.turbinas = turbinas;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadVuelo = velocidadVuelo;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setVelocidadVuelo(int velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public void despegar() {
        System.out.println("El avion esta despegando.");
    }

    public void acelerarVuelo(int incremento) {
        this.velocidadVuelo += incremento;
        System.out.println("Aumentando la velocidad. Velocidad actual de vuelo: " + this.velocidadVuelo + " km/h");
    }

    public void aterrizar() {
        this.velocidadVuelo = 0;
        System.out.println("El avion ha aterrizado");
    }
}
