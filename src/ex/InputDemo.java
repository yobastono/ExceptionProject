/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 * @author root
 */

// Try with resource
public class InputDemo {
    
    // the throws just for suppressing and not for handler ther error
    public static void main(String[]args) throws IOException, SQLException{
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = "";
            str = br.readLine();
        }
       
    }
}
