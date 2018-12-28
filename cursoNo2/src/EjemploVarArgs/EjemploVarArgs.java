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
public class EjemploVarArgs {
    public static void main(String[] args) {
        imprimir_numeros(1,2);
    }

    private static void imprimir_numeros(int...numeros) {
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento=numeros[i];
            System.out.println("Elemento:"+ elemento);
            
        }
    }
}
