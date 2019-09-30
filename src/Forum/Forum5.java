/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forum;

import java.util.Scanner;

/**
 *
 * @author Nabiela.Sarah
 */
public class Forum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Forum Week 5 ");
        System.out.println("1. Repetetion Operation ");
        System.out.println("2. Jump Operation ");
        System.out.println("3. Case study ");
        System.out.print("Masukan No Diskusi : ");
        Scanner input = new Scanner(System.in);
        int diskusi = input.nextInt();
        System.out.print("Masukan bilangan = ");
        input = new Scanner(System.in);
        int num = input.nextInt();
        switch(diskusi){
            case 1:
               repetitionOperations(num);
                break;
            case 2:
                jumpOperation(num);
                break;
            case 3 :
                caseStudy(num);
                break;
        }
    }
    
    private static void repetitionOperations(int num){
        int index=1;
        int result = 0;
        while(index<11){
            result = num*index;
            System.out.println(num+"x"+index+"="+result);
            index++;
        }
    }

    private static void jumpOperation(int num) {
        int result =0;
        for(int i = 1;i<=num;i++){
         if(i%2==0)
             continue;
             result = result + i;
        }
       System.out.println("Jumlah bilangan ganjil sampai dengan "+num+" adalah "+result);
    }

    private static void caseStudy(int num) {
         System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
