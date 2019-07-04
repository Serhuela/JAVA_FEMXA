/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.femxa.sockets.Sockets;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sergio.huerta
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Starting...");
        
        try {
            FileOutputStream fos;
            fos = new FileOutputStream("datos.dat");
            DataOutputStream dos;
            dos = new DataOutputStream(fos);
            dos.writeUTF("bla");
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }
        
        System.out.println("Closing...");
    }
    
}
