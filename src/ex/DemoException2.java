/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author root
 */
public class DemoException2 {
    
    public static void main(String[]args){
        
        int i = 5;
        try{
            if (i < 10){
                throw new MyException("Errrrrror");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    
    public MyException(String message){
       super(message);
    }
    
}