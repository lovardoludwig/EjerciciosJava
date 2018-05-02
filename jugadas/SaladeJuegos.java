/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladejuegos;

/**
 *
 * @author alumno
 */
public class SaladeJuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugador mijugador=new jugador(1,"maria","aniquilador");
        jugador mijugador2=new jugador(2,"pepe","la muerte");
        jugador mijugador3=new jugador(3,"lautaro","el jefe");
        jugador mijugador4=new jugador(4,"lore","la master");
        
        juego mijuego = new juego(0, "moh", tipodeJuego.fps);
        juego mijuego2 = new juego(0, "monkey", tipodeJuego.rpg);
        juego mijuego3 = new juego(0, "ww", tipodeJuego.arcade);
        juego mijuego4 = new juego(0, "pacman", tipodeJuego.arcade);
        juego mijuego5 = new juego(0, "wolf3d", tipodeJuego.fps);
        
        jugadas mijugada=new jugadas(0, mijuego, mijugador, resultado.gano);
        jugadas mijugada1=new jugadas(1, mijuego, mijugador2, resultado.perdio);
        jugadas mijugada2=new jugadas(2, mijuego2, mijugador3, resultado.empato);
        jugadas mijugada3=new jugadas(3, mijuego3, mijugador4, resultado.gano);
        jugadas mijugada4=new jugadas(4, mijuego4, mijugador2, resultado.gano);
        jugadas mijugada5=new jugadas(5, mijuego4, mijugador, resultado.perdio);
        
        
    }
}