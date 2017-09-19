/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * Se pide ingresar una clave, si es "UTN750" se mostrara el mensaje "Bienvenido", de lo contrario 
     * el mensaje "Clave erronea"
     */
    public static void main(String[] args) {
        String Clave;
        Scanner MiEscaner = new Scanner(System.in);
        
        System.out.println("Ingrese la Clave: ");
        Clave = MiEscaner.next();
        boolean respuesta;
        respuesta = Clave.equals("UTN750");
                
        if (Clave.equals("UTN750"))
        {
            System.out.println("Bienvenido");
        }else
        {
            System.out.println("Clave Erronea");
        }
        /*15 Se ingresa un importe, si su supera los 100 pesos se le agrega un 23%, si es menor se le descuenta el 50%
        16 Se ingresa el importe de un pasaje de avion y el mes de viaje,  si es enero se le descuenta un 10% por temporada baja
        */
    }
    
}
