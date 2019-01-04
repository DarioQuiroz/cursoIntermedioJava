/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSobreescritura;

/**
 *
 * @author dquiroz
 */
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    protected Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    public String obtenerDetalles(){
        return "Nombre: "+nombre+", sueldo: "+sueldo;
    }
}
