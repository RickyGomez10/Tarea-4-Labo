/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

/**
 *
 * @author LN710Q
 */
public class Multiplicar implements Operacion{
    @Override
    public void operar(int numero1, int numero2){
    int multipicacion = numero1*numero2;
        System.out.println("La multiplicacion es: "+ multipicacion);
    
    }
    
}
