/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

/**
 *
 * @author alumno
 */
public class EjemploClasesyObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1ra parte
//        int edad;
//        //estatico
//        edad=33;
//        Calculadora.mostrarEstatico(edad);
//        //instancia
//        Calculadora miCalculadora=new Calculadora();
//        miCalculadora.MostrarInstancia();
        int numero;
        String dato="";
        
        Usuario unUsuario;
        unUsuario=new Usuario();
        unUsuario.dameNombre("natalia natalia");
        unUsuario.dameClave("666");
        System.out.println("el nombre es: "+unUsuario.GetNombre());
        unUsuario.mostrarDatos();
        
        Alumno nuevoAlumno;
        nuevoAlumno=new Alumno();
        nuevoAlumno.nombre="carlos ";
        nuevoAlumno.apellido="perez ";
        nuevoAlumno.correo="480 ";
        nuevoAlumno.sexo="M ";
        nuevoAlumno.fechaNac="14/09/60 ";
        nuevoAlumno.localidad="Bernal ";
        nuevoAlumno.direccion="Av. Irigoyen 305 ";
        nuevoAlumno.legajo=28000 ;
        nuevoAlumno.DNI="14.582.679 ";
        nuevoAlumno.mostrarDatos();
        
        nuevoAlumno.getNombre(dato);
        System.out.println("nombre: "+nuevoAlumno.getNombre(dato));
        
        
        for (int i = 0; i < 3; i++) {
            
        }
        
        
        
        
    }
    
}
