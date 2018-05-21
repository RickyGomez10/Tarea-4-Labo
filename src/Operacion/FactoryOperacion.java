/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import GUI.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryOperacion implements AbstractFactory{
    
    @Override
    public Operacion getOperacion(String type){
        switch(type){
            case "sumar":
                return new Suma();
            case "restar":
                return new Resta();
            case "multiplicar":
                return  new Multiplicar();
            case "dividir":
                return  new dividir();
        } 
            return null;
        
        }
    
    }
    

