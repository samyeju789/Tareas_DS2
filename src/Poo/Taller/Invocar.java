package Poo.Taller;

public class Invocar {
    public static void main(String[] args){
        Estudiante laura = new Estudiante("laura", 19, "ciencias naturales");

        Profesor mario = new Profesor("mario alfonso", 52, "matematicas 2");

        laura.presentarse();
        mario.presentarse();

    }
}
