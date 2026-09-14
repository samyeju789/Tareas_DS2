import java.util.Scanner;

public class Numeropar {
    public static void calcular() {
        Scanner leer = new Scanner(System.in);

        System.out.println("cantidad de numeros a ingresar:");
        int cantidad = leer.nextInt(); //usar solo el siguiente numero int

        int[] listaNumeros = new int[cantidad];
        int contarPares = 0;

        System.out.print("ingrese los numeros separados por espacio");

        for (int i = 0; i < cantidad; i++) {
            listaNumeros[i] = leer.nextInt();
            if (listaNumeros[i] % 2 == 0) {  // preguntaa a cada numero ingresado
                contarPares = contarPares + 1;
          }
        }
        System.out.println("los numeros pares son: " + contarPares);

    }
}

