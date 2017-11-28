/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

/**
 *
 * @author alumno
 */
public class Venta {
    private Articulo _articuloVendido;
    private int _cantidad;
    
    public Venta(Articulo artUno,int cantidad)
    {
        this._articuloVendido=artUno;
        this._cantidad=cantidad;
    }
    
    public float RetornarGanancia()
    {
        float precioFacturado=this._articuloVendido.getGanancia()*this._cantidad;
        return 
    }
    public void MostrarVenta()
    {
        System.out.println("",this._cantidad);
        System.out.println("articulo "+this._articuloVendido);
    }
}
