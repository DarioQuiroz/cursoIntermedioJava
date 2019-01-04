/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete1.clase1;

/**
 *
 * @author dquiroz
 */
public class Clase2 {
    public Clase2(){
        System.out.println("");
        new clase1(1);
          new clase1(1, 1);
        new clase1(1, 2, 3);
       //   new clase1(1, 2, 3,4);
    }
    public void pruebaDesdeClase2(){
        clase1 c1=new clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.atrPublico);
        System.out.println("Atributo Protegido: "+c1.atrProtected);
        System.out.println("Atributo paquete: "+c1.atrPaquete);
        
           System.out.println("Atributo publico: "+c1.metodoPublico());
        System.out.println("Atributo Protegido: "+c1.metodoProtegido());
        System.out.println("Atributo paquete: "+c1.metodoPaquete());
    }
}
