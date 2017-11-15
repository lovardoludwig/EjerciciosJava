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
public class EjFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //registrar una venta
        Persona unCliente=new Persona("maximiliano","lovardo");
        Persona unEmpleado=new Persona("Martin","Fierro");
        Producto unProducto=new Producto();
        unProducto.SetterCantidad(3);
        unProducto.SetterDescrip("fanta");
        unProducto.SetterPrecio(35);
        
        NuevaVenta.elCliente=unCliente;
        NuevaVenta.miEmpleado=unEmpleado;
        NuevaVenta.productoVendido=unProducto;
        
        Venta NuevaVenta ;
        NuevaVenta=new Venta();
    }
    
}
