/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornarmayores;

/**
 *
 * @author alumno
 */
public class RetornarMayores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numUno=3;
        Integer numDos=6;
        Integer numTres=9;
        
        
            if(numUno>numDos&&numUno>numTres)
            {
                System.out.println("el numero uno es el mayor: "+numUno);
            }else
            {
                if(numDos>numUno&&numDos>numTres)
                {
                    System.out.println("el numero dos es el mayor: "+numDos);
                }else
                {
                    System.out.println("el numero tres es el mayor: "+numTres);
                }
            }
        }
}
