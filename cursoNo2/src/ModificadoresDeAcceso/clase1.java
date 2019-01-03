/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModificadoresDeAcceso;

/**
 *
 * @author dquiroz
 */
public class clase1 {
    public int atrPublico=5;
    protected int atrProtected=6;
    int atrPaquete=7;
    private int atrPrivado=8;
    public clase1(){
            
    }
    public clase1(int i){
        System.out.println("Constructor publico 1");
        
    }
    protected clase1(int i, int j){
            System.out.println("constructor protected 2");
                
    }
    clase1(int i, int j, int k){
        System.out.println("constructor pacage o default 3");
    }
    private clase1(int i, int j, int k, int l){
        System.out.println("constructor privado 4");
    }
    
    
}
