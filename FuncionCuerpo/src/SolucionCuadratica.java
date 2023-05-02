
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class SolucionCuadratica {
    
    
   static void Discriminante(){
       int solucion;
    Scanner entrada = new Scanner(System.in);
       int a; int b; int c;
       System.out.println("Introduzva el valor de a, b y c separado por espacios: ");
       a=entrada.nextInt();
       b=entrada.nextInt();
       c=entrada.nextInt();
       
       solucion=b*b-(4*a*c);
       if(solucion>0){
           System.out.println("x tiene dos soluciones");
       }
       else if(solucion==0){
           System.out.println("x tiene una solucion");
       } else{
           System.out.println("x tiene soluciones complejas");
       }
   }
   

    public static void main(String[] args) {
        Discriminante();
    }
}

