/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaytres;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioCuarentayTres {

    /**
     * @param args the command line arguments
     * se piden los nombres de los alumnos, informar cuantas marias y cuantos
     * joses hay en el curso, ademas de cuantos alumnos hay
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String nombre;
        Integer contadorMaria=0;
        Integer contadorJose=0;
        Integer contador=0;
        Integer cantAlumnos;
        String aux;
        
        System.out.println("ingrese cantidad de alumnos");
        aux = MiEscaner.next();
        cantAlumnos = Integer.parseInt(aux);
        while(contador<cantAlumnos)
        {
            System.out.println("ingrese nombre del alumno");
            nombre = MiEscaner.next();
            if(nombre.equals("maria"))
            {
                contadorMaria++;
            }
            if(nombre.equals("jose"))
            {
                contadorJose++;
            }
            contador++;
        }
        System.out.println("cantidad de marias: "+contadorMaria);
        System.out.println("cantidad de joses: "+contadorJose);
        System.out.println("totalidad de alumnos: "+cantAlumnos);
    }
    
}
