import java.util.Scanner;
public class Proceso{
    double tem1, nuevat;
    public double obtenertemp(){
        return tem1;
    }
    public void asignartemp(double tem1){
        this.tem1 = tem1;
    }
    public void Tempe(double tem1){
        double nuevat;
        nuevat = (9 * tem1)/5 + 32;
        System.out.println("El resultado de la convercion es de: "+nuevat);
    }
}