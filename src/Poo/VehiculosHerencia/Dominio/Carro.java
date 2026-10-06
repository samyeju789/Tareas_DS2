package Poo.VehiculosHerencia.Dominio;

public class Carro {

    private int llantas;
    private String placa;
    private int velocidadActual;

    public Carro(int llantas, String placa, int velocidadActual) {
        this.llantas = llantas;
        this.placa = placa;
        this.velocidadActual = velocidadActual;
    }

    public int getLlantas() {
        return llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void encender() {
        System.out.println("El carro esta encendido.");
    }

    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Acelerando. Velocidad actual: " + this.velocidadActual + " km/h");
    }

    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("El carro se ha detenido.");
    }
}
