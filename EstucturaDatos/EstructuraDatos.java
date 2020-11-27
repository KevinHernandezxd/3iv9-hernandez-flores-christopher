//package EstructuraDatos;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;


public class EstructuraDatos{

    
    String opcion = " ";
    String eleccion = " ";
    double edad;
    double a;
    int b, c, d;
    double resultado, resultado1;
    Scanner scan = new Scanner(System.in);
    
    public static double getNumero(String peticion,Scanner dato){
		double out=0.0;
		boolean fin=false;
		while(!fin){
			System.out.println(peticion);	
			try{
				String s=dato.next();			
				out=Double.valueOf(s);
				fin=true;		
			}catch(Exception e){
				System.out.println("Dato invalido...");	
			}
		}
		return out;	
	}

    public void menu(){

        boolean salir = false;

        do{
        System.out.println("3iv9_hernandez_flores_christopher_kevin");
        System.out.println();
        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
	    System.out.println();
	    System.out.println("[1] Programa de descuentos");
	    System.out.println("[2] Numeros decimales");
	    System.out.println("[3] Temperatura");
	    System.out.println("[4] Numeros positivos y negativos");
	    System.out.println("[5] Cantidades");
	    System.out.println("[6] Figuras");
	    System.out.println("[7] Tabla de Valores");
	    System.out.println("[8] Factorial");
        System.out.println("[9] Calculadora");
        System.out.println("[S] Para salir");
        scan = new Scanner(System.in);
        opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    descuentos();    
                break;
                case "2":
                    decimales();
                break;
                case "3":
                    temperatura();
                break;
                case "4":
                    numeros();
                break;
                case "5":
                    cantidades();
                break;
                case "6":
                    figuras();
                break;
                case "7":
                    tablas();
                break;
                case "8":
                    factorial();
                break;
                case "9":
                Operar ope = new Operar();
                ope.setBounds(10, 10, 400, 400);
                ope.setResizable(false);
                ope.setVisible(true);
                break;
                case "s":
		        case "S":
		        	salir=true;
                    System.out.println("Bye!");
                break;
                default:
                    System.out.println("Solo ingresa datos validos");
                    break;
            }

        }while(scan.hasNextLine() && !salir);
        

    }
    public void descuentos(){
        System.out.println("Bienvenido");
        System.out.println();
        edad = getNumero("Ingresa tu edad por favor",scan);
        if(edad>=65){
        System.out.println("Tienes un descuento del 40%");
        }else if(edad<=21 && edad>0){
        System.out.println("Tus padres ya cuentan con nuestro servicio de socios");
        eleccion = System.console().readLine();
            if(eleccion.equalsIgnoreCase("S")|| eleccion.equalsIgnoreCase("Si")){
                System.out.println("Tienes un descuento del 45%");
            }else if(eleccion.equalsIgnoreCase("N") || eleccion.equalsIgnoreCase("No")){
                System.out.println("Tienes un descuento del 40%");
            }else{
                System.out.println("A bueno te me cuidas");
            }
        }
    }
    public void decimales(){
        System.out.println("DIJITE UN NUMERO DECIMAL: ");
        int input = scan.nextInt();
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
    
    public void temperatura(){
            System.out.println("Bienvenido al programa de temperaturas");
            System.out.println();
            a = getNumero("Ingrese la temperatura inicial en grados Fahrenheit",scan);
            System.out.println("A que temperatura desea hacer cambio?");
            System.out.println();
            System.out.println("[C] Celsius");
            System.out.println("[K] Kelvine");
            System.out.println("[R] Rankie");
            opcion = System.console().readLine();
                if(opcion.equalsIgnoreCase("C")){
                    resultado = (a-32)/1.8;
                    System.out.println("El resultado es: " + resultado);
                }else if(opcion.equalsIgnoreCase("K")){
                    resultado = ((a-32)/1.8)+273.15;
                    System.out.println("El resultado es: " + resultado);
                }else if(opcion.equalsIgnoreCase("R")){
                    resultado = (a-32)+491.67;
                    System.out.println("El resultado es: " + resultado);
                }else{
                    System.out.println("Ingresa un dato correcto");
                }
            }
    
    
    public void numeros(){
        System.out.println("Bienvenido al programa de numeros");
        System.out.println();
        do{
        a = getNumero("Ingrese numeros cualquieras", scan);
        System.out.println("Si quiere salir escriba el numero 0");
        if(a>0){
            b++;
        }else if(a<0){
            c++;
        }else if(a==0){
            System.out.println("Muchas gracias por venir");
        }else{
            System.out.println("Ingrese solo datos correctos");
        }
        }while(a!=0);
        System.out.println("El total de numeros positivos es " + b);
        System.out.println("El total de numeros negativos es " + c);
    }

    public void cantidades(){           
        System.out.println("Bienvenido al programa de productos");
        System.out.println();
            int agua = 8;
            int coca =15;
            int caguama = 30;
            int chetos = 12;
            int huevoKinder = 20; 
            int galletas = 13;
            int leche = 17;
            System.out.println("Itrodusca el nombre clave de los productos que desea comprar y para finalizar ocupar 0");
            System.out.println("1.-Agua");
            System.out.println("2.-Coca");
            System.out.println("3.-Caguama");
            System.out.println("4.-Chetos");
            System.out.println("5.-Huevo Kinder");
            System.out.println("6.-Galletas");
            System.out.println("7.-Leche");
            System.out.println("0.-Salida");
            int pro = 0;
            int total = 0;
            String producto;
                do{
                     producto  = System.console().readLine();
                     pro = pro + 1;
                     switch (producto) {
                          case "1":
                               total =total + 8;
                               break;
                          case "2":
                               total = total + 15;
                               break;
                          case "3":
                               total = total + 30;
                               break;
                          case "4":
                               total = total + 12;
                               break;
                          case "5":
                               total = total + 20;
                               break;
                          case "6":
                               total = total + 13;
                               break;
                          case "7":
                               total = total + 17;
                               break;
                          default:
                               break;
                     }
                }while(!producto.equalsIgnoreCase("0"));
                pro = pro - 1;
                System.out.println("El total de la compra es de: "+total);
                System.out.println("La cantidad de producros comprados es de: "+pro);
    }                                   

    public void figuras(){
        System.out.println("Bienvenido al programa de areas y perimetros");
        System.out.println();
        do{
            System.out.println("Seleccione la opcion que quiera hacer");
            System.out.println("[A] Area y Perimetro de un rectangulo");
            System.out.println("[B] Area y Perimetro de un triangulo");
            System.out.println("[C] Area y Perimetro de un cilindro");
            System.out.println("[S] Para salir");
            eleccion = System.console().readLine();
            if(eleccion.equalsIgnoreCase("A")){
                a = getNumero("Ingrese el valor de la base", scan);
                edad = getNumero("Ingrese el valor de la altura", scan);
                if(a>0 && edad>0){
                    resultado = (a*2) + (b*2);
                    resultado1 = (a*b);
                    System.out.println("El area del rectangulo es: " + resultado1);
                    System.out.println("El perimetro del rectangulo es: " + resultado);
                }else{
                    System.out.println("Ingresa valores correctos");
                }
            }else if(eleccion.equalsIgnoreCase("B")){
                a = getNumero("Ingrese el valor de la base", scan);
                edad = getNumero("Ingrese el valor de la altura", scan);
                if(a>0 && edad>0){
                    resultado = (a*edad)/2;
                    resultado1 = (a*3);
                    System.out.println("El area del triangulo es: " + resultado);
                    System.out.println("El perimetro del triangulo es: " + resultado1);
                }else{
                    System.out.println("Ingresa valores correctos");
                }
            }else if(eleccion.equalsIgnoreCase("C")){
                a = getNumero("Ingrese el valor del radio", scan);
                edad = getNumero("Ingrese el valor de la altura", scan);
                if(a>0 && edad>0){
                    resultado = (2*3.14)*(a*edad)+(2*3.14)*(a*a);
                    resultado1 = ((4/3)*(3.14*a*a*a));
                    System.out.println("El volumen del cilindro es: " + resultado);
                    System.out.println("El volumen de la esfera es: " + resultado1);
                }else{
                    System.out.println("Ingresa valores correctos");
                }
            }else if(eleccion.equalsIgnoreCase("S")){
                System.out.println("Gracias por venir");
            }
        }while(!eleccion.equalsIgnoreCase("S"));

    }

    public void tablas(){
        b=1;
        for(int n=1; n<=10; n++){
            c=0;
            b=n;
            do{
                System.out.print(b + "  ");
                b = b*10;
                c++;
            }while(c!=4);
            System.out.println();
        }
    }

    public void factorial(){
        System.out.println("Bienvenido al programa de factoriales");
        System.out.println();
        a = getNumero("Ingrese el numero del que se desee el factorial", scan);
        edad = 1;
        while(a!=0){
            edad = edad * a;
            System.out.println(edad);
            a--;
        }
    }
    public static void main(String[] args){
        EstructuraDatos ed = new EstructuraDatos();
        ed.menu();
    
    }
}
