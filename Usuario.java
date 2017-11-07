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
public class Usuario {
    
    //atributos
    private String nombre;
    private String clave;
    
    //metodos getters(si devuelven)
    public String GetNombre()
    {
        return this.nombre.toUpperCase()/*en mayuscula*/;
    }
    public String GetClave()
    {
        return this.clave;
    }
    
    //metodos setters(no devuelven, asignan)
    //public void SetNombre(String dato)
    public void dameNombre(String dato)
    {
        this.nombre=dato;
    }
    //public void SetClave(String dato)
    public void dameClave(String dato)
    {
        if(dato.length()<4)
        {
            this.clave="mal";
        }else
        {
            this.clave=dato;
        }
        
    }
    
    public void mostrarDatos()
    {
        System.out.println("su nombre de usuario es: "+this.GetNombre()+"clave: "+this.clave);
    }
    
    
}
