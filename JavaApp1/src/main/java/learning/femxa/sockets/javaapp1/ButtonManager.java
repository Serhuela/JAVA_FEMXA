/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.femxa.sockets.javaapp1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sergio.huerta
 */
public class ButtonManager implements ActionListener{
    
    /**
     * FILLME
     */
    private int counter = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The button was pressed " + ++counter + " times.");
    }
    
}
