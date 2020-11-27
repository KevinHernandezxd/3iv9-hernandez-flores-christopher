import java.util.Scanner;
class Metodos{
    double a, b, c;
    int d, e, f;
    String opcion = "";
    String eleccion = "";
    double saldo;
    double numero;
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


    public void telefono(){
        do{
        opcion = "";
        System.out.println("    Bienveido al programa de llamadas");
        System.out.println("    Que desea hacer?...");
        System.out.println("    [1] Para realizar una llamada");
        System.out.println("    [2] Para recargar saldo");
        System.out.println("    [3] Para consultar saldo");
        System.out.println("    [S] Para salir");
        opcion = System.console().readLine();
        switch (opcion) {
            case "1":
                llamada();
            break;
            case "2":
                consultarSaldo();
            break;
            case "3":
                System.out.println("Su saldo actual es de: " + saldo);
            break;
            case "s":
            case "S":
                System.out.println("Gracias por venir...");
            break;
            default:
                System.out.println("Ingresa un dato valido por favor");
            break;
        }
    }while(!opcion.equalsIgnoreCase("S"));
}
    public void llamada(){
        if(saldo>0){
            do{
            eleccion = "";
            System.out.println("A donde desea llamar?...");
            System.out.println("[N] para una llamada local nacional");
            System.out.println("[I] para una llamada local internacional");
            System.out.println("[C] para llamar a un celular");
            System.out.println("[S] si quiere salir");
            eleccion = System.console().readLine();
            switch (eleccion) {
                case "n":
                case "N":
                if(saldo>0){
                        saldo = saldo - 0.5;
                        System.out.println("    Llamando...");
                        System.out.println("    Holaaaaa como estas?... bueno adios!");
                    }else{
                        System.out.println("    Saldo insuficiente, realice una recarga por favor");
                    }
                break;
                case "i":
                case "I":
                if(saldo>0){
                        saldo = saldo - 0.6;
                        System.out.println("    Llamando fuera del pais...");
                        System.out.println("    Joder, que bueno es que llames...");
                    }else{
                        System.out.println("    Saldo insuficiente, realice una recarga por fa");
                    }
                break;
                case "c":
                case "C":
                if(saldo>0){
                        saldo = saldo - 0.2;
                        System.out.println("    Llamando a un celular");
                        System.out.println("    Buenos dias comadre...");
                    }else{
                        System.out.println("    Saldo insuficiente, realice una recarga por fa");
                    }
                break;
                case "s":
                case "S":
                    System.out.println("Gracias por venir");
                    telefono();
                break;
                default:
                    System.out.println("Ingrese un valor valido");
                break;
            }
        
            }while(!eleccion.equalsIgnoreCase("S"));
        }else{
            System.out.println("Realiza una recarga por favor");
        }
    }   
    public void consultarSaldo(){
        numero = getNumero("Que tal, podria darnos su numero de celular", scan);
        /*
        if(numero >9999999999 || numero <=999999999){
            System.out.println("Ingrese un numero valido");
        }
        */
        saldo = getNumero("Ahora podria proporcionarnos la cantidad a recargar?...", scan);
        if(saldo<0){
            System.out.println("Ingrese un valor valido");
        }
        telefono();
    }

    public void menu(){
        opcion = "";

        do{
            System.out.println("Bienvenido a este programa");
            System.out.println("Que desea hacer?...");
            System.out.println("[1] edades");
            System.out.println("[2] figuras");
            System.out.println("[3] programa de llamadas");
            System.out.println("[S] para salir");
            opcion = System.console().readLine();
            switch (opcion) {
                case "1":
                    System.out.println("En proceso");
                break;
                case "2":
                    System.out.println("En proceso");
                break;
                case "3":
                    telefono();
                break;
                case "s":
                case "S":
                    System.out.println("gracias por venir...");
                break;
                default:
                    System.out.println("Solo ingresa los datos mostrados");
                break;
            }

        }while(!opcion.equalsIgnoreCase("s"));
    }

    public static void main(String[] args){
        Metodos m = new Metodos();
        m.menu();
    }

}