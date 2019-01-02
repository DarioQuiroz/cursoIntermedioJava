/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDeBloques;

/**
 *
 * @author dquiroz
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
  
    static{
        contadorPersonas=10;
        System.out.println("Ejecuta el bloque estatico");
    }
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona=contadorPersonas;
    }
  int personas[]=new int[idPersona];
  public int primerValor() {
   return personas.length;
}
    public Persona() {
        System.out.println("ejecuta constructor");
    }
    public int getidPersona() {
        return idPersona;
    }
    
}
