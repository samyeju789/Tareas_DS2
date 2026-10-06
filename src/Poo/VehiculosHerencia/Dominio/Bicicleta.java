package Poo.VehiculosHerencia.Dominio;

public class Bicicleta {

    private String modelo;
    private int velocidad;

    public Bicicleta(String modelo, int velocidad) {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void pedalear() {
        System.out.println("Pedaleando la bicicleta.");
    }

    public void frenar() {
        System.out.println("La bicicleta ha frenado.");
    }

    public void cambiarMarcha() {
        System.out.println("Cambio de marcha realizado.");
    }

}
