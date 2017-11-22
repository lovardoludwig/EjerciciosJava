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
public class FacturaB extends Documento{
    protected float IIBB;
    public FacturaB(int numero)
    {
        super(numero);
    }
    public void MostrarDatosCompletos()
    {
        
        System.out.println("IIBB: "+this.IIBB);
    }
    
    
}
