package Poo.ModificarAcceso;

public class Dog extends Animal{

    public String raza;

    public Dog(String nombre, String raza){
        super(nombre);//invocar
        this.raza = raza;

    }
    public void ladrar(int cantidad){
        super.sinnombre = "kira";
        System.out.println(super.sinnombre + " ladra " + cantidad + "veces"); //acceder a nombre de otra clase
    }
}
