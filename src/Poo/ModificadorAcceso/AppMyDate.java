package Poo.ModificadorAcceso;

public class AppMyDate {

    public static void main(String[] args) {

        MyDate myBirthday = new MyDate(32, 13, 2007);

        System.out.println(myBirthday.getDay() + "/" +  myBirthday.getMonth() + "/" + myBirthday.getYear());

        System.out.println(myBirthday.imprimirFecha());
    }
}
