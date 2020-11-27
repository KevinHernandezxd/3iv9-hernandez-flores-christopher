import java.util.Scanner;
class Convertidor{

String opcion = "";

    Proceso proceso = new Proceso();

    public static void main(String[] args){
        Convertidor c = new Convertidor();
        c.menu();
    }
        public void menu(){
        System.out.println("Bienvenido al programa de conversion de temperatura");
        do{
            System.out.println("[C] para hacer una conversion");
            System.out.println("[S] para salir");
            opcion = System.console().readLine();
            switch (opcion) {
                case "C":
                    proceso.temperatura();
                break;
                case "s":
                case "S":
                    System.out.println("Muchas gracias por venir!!");
                break;
                default:
                break;
            }
        }while(!opcion.equalsIgnoreCase("S"));
    }

}