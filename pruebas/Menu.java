import java.util.Scanner;

public class Menu {
	   
    Scanner teclado = new Scanner(System.in);
    int x, y;
   
    public void menu() {
        String opc = " ";
       
        do {
            System.out.println();
            System.out.print("----- Menu Principal -----"
                    + "\nA. Ingrese dos numeros"
                    + "\nB. Sumar numeros ingresados"
                    + "\nC. Restar numeros ingresados"
                    + "\nD. Salir"
                    + "\nIngrese una opcion: ");
            opc = teclado.nextLine();
           
            switch (opc) {
            case "a":
            case "A": ingresaDatos(); break;
            case "b":
            case "B": suma();break;
            case "c":
            case "C": resta(); break;
            case "d":
            case "D": System.out.println();
                        System.out.println("Gracias por usar la aplicacion. Vuelva Pronto");
            }
           
        }while(!opc.equalsIgnoreCase("D"));
    }
   
    public void ingresaDatos() {   
        try{    
        System.out.println();
        System.out.print("Ingrese numero 1: ");
        x = teclado.nextInt();
        System.out.print("Ingrese numero 2: ");
        y = teclado.nextInt();
        teclado.nextLine();
        }catch(NumberFormatException e){
        }finally{
        }
    }
   
    public void suma() {
        System.out.println();
        int suma = x + y;
        System.out.println("La suma de "+x+" y "+y+" es igual a "+suma);
    }
   
    public void resta() {
        System.out.println();
        int resta = x - y;
        System.out.println("La resta de "+x+" y "+y+" es igual a "+resta);
    }  
 
    public static void main(String[] args) {
        Menu fc = new Menu();
        fc.menu();
    }
}