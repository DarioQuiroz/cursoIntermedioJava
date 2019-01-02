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
public class ForEach {
    public static void main(String[] args) {
        Persona [] personas={new Persona("juan"), new Persona("Karña")};
        for(Persona p:personas){
            String nombre=p.getNombre();
            System.out.println("nombre de la persona "+nombre);
        }
        int edades []={15,20,41,5};
        for (int edade : edades) {
            System.out.println("Edad:"+edade);
            
        }
           
    }
}
