/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testaplikation.View;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rbley
 */
public class ViewConsole implements Observer, ViewInterface {

    @Override
    public void update(Observable o, Object arg) {
        
    }

    @Override
    public void showView(Object obj) {
        System.out.println(obj.toString());
    }


    
}
