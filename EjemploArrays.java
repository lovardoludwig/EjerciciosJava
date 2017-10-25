/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;

/**
 *
 * @author alumno
 */
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EjemploArrays.PrimerEjemplo();
        //EjemploArrays.SegundoEjemplo();
        //EjemploArrays.EjemploTres();
        //EjemploArrays.InvertirOrden();
        //EjemploArrays.SacarElMayor();
        //EjemploArrays.SacarElMenor();
        //EjemploArrays.SacarLaSuma();
        //EjemploArrays.SacarElPromedio();
    }
    public static void PrimerEjemplo()
    {
        int[] numero;
        //int masNumero[]={33,77,55,11};
        int []otrosNumeros;
        
        numero = new int[4];
        numero[0]=99;
        numero[1]=22;
        numero[2]=11;
        numero[3]=0;
        //da error numero[4]=10;
        
        otrosNumeros= new int[10];
        int largo=otrosNumeros.length;
        System.out.println("largo "+largo);
        for (int i = 0; i < otrosNumeros.length; i++) {
            otrosNumeros[i]=i*3;
        }
        
    }
    public static void SegundoEjemplo()
    {
        int numerosPares[];
        numerosPares=new int[10];
        int indice=0;
        for (int i = 0; i < 20; i++) {
            if(i%2==0)
            {
                numerosPares[indice]=i;
                indice=indice+1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("numero "+i+": "+numerosPares[i]);
        }
        System.out.println("");
    }
    public static void EjemploTres()
    {
        int numerosUno[]={3,5,7};     
      
        int numerosDos[];
        numerosDos=new int[3];
        numerosDos[0]=8;
        numerosDos[1]=6;
        numerosDos[2]=2;
        //dos formas de hacer arrays
        
        int resultado[]= new int[3];
        for (int i = 0; i < 3; i++) {
            
            if(numerosUno[i]>numerosDos[i])
            {
                resultado[i]=numerosUno[i];
            }else
            {
                  resultado[i]=numerosDos[i];
            }
        }
        
    }
    public static void InvertirOrden()
    {
        int arrayInicial[]={33,77,55,11};
        int resultadoArray[];
        //{11,55,77,33}
        int largo=arrayInicial.length;
        resultadoArray=new int[largo];
        for (int i = 0; i < largo; i++)
        {
            resultadoArray[largo-1-i]=arrayInicial[i];
        }
        for (int i = 0; i < largo; i++) {
            System.out.println(""+resultadoArray[i]);
        }
    }
    public static void SacarElMayor()
    {
        int arrayInicial[]={33,77,55,11};
        int maximo=0;
        for (int i = 0; i < arrayInicial.length; i++) {
            if(i==0)
            {
                maximo=arrayInicial[i];
            }
            if(maximo<arrayInicial[i])
            {
                maximo=arrayInicial[i];
            }
        }
        System.out.println("el maximo es "+maximo);
    }
    public static void SacarElMenor()
    {
        int arrayInicial[]={33,77,55,11};
        int minimo=0;
        for (int i = 0; i < arrayInicial.length; i++) {
            if(i==0)
            {
                minimo=arrayInicial[i];
            }
            if(minimo>arrayInicial[i])
            {
                minimo=arrayInicial[i];
            }
        }
        System.out.println("el minimo es "+minimo);
    }
    public static void SacarLaSuma()
    {
        int arrayInicial[]={33,77,55,11};
        int suma=0;
        for (int i = 0; i < arrayInicial.length; i++) {
            suma=suma+arrayInicial[i];
        }
        System.out.println("la suma es "+suma);
    }
    public static void SacarElPromedio()
    {
        int arrayInicial[]={33,77,55,11};
        int suma=0;
        int promedio;
        for (int i = 0; i < arrayInicial.length; i++) {
            suma=suma+arrayInicial[i];
        }
        promedio=suma/arrayInicial.length;
        System.out.println("el promedio es "+promedio);
    }
}
