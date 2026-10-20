package Poo.ModificarAcceso;

public class Animal {
    protected  String sinnombre; //funciona como un privado, pero es accesible en clases hijas "dog"
//modificarlo y leerlo
    public Animal(String sinnombre) {
        this.sinnombre = sinnombre;
    }

    public void comer(){
        System.out.println("comiendo");
    }
    public void mover(){
        System.out.println("moviendose");
    }

}
