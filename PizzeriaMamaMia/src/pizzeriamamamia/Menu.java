/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriamamamia;

import Pizza.*;
import java.util.Scanner;

/**
 *
 * @author kevonito
 */
public class Menu {
    
    public void MenuOperaciones(){
        
        Scanner entrada = new Scanner(System.in);
        Menu opcion = new Menu();
        int opc, tam=0, corte=0, precio=0, queso=0, pep=0;
        
        Pizza piza = null;
        do{
        
        System.out.println("Bienvenidos a la Pizzeria Los Tacos");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza de Vegetariana");
        System.out.println("Gracias uwu");
        opc = entrada.nextInt();
        if(opc<3 && opc>0){
        opcion.tamano();
        tam = entrada.nextInt();
        switch(tam){
            case 1:
                corte=4;
                break;
            case 2:
                corte=8;
                break;
            case 3:
                corte=12;
                break;
            case 4:
                corte=16;
                break;
        }
        switch(opc){
            case 1:
                //polomorfismo
                piza = new Queso();
                Queso ques = new Queso();
                opcion.elegirtipoqueso();
                queso = entrada.nextInt();
                if(queso==1){
                switch(tam){
                    case 1:
                        precio=75;
                        break;
                    case 2:
                        precio=89;
                        break;
                    case 3:
                        precio=112;
                        break;
                    case 4:
                        precio=135;
                        break;
                }
                }else if(queso==2){
                    switch(tam){
                    case 1:
                        precio=89;
                        break;
                    case 2:
                        precio=115;
                        break;
                    case 3:
                        precio=135;
                        break;
                    case 4:
                        precio=175;
                        break;
                    }
                }
                //me pregunte que tipo de queso quiero?
                piza.hornear();
                System.out.println("La pizza se corta en "+corte+" porciones");
                piza.empacar();
                System.out.println("El precio va a ser de "+precio+"$");
                
                
            break;
            case 2:
                piza = new Peperonni();
                opcion.elegirpeperonni();
                pep = entrada.nextInt();
                if(pep==1){
                switch(tam){
                    case 1:
                        precio=96;
                        break;
                    case 2:
                        precio=119;
                        break;
                    case 3:
                        precio=131;
                        break;
                    case 4:
                        precio=167;
                        break;
                }
                }else if(pep==2){
                    switch(tam){
                    case 1:
                        precio=88;
                        break;
                    case 2:
                        precio=97;
                        break;
                    case 3:
                        precio=111;
                        break;
                    case 4:
                        precio=157;
                        break;
                    }
                }
                piza.hornear();
                System.out.println("La pizza se corta en "+corte+" porciones");
                piza.empacar();
                System.out.println("El precio va a ser de "+precio+"$");
                break;
            case 3: 
                piza = new Vegetariana();
                piza.hornear();
                System.out.println("La pizza se corta en "+corte+" porciones");
                piza.empacar();
                System.out.println("El precio va a ser de "+precio+"$");
                break;
            default:
        }
        }
        }while(opc != 4);
        
    }
    public void tamano(){
        System.out.println("Elija el tamaño de su pizza");
        System.out.println("1. Chica");
        System.out.println("2. Mediana");
        System.out.println("3. Grande");
        System.out.println("4. Familiar");
    }
    public void elegirtipoqueso(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
    }
    public void elegirpeperonni(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elije el peperonni que deseas");
        System.out.println("1.- Peperonni");
        System.out.println("2.- Peperonni doble");
    }
}    
