/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testaplikation.ausgabe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rbley
 */
public class GuiAusgabe extends JFrame{
    
    private JLabel label;
    private JTextField textField;

    public GuiAusgabe(){
        this.setBounds(200, 200, 400, 100);
        this.setVisible(true);
        this.textField.setBounds(30, 100, 40, 200);
        this.add(this.textField);
    }
    
    public void setText(String text){
        
        this.label.setText(text);
        this.label.setBounds(10, 10, 100, 10);
        this.label.setVisible(true);
        
        
        
    }
    


    
    
}
