/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaydos;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioCuarentayDos {

    /**
     * @param args the command line arguments
     * de un grupo de vehiculos (no se sabe la cantidad) se necesita tomar el 
     * color, informar cuantos rojo y cuantos azules, ademas del total de vehiculos
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer cantVehiculos;
        Integer contador=0;
        String aux;
        String color;
        Integer contadorRojo=0;
        Integer contadorAzul=0;
        
        System.out.println("ingrese cantidad de vehiculos");
        aux = MiEscaner.next();
        cantVehiculos = Integer.parseInt(aux);
        while(contador<cantVehiculos)
        {
            System.out.println("de que colores son?");
            color = MiEscaner.next();
            if(color.equals("rojo"))
            {
                contadorRojo++;
            }
            if(color.equals("azul"))
            {
                contadorAzul++;
            }
            contador++;
        }
        
        System.out.println("cantidad de autos azules: "+contadorAzul);
        System.out.println("cantidad de autos rojos: "+contadorRojo);
        System.out.println("totalidad de vehiculos: "+cantVehiculos);
    }
    
}
