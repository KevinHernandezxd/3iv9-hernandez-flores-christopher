import java.util.Scanner;
class Ejercicio2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circulo circulo= new Circulo();
        String opcion="";
        do{
            System.out.println("Inserte el radio");
            circulo.sradio(scan.nextFloat());
            circulo.Area(circulo.getradio());
            circulo.Perimetro(circulo.gradio());

            System.out.println("Desea repetir?");
            System.out.println("Si o No");

            opcion = System.console().readLine();

        }while(!opc.equalsIgnoreCase("No"));
        System.out.println("Gracias por venir");
    }  
}