
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Contador {
    

    static void cantidadPalabras(String palabra) {
    
    
    final int IN = 1;
    final int OUT = 0;
    int wordc = 0;
    int i = 0;
    int estado = OUT;
        while (i < palabra.length()) {
            if (' ' == palabra.charAt(i)) {
                estado = OUT;
            } else if (estado == OUT) {
                estado = IN;
                wordc++;
            }
            i++;

        }
        System.out.println("Cantidad de palabras: " + wordc);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una oracion: ");
        cadena = entrada.nextLine();
        cantidadPalabras(cadena);
        
        
    }
}
