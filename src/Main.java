//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // ejemplo de la clase
        int[] MayorNumero = {1,89,25,12,45,8,9,1,2,3,5};
        int Mayor = MayorNumero[0];

        for (int i = 1; i < MayorNumero.length; i++){
            if (MayorNumero[i] > Mayor)
                Mayor = MayorNumero[i];


        }
        //conteo de palabras
        String conteoPalabra = "Pepito juega futbol";

        String[] Palabras = conteoPalabra.split(" ");

        int conteo = 0;

        for (int i = 0; i < Palabras.length; i++){
            conteo++;

        }
        //conteo de letras
        String conteoLetras = "Pepito juega futbol";

        String[] Letras = conteoLetras.split("");

        int contarL = 0;

        for (int i = 0; i < Letras.length; i++){
            if (!Letras[i].equals(" ")){
                contarL++;
            }
        }
        // numero menor
        int[] MenorNumero = {1, 89,25,12,45,8,9,1,2,3,5};
        int Menor = MenorNumero[0];

        for (int i = 1; i > MenorNumero.length; i++) {
            if (MenorNumero[i] < Menor);
            Menor = MenorNumero[i];
        }
        // menor y mayor
        int[] MenorMayor = {1, 89,25,12,45,8,9,1,2,3,5};

        int menor1 = MenorMayor[0];
        int mayor2 = MenorMayor[0];

        for (int i = 1; i < MenorMayor.length; i++){
            if (MenorMayor[i] > mayor2){
                mayor2 = MenorMayor[i];
            }
            if (MenorMayor[i] < menor1){
                menor1 = MenorMayor[i];
            }

        }

        int[] Mitad = {1, 89,25,12,45,8,9,1,2,3,5};


        int menor3 = Mitad[0];
        int mayor4 = Mitad[0];

        for (int i = 1; i < Mitad.length; i++){
            if (Mitad[i] > mayor4){
                mayor4 = Mitad[i];
            }
            if (Mitad[i] < menor3){
                menor3 = Mitad[i];
            }



        }
        int division = (menor3 + mayor4) / 2;

        System.out.println(Mayor);
        System.out.println(contarL);
        System.out.println(conteo);
        System.out.println(Menor);
        System.out.println("el mas pequeño: " + menor1 + " el numero mas grande: " + mayor2);
        System.out.println("la mitad es: " + division);

    }
}