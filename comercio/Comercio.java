/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo miArticulo;
        miArticulo = new Articulo(666, "fanta", 100, 3);
        float precioVenta=miArticulo.GetPrecioVenta();
        System.out.println("precio de venta: "+precioVenta);
        
//        Date nueva=new Date();
//        ArticuloComestible miArticulo2;
//        miArticulo2= new ArticuloComestible(9, "alfajor", 50, 2);
        
        Articulo miArticulo3;
        miArticulo3 = new Articulo(666, "fanta", 100, 3);
        
        Comercio2 ElBolicheDeTony;
        ElBolicheDeTony=new Comercio2("Tony");
        String respuesta;
        
        //compra
        respuesta=ElBolicheDeTony.ComprarArticulo(miArticulo, 3);
        System.out.println("respuesta: "+respuesta);
        
        respuesta=ElBolicheDeTony.ComprarArticulo(miArticulo, 3);
        System.out.println("respuesta: "+respuesta);
        
        respuesta=ElBolicheDeTony.ComprarArticulo(miArticulo, 3);
        System.out.println("respuesta: "+respuesta);
        
        //venta
        respuesta=ElBolicheDeTony.VenderArticulo(miArticulo, 3);
        System.out.println("respuesta: "+respuesta);
    }
    
}
