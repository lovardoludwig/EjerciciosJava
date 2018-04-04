/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import dao.peliculasdao;

/**
 *
 * @author alumno
 */
public class peliculas {
    
    private String nombre;
    private String genero;
    private String idioma;
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public String getGenero() {
        return genero;
    }

    public void setGenero(String Genero) {
        this.genero = Genero;
    }

     public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma    ;
    }

    
    public boolean guardarPelicula()
    {
        peliculasdao  peliDao= new peliculasdao();
        return peliDao.guardarPelicula(this);
        
        
    }
    
    
    
    
}
