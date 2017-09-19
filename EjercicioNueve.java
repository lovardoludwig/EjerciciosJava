/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioNueve {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
      String DatoAux;
      Double Precio;
      Integer Cantidad;
      Double Total;
      Scanner MiEscaner = new Scanner(System.in);
      
      System.out.println("Ingrese el precio:");
      DatoAux = MiEscaner.next(); 
      Precio = Double.parseDouble(DatoAux);
      
      System.out.println("Ingrese el precio:");
      DatoAux = MiEscaner.next();
      Cantidad = Integer.parseInt(DatoAux);
      
      Total = Precio*Cantidad;
      System.out.println("El resultado es:" +Total);
      
      
      
      
      
      
      
      
      
      
      
      /*esta bien hecho pero falta hacer el parceo
      Scanner MiEscaner = new Scanner(System.in);
      System.out.println("Ingrese el precio:");
      Precio = MiEscaner.nextDouble();
      
      System.out.println("Ingrese la cantidad:");
      Cantidad = MiEscaner.nextInt();
      
      Total = Precio*Cantidad;
      System.out.println("El resultado es:" +Total);*/
      }

    
}
