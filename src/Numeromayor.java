import java.util.Scanner;

public class Numeromayor {
    public static void calcular() {
        Scanner leer = new Scanner(System.in);

        System.out.println("cantidad de numeros a ingresar:");
        int cantidad = leer.nextInt(); //usar solo el siguiente numero int

        int [] listaNumeros = new int[cantidad];

        System.out.print("ingrese los numeros separados por espacio");

        for (int i = 0; i < cantidad; i++) {

            listaNumeros[i] = leer.nextInt();
        }
        int mayor = listaNumeros[0];
        for (int i = 1; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > mayor) {
                mayor = listaNumeros[i];
            }
        }

        System.out.println("el numero mayor es:" + mayor);
    }
}
