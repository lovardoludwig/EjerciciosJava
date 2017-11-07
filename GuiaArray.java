/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaarray;

/**
 *
 * @author alumno
 */
public class GuiaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiaArray.SetentaySeis();
    }
    public static int SetentaySeis()
    {
        int random=(int) (Math.random()*25+1);
        for (int i = 0; i < 10; i++) {
            random++;
        }
        return random;
    } 
}
