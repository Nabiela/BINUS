/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forum;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Forum8 {
    
public static void main(String[] args) {
       int maxSum = Integer.MIN_VALUE;
       int [][]m = new int[5][5];
       try (Scanner scanner = new Scanner(System.in);)
       {
           for(int i=0;i<6;i++){
               for(int j=0;j<6;j++){
                   m[i][j] = scanner.nextInt();
                   if(i > 1 && j > 1){
                       int sum = m[i][j]+m[i][j-1]+m[i][j-2]
                           +m[i-1][j-1]
                           +m[i-2][j]+m[i-2][j-1]+m[i-2][j-2];
                       if(sum > maxSum){ maxSum= sum;}
                   }
               }
           }
       }
       System.out.println("Maximum sum of hour glass = " + maxSum);
   }
    
}
