public class For {

    public static void main(String[] args) {
        int[] numeroMayor = {1,89,25,12,45,8,9,1,2,3,5};  //ejemplo clase

         int mayor = numeroMayor[0];

        for (int i = 1; i < numeroMayor.length; i++){
            if (numeroMayor[i] > mayor)
            mayor = numeroMayor[i];


        }

        //contar palabras
        String frase = "Pepito juega futbol";

            String[] palabras = frase.split(" ");

            int contar = 0;

            for (int i = 0; i < palabras.length; i++){
                contar++;

            }

            //contar letras
        String Frase = "Pepito juega futbol";

        String[] letras = Frase.split("");

        int conteo = 0;

        for (int i = 0; i < letras.length; i++){
            if (!letras[i].equals(" ")){
            conteo++;
            }
        }

        int[] numeroMenor = {1, 89,25,12,45,8,9,1,2,3,5};
        int menor = numeroMenor[0];

        for (int i = 1; i > numeroMenor.length; i++) {
            if (numeroMenor[i] < menor);
            menor = numeroMenor[i];
        }

        int[] menorMayor = {1, 89,25,12,45,8,9,1,2,3,5};

        int Menor = menorMayor[0];
        int Mayor = menorMayor[0];

        for (int i = 1; i < menorMayor.length; i++){
            if (menorMayor[i] > Mayor){
                Mayor = menorMayor[i];
            }
            if (menorMayor[i] < menor){
                menor = menorMayor[i];
            }

        }

        int[] promedio = {1, 89,25,12,45,8,9,1,2,3,5};


        int menor1 = promedio[0];
        int mayor2 = promedio[0];

        for (int i = 1; i < promedio.length; i++){
            if (promedio[i] > mayor2){
                mayor2 = promedio[i];
            }
            if (promedio[i] < menor1){
                menor1 = promedio[i];
            }



        }
        int resultado = (menor1 + mayor2) / 2;


        System.out.println(mayor); //numero mayor de una lista
        System.out.println(contar); //cuantas palabras tiene una frase
        System.out.println(conteo); // cuantas letras tiene una frase
        System.out.println(menor); // numero menor de una lista
        System.out.println("el numero menor es " + Menor + " y el numero mayor es " + Mayor); // el numero menor y mayor son
        System.out.println("el promedio es: " + resultado);

    }

}

