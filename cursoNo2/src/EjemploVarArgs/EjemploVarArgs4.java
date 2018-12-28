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
public class EjemploVarArgs4 {
    public static void main(String[] args) {
        int[] prueba={1,2,3,4,5,6};
          int contador=0; 
        for(int cont:prueba){
          
                ++contador;
            System.out.println("los elementos del arreglo prueba son "+contador+":"+cont);
        }
        imprimirNumeros(15,20,3,61,75,18,10);
        
        System.out.println("\b");
        ImprimirNumeroEach(15,20,3,61,75,18,10);
        
        System.out.println("\n\t");
        variosParametros("Dario", true, 5,4,3,5,2,4,5,8,8,4,4);
        
    }
    public static void imprimirNumeros(int ...numeros) {
            int elemento;
            for (int i = 0; i<numeros.length; i++) {
            elemento=numeros[i];
                System.out.println("Elemento "+i+": "+elemento);
        }
        }
    public static void ImprimirNumeroEach(int... numeros){
         for(int numer:numeros){
             
             System.out.println("El numero es"+numer);
         }
         
    }
    public static void variosParametros(String nombre, boolean valido, int ...numeros ){
        System.out.println("Nombre: "+nombre);
        System.out.println("Valido: "+valido);
        int x= numeros.length;
        System.out.println("\n la cantidad de numeros recibidos son:"+x+"\n");
        for(int numero:numeros){
            System.out.println("El numero es:" + numero);
        }
    }
    
}
