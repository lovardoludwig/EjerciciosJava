/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfacturacion;

/**
 *
 * @author alumno
 */
public class Persona {
    private String _nombre;
    private String _apellido;
    
    public Persona(String nom,String ape)
    {
        this._apellido=ape;
        this._nombre=nom;
    }
    public void MostrarPersona()
    {
        System.out.println("nombre: "+this._nombre+" apellido: "+this._apellido);
    }
    public static Persona RetornarPersonaRandom()
    {
        Persona retorno=new Persona("natalia", "natalia");
        
        
        
        return retorno;
    }
}
