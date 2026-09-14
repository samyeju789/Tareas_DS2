public class Factorialnumero {
    public static long calcular (int n) {
     long factorial = 1;

     for (int i = 1; i <= n; i++){
         factorial = factorial * i;
     }

     return factorial;



    }
}
