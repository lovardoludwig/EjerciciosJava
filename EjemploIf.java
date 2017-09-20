/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**
         * Si es masculino, que viva en Lanus o Avellaneda y que su color favorito sea el rojo, mostrar el mensaje "sos de independiente"
         * Si el nombre es Andrea, la localidad es moron y el color favorito es verde o azul, mostrar mensaje "feliz primavera"
         */ 
        Scanner Escaner = new Scanner(System.in);
                
        String Sexo;
        String Localidad;
        String ColorFavorito;
        String Nombre;
        
        System.out.println("Ingrese sexo:");
        Sexo = Escaner.next();
        
        System.out.println("Ingrese localidad:");
        Localidad = Escaner.next();
        
        System.out.println("Ingrese el color favorito");
        ColorFavorito = Escaner.next();
        
        System.out.println("Ingrese nombre:");
        Nombre = Escaner.next();
        
        if(Sexo.equals("M")&& Localidad.equals("Lanus")|| Localidad.equals("Avellaneda")&& ColorFavorito.equals("Rojo"))
        {
            System.out.println("Sos de Independiente");
        }
        
        if(Nombre.equals("Andrea")&& Localidad.equals("Moron")&& ColorFavorito.equals("Verde")||ColorFavorito.equals("Azul"))
        {
            System.out.println("Feliz Primavera");
        }
        
        
        
        //Scanner MiEscaner = new Scanner(System.in);
        // Defino variables
        //String Nombre;
        //String Clave;
        //String Sexo;
        //String Localidad;
        //String ColorFavorito;
        //
        // Tomo datos
        //System.out.println("Ingrese el nombre:");
        //Nombre = MiEscaner.next();
        //
        //System.out.println("Ingrese la clave:");
        //Clave = MiEscaner.next();
        //
        //System.out.println("Ingrese sexo:");
        //Sexo = MiEscaner.next();
        //
        //System.out.println("Ingrese localidad:");
        //Localidad = MiEscaner.next();
        //
        //System.out.println("Ingrese el color favorito");
        //ColorFavorito = MiEscaner.next();
        //
        //if(Nombre.equals("Admin"))
        //{
        //    System.out.println("Bienvenido administrador");
        //}else
        //{
        //    System.out.println("Bienvenido/a "+Nombre);
        //}    
        // Ingresa m para masculino, f para femenino        
        //
        //    System.out.println("Feliz Día de la Mujer");
        //
        // Si son mujeres de Lanus, mostrar mensaje "Bienvenidas"       
        //if(Localidad.equals("Lanus"))
        //{
        //    if(Sexo.equals("F"))
        //    {
        //    System.out.println("Bienvenida");
        //    }
        //
        //}
        //
        //
        // if(Localidad.equals("Lanus")&& Sexo.equals("F"))
        //{
        //   System.out.println("Bienvenida");
        //}
        // 
        //Si el color favorito es celeste, ingresar mensaje "Es un patriota", si es blanco, tambien
        //if(ColorFavorito.equals("Celeste"))
        //{
        //    System.out.println("Es un patriota");
        //}
        //
        //if(ColorFavorito.equals("Celeste")||ColorFavorito.equals("Blanco"))
        //{
        //    System.out.println("Es un patriota");
        //}
    }
        
}
