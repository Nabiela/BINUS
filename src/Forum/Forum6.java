/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forum;

/**
 *
 * @author Lenovo
 */
public class Forum6 {
    
    private static void show(int x){
        System.out.println("Value of x is "+x);
    }
    private static String show(String x){
        return "Value of x is "+x;
    }
    public static void main(String[] args) {
        int xInt=10;
        String xString = "20";
        show(xInt);
        String show = show(xString);
        System.out.println(show);
    }  
}
