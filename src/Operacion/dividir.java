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
public class dividir implements Operacion{
    @Override
    public int operar(int numero1, int numero2){
    int division = numero1/numero2;
        System.out.println("La division es: "+ division);
        return division;
    
    }

    @Override
    public void operar2(double[] numero1) {

    }

}
