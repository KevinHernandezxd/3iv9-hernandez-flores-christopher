import java.util.Scanner;
 public class Circulo{
    float radio;
    public float gradio(){
        return radio;
    }
    public void sradio(float radio){
        this.radio = radio;
    }
    public void Area(float radio){
        double area;
        area = 3.1416 * radio*radio;
    System.out.println("El area del circulo es de: "+area);
    }
    public void Perimetro(float radio){
        double peri; 
        peri = 2* 3.1416 * radio;
        System.out.println("El perimetro del circulo es de: "+peri);
    }
}