import java.util.Scanner;

class ObtenerDatosUsuario{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String nombre;
        int edad;
        float beca;

        System.out.println("Dime tu nombre ");
        nombre = scan.nextLine();

        System.out.println("Dime tu edad ");
        edad = scan.nextInt();

        System.out.println("Tu beca es de que monoto?");
        beca = scan.nextFloat();

        System.out.println("Tu nombre es: "+ nombre);
        System.out.println("Tu edad es: "+ edad);
        System.out.println("Tu beca es: "+ beca);


        
    }
}