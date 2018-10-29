/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author root
 */

// Try with resource
public class InputDemo {
    
    public static void main(String[]args) throws Exception{
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = "";
            str = br.readLine();
        }
       
    }
}
