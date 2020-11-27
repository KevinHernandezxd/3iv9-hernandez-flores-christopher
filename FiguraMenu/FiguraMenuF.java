package calculadora;

import java.util.Scanner;

class FiguraMenu{	
	Scanner scan;
	double base;
	double altura;
	double resultado=0;

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
		
	public void cuadrado() {		
		base = getNumero("Ingresa el valor del lado", scan);
    	resultado = base * base;
    	System.out.println("El area del cuadrado es: "+ resultado);
    	System.out.println();
	}
	
	public void triangulo() {
        base = getNumero("Ingresa el valor de la base", scan);
        altura = getNumero("Ingresa el valor de la altura", scan);
        resultado = (base * altura)/2;
        System.out.println("El area del triangulo es: "+ resultado);
        System.out.println();
	}
	
	public void circulo() {
        base = getNumero("Ingresa el valor del radio", scan);
        resultado = (base * base) * 3.1416;
        System.out.println("El area del circulo es: "+ resultado);
        System.out.println();
	}
	
	public void rectangulo() {
        base = getNumero("Ingresa el valor de la base", scan);
        altura = getNumero("Ingresa el valor de la altura", scan);
        resultado = base * altura;
        System.out.println("El area del rectangulo es: "+resultado);
        System.out.println();
	}
	
	public void rombo() {
        base = getNumero("Ingresa el valor de la Diagonal mayor", scan);
        altura = getNumero("Ingresa el valor de la Diagonal menor", scan);
        resultado = (base * altura)/2;
        System.out.println("El area del rombo es: "+resultado);
        System.out.println();
	}
	
	public void hexagono() {
        base = getNumero("Ingresa el valor del perimetro", scan);
        altura = getNumero("Ingresa el valor de la apotema", scan);
        resultado = (base * altura)/2;
        System.out.println("El area del hexagono es: "+resultado);
        System.out.println();
	}
	
	public void perimetroCuadrado() {
        base = getNumero("Ingresa el valor de lado", scan);
        resultado = base * 4;
        System.out.println("El perimetro del cuadrado es: "+resultado);
        System.out.println();
	}
	
	public void perimetroTriangulo() {
        base = getNumero("Ingresa el valor de un lado", scan);
        resultado = base * 3;
        System.out.println("El perimetro del triangulo es: "+resultado);
        System.out.println();
	}
	
	public void perimetroCirculo() {
        base = getNumero("Ingresa el valor del radio", scan);
        resultado = (2 * 3.14) * base;
        System.out.println("El perimetro del circulo es: "+resultado);
        System.out.println();
    }
    public void perimetroRectangulo() {
        base = getNumero("Ingresa el valor de la base", scan);
        altura = getNumero("Ingresa el valor de la altura", scan);
        resultado = (altura * 2) + (base * 2);
        System.out.println("El perimetro del rectangulo es: "+resultado);
        System.out.println();
    }
    public void perimetroRombo() {
        base = getNumero("Ingresa el valor de un lado", scan);
        resultado = base * 4;
        System.out.println("El perimetro del rectangulo es: "+resultado);
        System.out.println();
    }
    public void perimetroHexagono() {
        base = getNumero("Ingresa el valor de un lado", scan);
        resultado = base * 6;
        System.out.println("El perimetro del rectangulo es: "+resultado);
        System.out.println();
    }
    
    
	public void menu() {	
		String opcion = " ";
		boolean salir=false;

		do{
	
		    System.out.println("Bienvenido al programa de calculo de areas y perimetros");
		    System.out.println();
		    System.out.println("[1] El area de un cuadrado");
		    System.out.println("[2] El area de un triangulo");
		    System.out.println("[3] El area de un circulo");
		    System.out.println("[4] El area de un rectangulo");
		    System.out.println("[5] El area de un rombo");
		    System.out.println("[6] El area de un hexagono");
		    System.out.println("[7] El perimetro de un cuadrado");
		    System.out.println("[8] El perimetro de un triangulo");
		    System.out.println("[9] El perimetro de un circulo");
		    System.out.println("[10] El perimetro de un rectangulo");
		    System.out.println("[11] El perimetro de un rombo");
		    System.out.println("[12] El perimetro de un hexagono");
		    System.out.println("[S] Para salir");
		    
		    scan = new Scanner(System.in);
		    opcion = scan.nextLine();
		    
		    switch(opcion){
		   
		        case "1":
		        	cuadrado();
		        break;
		        case "2":
		        	triangulo();
		        break;
		        case "3":
		        	circulo();
		        break;
		        case "4":
		        	rectangulo();
		        break;
		        case "5":
		        	rombo();
		        break;
		        case "6":
		        	hexagono();
		        break;
		        case "7":
		        	perimetroCuadrado();
		        break;
		        case "8":
		        	perimetroTriangulo();
		        break;
		        case "9":
		        	perimetroCirculo();
		        break;
		        case "10":
		            perimetroRectangulo();
                break;
                case "11":
                    perimetroRombo();
                break;
                case "12":
                    perimetroHexagono();
                break;
		        case "s":
		        case "S":
		        	salir=true;
		        	System.out.println("Bye!");
		        break;
		        default:
		            System.out.println("Ingresa un dato valido plox");
		            System.out.println();
		        break;
		    }		    
		}while(scan.hasNextLine() && !salir);
	}
		
    public static void main(String[] args){
    	FiguraMenu fm = new FiguraMenu();
    	fm.menu();
    }
}