/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaIf {
    
    
    public static void HacerEjercicio13()
    {
        String Color;
        String Localidad;
        Scanner MiEscanerr = new Scanner(System.in);
        System.out.println("Ingrese un color");
        Color=MiEscanerr.next();
        System.out.println("Ingrese una localidad");
        Localidad=MiEscanerr.next();
        
        if(Color.equals("rojo"))
        {
        /*
            if(Localidad.equals("avellaneda"))
            {
                System.out.println("sos hincha de independiente");
            }
            if(Localidad.equals("lanus"))
            {
                System.out.println("sos hincha de independiente");
            }
        }*/
        if(Localidad.equals("avellaneda")||Localidad.equals("lanus"))
            {
                System.out.println("sos hincha de independiente");
            }
        }
        //if(Color.equals("rojo")&&(Localidad.equals("avellaneda")||Localidad.equals("lanus")
    }
}
