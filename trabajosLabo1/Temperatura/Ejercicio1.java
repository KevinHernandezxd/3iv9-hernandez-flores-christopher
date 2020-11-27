import java.util.Scanner;
class Ejercicio1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Proceso proceso = new Proceso();
        String opc="";
        do{
            System.out.println("Inserte la temperatura en Grados Celcius");

            proceso.asignartemp(scan.nextDouble());
            proceso.Tempe(proceso.obtenertemp());

            System.out.println("Desea repetir?...");
            System.out.println("Si o No");

            opc = System.console().readLine();
            
        }while(!opc.equalsIgnoreCase("No"));

        System.out.println("Gracias por venir UwU");
    }
}