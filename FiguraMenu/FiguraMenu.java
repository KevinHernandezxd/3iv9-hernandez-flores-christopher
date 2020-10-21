import java.util.Scanner;

class FiguraMenu {
	
	Scanner scan = new Scanner(System.in);
	
	double base;
	double altura;
	double resultado=0;

	public void cuadrado(){
		try {
            System.out.println("Ingresa el valor de un lado");
            base = scan.nextDouble();
            resultado = base * base;
            System.out.println("El area del cuadrado es: "+ resultado);
            System.out.println();            
		}catch(NumberFormatException e) {
        }finally {
            menu();	
		}
	}
	
	public void triangulo() {
        try{
            System.out.println("Ingresa el valor de la base");
            base = scan.nextDouble();
            System.out.println("Ingresa el valor de la altura");
            altura = scan.nextDouble();
            resultado = (base * altura)/2;
            System.out.println("El area del triangulo es: "+ resultado);
            System.out.println();
        }catch(NumberFormatException e){
        }finally{
            menu();
        }
	}
	
	public void circulo(){
        try{
        System.out.println("Ingresa el valor del radio");
        base = scan.nextDouble();
        resultado = (base * base) * 3.1416;
        System.out.println("El area del circulo es: " + resultado);
        }catch(NumberFormatException e){
        }finally{
            menu();
        }
	}
	
	public void rectangulo() {
        try{
        System.out.println("Ingresa el valor para la base");
        base = scan.nextDouble();
        System.out.println("Ingresa el valor para la altura");
        altura = scan.nextDouble();
        resultado = base * altura;
        System.out.println("El area del rectangulo es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
        }finally {
            menu();	
        }
	}
	
	public void rombo() {
        try{
        System.out.println("Ingresa el valor para la Diagonal mayor");
        base = scan.nextDouble();
        System.out.println("Ingresa el valor para la Diagonal menor");
        altura = scan.nextDouble();
        resultado = (base * altura)/2;
        System.out.println("El area del rombo es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
        }finally {
            menu();	
        }
	}
	
	public void hexagono() {
        try{
        System.out.println("Ingresa el valor del perimetro");
        base = scan.nextDouble();
        System.out.println("Ingresa el valor de la apotema");
        altura = scan.nextDouble();
        resultado = (base * altura)/2;
        System.out.println("El area del hexagono es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
        }finally {
            menu();	
        }
	}
	
	public void perimetroCuadrado() {
        try{
        System.out.println("Ingresa el valor de lado");
        base = scan.nextDouble();
        resultado = base * 4;
        System.out.println("El perimetro del cuadrado es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
        }finally {
            menu();	
        }
	}
	
	public void perimetroTriangulo() {
        try{
        System.out.println("Ingresa el valor de un lado");
        base = scan.nextDouble();
        resultado = base * 3;
        System.out.println("El perimetro del triangulo es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
		}finally {
            menu();	
		}
	}
	
	public void perimetroCirculo() {
        try{
        System.out.println("Ingrese el valor del radio");
        base = scan.nextDouble();
        resultado = (2 * 3.14) * base;
        System.out.println("El perimetro del circulo es: "+resultado);
        System.out.println();
        }catch(NumberFormatException e) {
		}finally {
            menu();	
		}
    }
    public void perimetroRectangulo(){
        try{
        System.out.println("Ingrese el valor de la base");
        base = scan.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = scan.nextDouble();
        resultado = (base*2)+(altura*2);
        System.out.println("El perimetro del rectangulo es: " + resultado);
        System.out.println();
        }catch(NumberFormatException e) {
		}finally {
            menu();	
		}
    }
    public void perimetroRombo(){
        try{
        System.out.println("Ingrese el valor de un lado");
        base = scan.nextDouble();
        resultado = base*4;
        System.out.println("El perimetro del rombo es: " + resultado);
        System.out.println();
        }catch(NumberFormatException e) {
		}finally {
            menu();	
		}
    }
    public void perimetroHexagono(){
        try{
        System.out.println("Ingrese el valor de un lado");
        base = scan.nextDouble();
        resultado = base * 6;
        System.out.println("El perimetro del hexagono es: " +  resultado);
        System.out.println();
        }catch(NumberFormatException e) {
		}finally {
            menu();	
		}
    }
	public void menu() {
	    String opcion;


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
        

	    opcion = System.console().readLine();

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
            case "S":
                System.out.println("Gracias por venir");
            break;
            case "s":
                System.out.println("Gracias por venir");
            break;
	        default:
	            System.out.println("Ingresa un dato valido plox");
	            System.out.println();
	        break;
	        }
	    
	/*   
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	  */      
	    }while(!opcion.equalsIgnoreCase("S"));
	   //}while(!(opcion == 'S'));
       scan.close();
	}
	
	
	
	
	
	

    public static void main(String[] args) throws Exception{
        
    	FiguraMenu fm = new FiguraMenu();
        fm.menu();

  }
}