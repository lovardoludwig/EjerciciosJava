/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Comercio2 {
    private String _dueño;
    private ArrayList<Articulo> _misArticulos;
    private ArrayList<Venta> _misVentas;
    
    public Comercio2(String dueño)
    {
        this._dueño=dueño;
        this._misArticulos=new ArrayList<Articulo>();
        this._misVentas=new ArrayList<Venta>();
    }
    
    public void VenderArticulo(Articulo art,Articulo cantidad)
    {
        
    }
    
    public void MostrarArticulos()
    {
        for (Articulo _misArticulo : this._misArticulos) {
            
        }
    }
    
    public void MostrarVentas()
    {
        float ganaciaTotal=0;
        for (Venta aux : this._misVentas) {
            ganaciaTotal=ganaciaTotal+aux.RetornarGanancia();
            aux.MostrarVenta();
        }
        System.out.println("ganancia: "+ganaciaTotal);
    }
    
    public String ComprarArticulo(Articulo art,Articulo cantidad)
    {
        
        for (Articulo miart : this._misArticulos) 
        {
            if(Articulo.SonIguales(miart, art))
            {
                miart.SetStock(miart.GetStock()+art.GetStock());
                return "se sumo al stock";
            }
        }
        art.SetStock(cantidad);
        this._misArticulos.add(art);
        return "se agrego uno nuevo";
    }
    
    public String VenderArticulo(Articulo art, int cantidad)
    {
        for (Articulo miart :this._misArticulos) {
            if(Articulo.SonIguales(miart, art))
            {
                if(miart.GetStock()>cantidad)
                {
                    Venta nuevaVenta=new Venta(art, cantidad);
                    this._misVentas.add(nuevaVenta);
                    miart.SetStock(miart.GetStock()-cantidad);
                    return "pude vender";
                }else
                {
                    return"no hay stock suficiente";
                }
            }
        }
        return "no tengo el producto";
    }
}
