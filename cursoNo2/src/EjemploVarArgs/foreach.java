/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploVarArgs;

/**
 *
 * @author dquiroz
 */
public class foreach {
    public static void main(String[] args) {
        imprimirNUmerosForEach(1,2,3,4,5);
    }

    private static void imprimirNUmerosForEach(int... numeros) {
        for(int numero : numeros){
            System.out.println("El numero es: "+numero);
        }
    }
    
}
