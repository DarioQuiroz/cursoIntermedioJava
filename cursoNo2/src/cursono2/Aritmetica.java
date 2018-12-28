/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursono2;

/**
 *esta clase permite realizar operaciones de aritmetica como sumar, restar etc
 * @author dquiroz
 * @version 1.0
 */
public class Aritmetica {
    
    /**
     * primer operando
     */
    int operandoA;
    /**
     * segundo operando
     */
    int operandoB;
    /**
     *      * * constructor vacio de la clase
     * @param  operandoA  para el valor de A
     * @param operandoB para el valor de B
     */
    public Aritmetica(int operandoA, int operandoB){  
        this.operandoA = operandoA;
        this.operandoB = operandoB;
        
    }

    /**
     * este metodo realiza la suma de dos enteros
     * @return int resultado de la suma
     */
    public int sumar() {
        return operandoA+operandoB;
    }
}
