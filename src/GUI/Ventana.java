/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author LN710Q
 */
import Operacion.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JPanel {
    public int WIDTH = 700, widthTF= 120, widthB =80;
    public int HEIGHT =700, heightTF = 30, heightB =30;
    public JTextField numero1, numero2, resultado;
    public JButton sumar, restar, multiplicar, dividir, binario;
    
    
    public Ventana(){
    numero1 = new JTextField();
    numero1.setBounds(new Rectangle(100,40,widthTF, heightTF));
    
    numero2 = new JTextField();
    numero2.setBounds(new Rectangle(250,40,widthTF, heightTF));
    
    resultado = new JTextField();
    resultado.setBounds(new Rectangle(200,500,widthTF, heightTF));
    
    sumar = new JButton("Sumar");
    sumar.setBounds(new Rectangle(120,115, widthB, heightB));
    
    restar = new JButton("restar");
    restar.setBounds(new Rectangle(120,150, widthB, heightB));
    
    multiplicar = new JButton("Multiplicar");
    multiplicar.setBounds(new Rectangle(250,115, widthB, heightB));
    
    dividir = new JButton("Dividir");
    dividir.setBounds(new Rectangle(250,150, widthB, heightB));
    
    binario = new JButton("Binario");
    binario.setBounds(new Rectangle(400,125, widthB, heightB));
    
    numero1.setEditable(true);
    numero2.setEditable(true);
    resultado.setEditable(false);
    AbstractFactory factory;
    
    sumar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
             AbstractFactory factory;
            int suma1 = Integer.parseInt(numero1.getText());
            int suma2 = Integer.parseInt(numero2.getText());
            factory = FactoryProducer.getFactory("operacion");
            Operacion suma = factory.getOperacion("sumar");
            suma.operar(suma1, suma2);
            
            
           
        }
    });
    restar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
             AbstractFactory factory;
            int resta1 = Integer.parseInt(numero1.getText());
            int resta2 = Integer.parseInt(numero2.getText());
            factory = FactoryProducer.getFactory("operacion");
            Operacion resta = factory.getOperacion("restar");
            resta.operar(resta1, resta2);
           
        }
    });
    
    multiplicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
             AbstractFactory factory;
            int mult1 = Integer.parseInt(numero1.getText());
            int mult2 = Integer.parseInt(numero2.getText());
            factory = FactoryProducer.getFactory("operacion");
            Operacion multiplicacion = factory.getOperacion("multiplicar");
            multiplicacion.operar(mult1, mult2);
           
        }
    });
    dividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
             AbstractFactory factory;
            int div1 = Integer.parseInt(numero1.getText());
            int div2 = Integer.parseInt(numero2.getText());
            factory = FactoryProducer.getFactory("operacion");
            Operacion division = factory.getOperacion("dividir");
            division.operar(div1, div2);
           
        }
    });
    binario.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        }
    });
    
    
    add(numero1);
    add(sumar);
    add(restar);
    add(dividir);
    add(multiplicar);
    add(binario);
    add(numero2);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    
    
    
    
       
    
    }
    
}


