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
public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, j, k = 0;
        int a[] = new int[4];
        i = 8;
        j = 2;
        try{
        k = i / j;
        for (int c = 0; c <= 4; c++){
            a[c] = c + 1;
        }
        for ( int value : a){
            System.out.println(value);
        }
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum number of values is 4");
        }
        catch(Exception e){
            System.out.println("Uknown Exception");
        }
        System.out.println(k);
    }
    
}
