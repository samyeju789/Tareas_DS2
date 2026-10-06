package Poo.Taller;

public class Estudiante extends Persona {
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public void presentarse(){
        System.out.println(" mi nombres es " + getNombre() + " tengo " + getEdad() + " y estoy estudiando " + programa);
    }
}
