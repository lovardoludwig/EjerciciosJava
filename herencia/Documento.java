/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Documento {
    protected int _numero;
    
    public Documento(int numero)
    {
        this._numero=numero;
        System.out.println("constructor documento");
    }
    
    public void SetterNumero(int numero)
    {
        this._numero=numero;
    }
    public void MostrarNumero()
    {
        System.out.println("el numero es: "+this._numero);
    }
    public void MostrarDatosCompletos()
    {
        this.MostrarNumero();
        System.out.println("numero: "+this._numero);
        
    }
    
    
    
}
