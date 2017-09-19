/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDoce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String DatoAux;
      Double Importe;
      Double Impuesto;
      Double Total;
      Scanner MiEscaner = new Scanner(System.in);
      
      System.out.println("Ingrese en importe del producto:");
      DatoAux = MiEscaner.next();
      Importe = Double.parseDouble(DatoAux);
      
      Impuesto = (Importe*35)/100;
      
      Total = Impuesto + Importe;
      System.out.println("Valor total:" +Total);
    }
    
}
