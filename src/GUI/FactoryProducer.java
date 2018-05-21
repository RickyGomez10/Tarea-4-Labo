package GUI;


import GUI.AbstractFactory;
import Operacion.FactoryOperacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "operacion":
                return new FactoryOperacion();
        
        }
        return null;
    
    
    
    }
    
}
