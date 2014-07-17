/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import com.mycompany.testaplikation.Model.Model;

/**
 *
 * @author rbley
 */
public class Controller implements ControllerInterface{
    
    private static Controller instance = null;

    public Controller() {
        new Model();
    }

    @Override
    public ControllerInterface getInstance() {
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    
    
}
