/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEnumeraciones;

import java.awt.BorderLayout;

/**
 *
 * @author dquiroz
 */
public class Enumeraciones {
    public static void main(String[] args) {
        System.out.println("Valor 1:"+Dias.LUNES);
        indicarDia(Dias.DOMINGO);
        
        
        
        
        
        System.out.println("\n\n\n\n continente no 4: "+Continentes.AMERICA);
        System.out.println("\rPaises en america: "+Continentes.AFRICA.getPaises());
        System.out.println("\n");
        indicarPaies(Continentes.OCEANIA);
        imprimicontinentes();
        
    }

    
    
    private static void indicarDia(Dias dias) {
       switch(dias){
            case LUNES:
                System.out.println("es el primer dia de  las semana");
                break;
            case MARTES:
                System.out.println("es el segundo dia de la semana");
                break;
                default: 
                    System.out.println("es algun otro dia");
                    
       }
          
       }
    public static void indicarPaies(Continentes continente){
        switch(continente){
            case AFRICA:
                System.out.println("es elcontinente mas caliente");
                break;
            case AMERICA:
                System.out.println("es el mejor continente");
                break;
            default:
                System.out.println("los otros continentes jeje");
            
        }
    }
    public static void imprimicontinentes(){
        for(Continentes c: Continentes.values()){
            System.out.println("Continente:" + c +" contene "
                    + c.getPaises() +"paises");
        }
    }
}

