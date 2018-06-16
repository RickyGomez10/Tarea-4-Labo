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
public class Suma implements Operacion{
    @Override
    public int operar(int numero1, int numero2){
    int sumar = numero1+numero2;
        System.out.println("La suma es: "+ sumar);
        return sumar;
    }

    @Override
    public void operar2(double[] numero1) {

    }

}
