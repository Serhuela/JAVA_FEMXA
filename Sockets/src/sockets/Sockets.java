/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sergio.huerta
 */
public class Sockets {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Starting...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello. Please write your name: ");
        String name = br.readLine();
        System.out.println("Your name is: "+name);
        System.out.println("Closing...");
    }
    
}
