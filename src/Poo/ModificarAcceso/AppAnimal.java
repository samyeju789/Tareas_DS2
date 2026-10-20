package Poo.ModificarAcceso;

public class AppAnimal {

    public static void main(String[] args){//static poder acceder sin crear el animal
        Dog kira = new Dog("kira", "criolla");

        kira.ladrar(10);
        kira.mover();


    }
}
