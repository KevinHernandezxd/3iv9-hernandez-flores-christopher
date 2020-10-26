import java.util.*;
import java.util.Scanner;

class binario {
    public static void main(String[] args) {
        System.out.println();

       
        Scanner leer = new Scanner(System.in);
        System.out.println("DIJITE UN NUMERO DECIMAL: ");
         // VARIABLES //
        int input = leer.nextInt();
        int digito;
        String binario = "";

        // CICLO OPERATIVO //
        do {
            digito = input % 2;
            binario += digito;
            input = input / 2;
            System.out.println("EL NUMERO BINARIO ES: " + binario);

        }while (input != 0);
            System.out.println("EL NUMERO BINARIO ES: " + binario);
    }
}