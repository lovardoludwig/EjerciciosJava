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
public class Alumno {
    /**
     * nombre > 3 letras o "nn"
     * apellido > 3 letras o "nn"
     * correo > 8 letras o "nn"
     * sexo f o m o "esta mal"
     * fechaNac
     * localidad > 4 letras o "mal localidad"
     * direccion > 8 letras o "mal direccion"
     * legajo de 6 caracteres o "mal"
     * DNI = 8 caracteres
     * 
     * para la salida todos los textos en mayusculas
     */
    //crear estos atributos y generear 10 objetos ALUMNOS.
    private String _nombre;
    private String _apellido;
    private String _correo;
    private String _sexo;
    private String _fechaNac;
    private String _localidad;
    private String _direccion;
    private int _legajo;
    private String _DNI;
    
    public void mostrarInstanciaAlumno()
    {
        Alumno.MostrarDatosAlumno(this);
    }
    public static void MostrarDatosAlumno(Alumno unAlguien)
    {
        System.out.println("nombre: "+unAlguien.getNombre());
    }
    public String getNombre(String dato)
    {
        if(dato.length()<3)
        {
            return this._nombre="nn";
        }else
        {
            return this._nombre.toUpperCase();
        }
    }
    public String getApellido(String dato)
    {
        if(dato.length()<3)
        {
            return this._apellido="nn";
        }else
        {
            return this._apellido.toUpperCase();
        }
    }
    public String getCorreo(String dato)
    {
        if(dato.length()<8)
        {
            return this._correo="nn";
        }else
        {
            return this._correo.toUpperCase();
        }
    }
    public String getSexo(String dato)
    {
        if(dato=="M"||dato=="F")
        {
            return this._sexo="mal";
        }else
        {
            return this._sexo.toUpperCase();
        }
    }
    public String getFecha(String dato)
    {
        return this._fechaNac.toUpperCase();
    }
    public String getLocalidad(String dato)
    {
        if(dato.length()<4)
        {
            return this._localidad="mal";
        }else
        {
            return this._localidad.toUpperCase();
        }
    }
    public String getDireccion(String dato)
    {
        if(dato.length()<8)
        {
            return this._direccion="nn";
        }else
        {
            return this._direccion.toUpperCase();
        }
    }
    public int getLegajo(String dato)
    {
        if(dato==6)
        {
            return this._legajo.toUpperCase();
        }else
        {
            return this._legajo="mal";
        }
    }
    public void getDNI(String dato)
    {
        if(dato.length()<3)
        {
            return this.nombre="nn";
        }else
        {
            return this.nombre.toUpperCase();
        }
    }
    public void mostrarDatos()
    {
        
    }
//    public String nombre;
//    public String apellido;
//    public String correo;
//    public String sexo;
//    public String fechaNac;
//    public String localidad;
//    public String direccion;
//    public int legajo;
//    public String DNI;
//    public void mostrarDatos()
//    {
//        System.out.println("los datos del alumno son: nombre: "+this.nombre+"apellido: "+this.apellido+"correo: "+this.correo+"sexo: "+this.sexo+"fecha de nacimiento: "+this.fechaNac+"localidad: "+this.localidad+"direccion: "+this.direccion+"legajo: "+this.legajo+"DNI: "+this.DNI);
//    }
//    public void mostrarDatosConFor()
//    {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("¿cual es su nombre?");
//            
//        }
//    }
}
