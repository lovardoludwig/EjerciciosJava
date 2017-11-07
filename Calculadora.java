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
public class Calculadora {
    /**
     * es estatico
     */
    public static void mostrarEstatico(int dato)
    {
        //al ser estatico el THIS(para buscar atributos) no funciona
        System.out.println("el dato: "+dato);
    }
    /**
     * es de instancia
     */
    public void MostrarInstancia()
    {}
}
