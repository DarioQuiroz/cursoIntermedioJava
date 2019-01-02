/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoboxinUnboxin;

/**
 *
 * @author dquiroz
 */
public class AutoboxinUnboxin {
    public static void main(String[] args) {
        Integer enteroObj=10;
        Float flotanteObj=15.2F;
        Double dobleObj=40.1;
        System.out.println("Autoboxin");
        System.out.println("Entero Obj: "+enteroObj.intValue());
        System.out.println("Flotante Obj: "+flotanteObj.floatValue());
        System.out.println("Double Obj: "+dobleObj.doubleValue());
        
        int entero=enteroObj;
        float flotante=flotanteObj;
        double doble=dobleObj;
        System.out.println("\n unboxin");        
        System.out.println("Entero: "+entero);
        System.out.println("Flotante: "+flotante);
        System.out.println("Double: "+doble);
    }
}
