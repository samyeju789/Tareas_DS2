package Poo.VehiculosHerencia.Dominio;

public class Avioneta {

    private int helices;
    private int altitudMax;
    private String tipo;
    private int velocidad;

    public Avioneta(int helices, int altitudMax, String tipo, int velocidad) {
        this.helices = helices;
        this.altitudMax = altitudMax;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public int getHelices() {
        return helices;
    }

    public int getAltitudMax() {
        return altitudMax;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public void setAltitudMax(int altitudMax) {
        this.altitudMax = altitudMax;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void despegar() {
        System.out.println("La avioneta esta despegando.");
    }

    public void acelerarVuelo(int incremento) {
        this.velocidad += incremento;
        System.out.println("Aumentando velocidad. Velocidad actual de vuelo: " + this.velocidad + " km/h");
    }

    public void aterrizar() {
        this.velocidad = 0;
        System.out.println("La avioneta ha aterrizado y se ha detenido.");
    }
}
