/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class Auto {
    private int numero;
    private Escuderia miEscuderia;
    private String modelo;
    private Piloto elPiloto;
    private int tiempoRecorrido;
    
    public void Mostrar()
    {
        System.out.println("numero: "+this.numero);
        System.out.println("escuderia: "+this.miEscuderia.Nombre);
        System.out.println("modelo: "+this.modelo);
        System.out.println("tiempoRecorrido: "+this.tiempoRecorrido);
        System.out.println("el piloto: "+this.elPiloto.DameNombreCompletoMay());
    }
    
    public int DameElTiempoRecorrido()
    {
        return this.tiempoRecorrido;
    }
    public void AgregarTiempoRecorrido(int tiempo)
    {
        this.tiempoRecorrido=this.tiempoRecorrido+tiempo;
    }
    public Auto(int numero)
    {
        this.elPiloto=new Piloto();
        this.modelo="Ford";
        this.numero=numero;
        this.miEscuderia=new Escuderia(1930, "Italia", "Ferrari");
        this.CargarPilotoRandom();
    }
    private void CargarPilotoRandom()
    {
        this.NombreRandom();
        this.ApellidoRandom();
    }
    private void NombreRandom()
    {
        int miRandom=(int)(Math.random()*10);
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterNombre("Rogelio");
            break;
            case 1:
                this.elPiloto.SetterNombre("Alfredo");
            break;
            case 2:
                this.elPiloto.SetterNombre("Juan");
            break;
            case 3:
                this.elPiloto.SetterNombre("Carlos");
            break;
            case 4:
                this.elPiloto.SetterNombre("Miguel");
            break;
            case 5:
                this.elPiloto.SetterNombre("Roberto");
            break;
            case 6:
                this.elPiloto.SetterNombre("Sebastian");
            break;
            case 7:
                this.elPiloto.SetterNombre("Nicolas");
            break;
            case 8:
                this.elPiloto.SetterNombre("Jorge");
            break;
            case 9:
                this.elPiloto.SetterNombre("Mariano");
            break;
        }
    }
    private void ApellidoRandom()
    {
        int miRandom=(int)(Math.random()*10);
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterApellido("Perez");
            break;
            case 1:
                this.elPiloto.SetterApellido("Paez");
            break;
            case 2:
                this.elPiloto.SetterApellido("Rialto");
            break;
            case 3:
                this.elPiloto.SetterApellido("Mendez");
            break;
            case 4:
                this.elPiloto.SetterApellido("Lombardi");
            break;
            case 5:
                this.elPiloto.SetterApellido("Zorro");
            break;
            case 6:
                this.elPiloto.SetterApellido("Mercurio");
            break;
            case 7:
                this.elPiloto.SetterApellido("Mena");
            break;
            case 8:
                this.elPiloto.SetterApellido("Elias");
            break;
            case 9:
                this.elPiloto.SetterApellido("Pereyra");
            break;
        }
    }
    private void EscuderiaRandom()
    {
        
    }
}
