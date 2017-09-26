/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String MesDelAño;
        String Vacaciones;
        Integer Edad;
        String DatoAux;
        //Si paso los 80 años y va de vacaciones en invierno, "vacunate contra la gripe"
        System.out.println("Tu edad:");
        DatoAux = MiEscaner.next();
        Edad = Integer.parseInt(DatoAux);
        
        System.out.println("Vas de vacaciones");
        Vacaciones = MiEscaner.next();
        if(Vacaciones.equals("Si"))
        {
            System.out.println("Ingrese mes del año");
            MesDelAño = MiEscaner.next();
            switch (MesDelAño)
        {
            case "Enero" :
            case "Febrero" :
                System.out.println("Lindo veranito!!!");
                break;
            case "Julio" :
                
                if(Edad>80)
                {
                    System.out.println("vacunate contra la gripe");
                }
                System.out.println("Lindo invierno!!!");
                break;
            default:
                System.out.println("No estamos en verano!!!");
            
        }
        }
        
        
    }
    
}
