import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Declaracion del vector
        int[] vector = new int [4]; //ejemplo un vector con 4 cajitas


        //Asignation manual de valores para el vector
        /*vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 153;*/

        //Asignacion por teclado
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<vector.length; i++){
            System.out.println("Ingrese el valor del indice: "+ i);
            vector[i] = teclado.nextInt();
        }



        for(int i = 0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Con el valor: " + vector[i]);
            System.out.println("------------------");
        }


    }
}