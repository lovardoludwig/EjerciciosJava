/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostrar ese mismo nombre
     * 
     */
    public static void main(String[] args) {
        String Nombre;
        Scanner MiEscaner = new Scanner(System.in);
        System.out.println("ingrese un nombre");
        Nombre= MiEscaner.nextLine();
        System.out.println("Su nombre es: " + Nombre);
    }
    
}
