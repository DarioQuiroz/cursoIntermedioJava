/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author dquiroz
 */
public class Persona {
    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;
    Persona(String nombre){
        idPersona=++contadorPersonas;
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
            
    public void setNombre(String Nombre){
        this.nombre=nombre;
    }
}
