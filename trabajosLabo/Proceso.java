import java.util.Scanner;
class Ejercicio1{
    double temperatu1;
    double temperatu2;
    
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
        
    public void temperatura(){
        temperatu1 = getNumero("Ingrese la temperatura en grados celcius");
        temperatu2 = (9 * temperatu1) / 5 + 32;
    }

}