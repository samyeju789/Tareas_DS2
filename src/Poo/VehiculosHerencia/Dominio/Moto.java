package Poo.VehiculosHerencia.Dominio;

public class Moto {

    private int llantas;
    private String placa;
    private int velocidad;

    public Moto(int llantas, String placa, int velocidad) {
        this.llantas = llantas;
        this.placa = placa;
        this.velocidad = velocidad;
    }
    public int getLlantas() {
        return llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void encender(){
        System.out.println("la moto esta encendida");
    }

    public void acelerar(int incremento){
        this.velocidad += incremento;
        System.out.println("acelerando. su velocidad actual es " + this.velocidad + " km/h");
    }

    public void frenar(){
        this.velocidad = 0;
        System.out.println("su moto se ha detenido");
    }

}
