import java.util.Scanner;

class FiguraMenu{

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String opcion;
    double base;
    double altura;
    double resultado=0;


   do{

    System.out.println("Bienvenido al programa de calculo de areas y perimetros");
    System.out.println("1 para calcular el area de un cuadrado");
    System.out.println("2 para calcular el area de un triangulo");
    System.out.println("3 para calcular el area de un circulo");
    System.out.println("4 para calcular el area de un rectangulo");
    System.out.println("5 para calcular el area de un rombo");
    System.out.println("6 para calcular el area de un hexagono");
    System.out.println("7 para calcular el perimetro de un cuadrado");
    System.out.println("8 para calcular el perimetro de un triangulo");
    System.out.println("9 para calcular el perimetro de un circulo");
    System.out.println("10 para calcular el perimetro de un rectangulo");
    System.out.println("11 para calcular el perimetro de un rombo");
    System.out.println("12 para calcular el perimetro de un hexagono");
    System.out.println("S para salir");
    

    opcion = System.console().readLine();

    switch(opcion){

        case "1":
            System.out.println("Ingresa el valor de un lado");
            base = scan.nextDouble();
            resultado = base * base;
            System.out.println("El area del cuadrado es: "+ resultado);
        break;
        case "2":
            System.out.println("Ingresa el valor de la base");
            base = scan.nextDouble();
            System.out.println("Ingresa el valor de la altura");
            altura = scan.nextDouble();
            resultado = (base * altura)/2;
            System.out.println("El area del triangulo es: "+ resultado);
        break;
        case "3":
            System.out.println("Ingresa el valor del radio");
            base = scan.nextDouble();
            resultado = (base * base) * 3.1416;
        break;
        case "4":
            System.out.println("Ingresa el valor para la base");
            base = scan.nextDouble();
            System.out.println("Ingresa el valor para la altura");
            altura = scan.nextDouble();
            resultado = base * altura;
            System.out.println("El area del rectangulo es: "+resultado);
        break;
        case "5":
            System.out.println("Ingresa el valor para la Diagonal mayor");
            base = scan.nextDouble();
            System.out.println("Ingresa el valor para la Diagonal menor");
            altura = scan.nextDouble();
            resultado = (base * altura)/2;
            System.out.println("El area del rombo es: "+resultado);
        break;
        case "6":
            System.out.println("Ingresa el valor del perimetro");
            base = scan.nextDouble();
            System.out.println("Ingresa el valor de la apotema");
            altura = scan.nextDouble();
            resultado = (base * altura)/2;
            System.out.println("El area del hexagono es: "+resultado);
        break;
        case "7":
            System.out.println("Ingresa el valor de lado");
            base = scan.nextDouble();
            resultado = base * 4;
            System.out.println("El perimetro del cuadrado es: "+resultado);
        break;
        case "8":
            System.out.println("Ingresa el valor de un lado");
            base = scan.nextDouble();
            resultado = base * 3;
            System.out.println("El perimetro del triangulo es: "+resultado);
        break;
        case "9":
            System.out.println("Ingrese el valor del radio");
            base = scan.nextDouble();
            resultado = (2 * 3.14) * base;
            System.out.println("El perimetro del circulo es: "+resultado);
        break;
        case "10":
            System.out.println("Ingrese");
            break;
        default:
            System.out.println("Ingresa un dato valido plox");
        break;
        }
/*   
    System.out.print("\033[H\033[2J");
    System.out.flush();
  */      
    }while(!opcion.equalsIgnoreCase("S"));
  }
}