/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

/**
 *
 * @author alumno
 */
public class EjemploProductoContainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto miProductoUno =new Producto(1, "bicicleta", 20);
        Nacional miNacionalUno=new Nacional(2, "mesa", 5000, "La Pampa");
        Importado miImportadoUno=new Importado(3, "zapatos", 200, "China", 10);
        Nacional miNacionalDos=new Nacional(4, "moto", 15000, "Cordoba");
        Importado miImportadoDos=new Importado(5, "robot", 6000, "China", 20);
        Nacional miNacionalTres=new Nacional(6, "bolso", 4400, "Misiones");
        Importado miImportadoTres=new Importado(7, "bateria de auto", 8000, "China", 90);
        
//        Producto a=new Producto(666, "dron", 20);
//        Producto b=a;
//        b._precio=999;
//        
//        System.out.println("el precio de a es: "+a.getterPrecio());
//        
        Conteiner nuevoConteiner=new Conteiner(10);
//        
//        nuevoConteiner.CargarProducto(a);
//        nuevoConteiner.CargarProducto(a);
//        nuevoConteiner.CargarProducto(a);
//        nuevoConteiner.CargarProducto(a);
//        nuevoConteiner.CargarProducto(a);
//        nuevoConteiner.CargarProducto(a);
//        
//        b._precio=333;
        
        if(nuevoConteiner.CargarProducto(miProductoUno))
        {
            System.out.println("exito");
        }else
        {
            System.out.println("no cargo");
        }
        if(nuevoConteiner.CargarProducto(miNacionalUno))
        {
            System.out.println("exito");
        }else
        {
            System.out.println("no cargo");
        }
        
        if(nuevoConteiner.CargarProducto(miImportadoUno))
        {
            System.out.println("exito");
        }else
        {
            System.out.println("no cargo");
        }
        nuevoConteiner.CargarProducto(miProductoUno);
        nuevoConteiner.CargarProducto(miNacionalUno);
        nuevoConteiner.CargarProducto(miImportadoUno);
        nuevoConteiner.CargarProducto(miNacionalDos);
        nuevoConteiner.CargarProducto(miImportadoDos);
        nuevoConteiner.Ordenar();
        nuevoConteiner.mostrarContainer();
        
        System.out.println("   "+nuevoConteiner.toString());
        System.out.println("   "+miImportadoUno.toString());
        System.out.println("   "+miNacionalUno.toString());
        System.out.println("   "+miProductoUno.toString());
    }
    
}
