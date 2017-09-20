/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciseis;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un pasaje de avion y el mes de viaje, si es enero se le descuenta un 10% por temporada baja
     */
    public static void main(String[] args) {
        String DatoAux;
        Integer Importe;
        String Mes
        Scanner MiEscaner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del pasaje de avion:");
        DatoAux = MiEscaner.next();
        Importe = Integer.parseInt(DatoAux);
        
        System.out.println("Ingrese mes de viaje");
        Mes = MiEscaner.next();
        
        if (Mes = Enero)
        {
            Importe-(Importe*10)/100
        }        
        }
    
}
