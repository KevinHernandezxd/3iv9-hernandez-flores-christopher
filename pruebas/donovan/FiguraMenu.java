import java.util.Scanner;

class FiguraMenu{

    public static void main(String[] args){
       
        
           /*
        Vamos a realizar un programa el cual
        imprima un menu para calcular perimetro y area 
        de las siguientes figuras geometricas
        cuadrado, triangulo circulo
        lo que quiero de tarea w wiiiiii
        1.- Quiero que el menu se repita hasta que yo escriba S o s de salir
        2.- completar el calculo para el perimetro
        3.- Comprobar que todos los numeros sean reales positivos
        4.- Vamos a agregar 3 figuras mas w
          Rectangulo, Rombo, Hexagono wiiiiii
        */

        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        String opcion = " ";
        // cambia el int de arriba por un string para que funcione
        int altura, base, l2, l3, a;
        double resultado, perimetro;

        
        do{
        //la creacion del menu
        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area y perimetro de un cuadrado");
        System.out.println("2.- Calcular area y perimetro de un triangulo");
        System.out.println("3.- Calcular area y perimetro de un circulo");
        System.out.println("4.- Calcular area y perimetro de un rectangulo");
        System.out.println("5.- Calcular area y perimetro de un rombo");
        System.out.println("6.- Calcular area y perimetro de un hexagono");
        System.out.println("S.- Salir");

        opcion = System.console().readLine();

        //saber que opcion para que calculo
        switch(opcion){
           case "1":
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                System.out.println("El area es de: "+resultado);
                perimetro = base+base+base+base;
                System.out.println("El perimetro es de: "+perimetro);
                //cerrar los casos
                break;

            case "2":
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("El area es de: "+resultado);
                System.out.println("Ingresa un lado que no sea el que ya ingresaste");
                l2 = entrada.nextInt();
                System.out.println("Ingresa el otro lado");
                l3 = entrada.nextInt();
                perimetro = base+l2+l3;
                System.out.println("El perimetro es de: " +perimetro);
                break;

            case "3":
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                System.out.println("El area es de: "+resultado);
                perimetro = 2*3.1416*base;
                System.out.println("El perimetro es de: "+perimetro);
                break;

        
            case "4":
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = base*altura;
                System.out.println("El area es de: "+resultado);
                perimetro = base+base+altura+altura;
                System.out.println("El perimetro es de: "+perimetro);
                break; 


            case "5":
                System.out.println("Ingresa la diagonal Mayor");
                base = entrada.nextInt();
                System.out.println("Ingrea la diagonal menor");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("El area es de: " +resultado);
                perimetro = base+base+altura+altura;
                System.out.println("El perimetro es de: "+perimetro);
                break;


            case "6": 
             System.out.println("Ingresa el valor de la base");
             base = entrada.nextInt();
             System.out.println("Ingresa el valor de la apotema");
             altura = entrada.nextInt();
             perimetro = base+base+base+base+base+base;
             resultado = (base*altura)/2;
             System.out.println("El area es de: "+resultado);
             System.out.println("El perimetro es de "+perimetro);
             break;
            case "S":
            System.out.println("Gracias por venir. nwn/");
            break;
            case "s":
                System.out.println("Gracias por venir. nwn/");
            break;
            default: 
             System.out.println("Ingrese un dato valido");
            }
        }while(!opcion.equalsIgnoreCase("S"));
    }
}