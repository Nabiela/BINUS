/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nabiela.Sarah
 */
public class TK1W3S4R1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] val = new int[2];
        System.out.println("Enter "+val.length+" vars: ");
        for(int i = 0; i < val.length; i++) val[i] = scanner.nextInt();
        int no = 4;
       System.out.println("Enter Examination No : ");
       no = scanner.nextInt();
       switch(no){
            case 4:
               examNoFour(val);
            break;
            case 5:
                examNoFive(val);
            break;
       }
    }
    
    private static void examNoFour(int[] val){
        int greater = val[0];
        int smaller = val[1];
        if(val[0] < val[1]){
            greater = val[1];
            smaller = val[0];
        }
        double power = (int) Math.pow(val[0], val[1]);
        double quadratic = (Math.pow(val[0], 2)+Math.pow(val[1],2));
        System.out.println("Nilai terbesar = "+greater);
        System.out.println("Nilai terkecil = "+smaller);
        System.out.println("Nilai pangkat dari bilangan "+val[0]+" dipangkat bilangan "+val[1]+" = "+power);
        System.out.println("Nilai kuadrat dari bilangan "+val[0]+" dan bilangan "+ val[1] +" = "+quadratic);
    }

    private static void examNoFive(int[] val) {
        int min = val[0];
        int max = val[1];
        Random rand = new Random();
        int random = rand.nextInt((max-min)+1)+min;
        if(random%2==1){
            random = random+1;
        }
        System.out.println("Nilai random bilangan genap = "+random);
    }
    
}