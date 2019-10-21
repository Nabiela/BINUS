/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forum;

import java.util.Vector;

/**
 *
 * @author Nabiela
 */
public class Forum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sampleArray();
        sampleVector();
    }
    
    private static Vector v = new Vector();
    private static int[] datas = new int[5];
    
    private static void sampleArray(){
        System.out.println("Sample using Array : ");
        int val = 0;
        for(int i=0;i<datas.length;i++){
            val =val+10;
            datas[i]=val;
            System.out.println("Data ke "+i+ " adalah :"+datas[i]);
        }
    }
    
    private static void sampleVector(){
        v.add("Sarah");
        v.add(0,"Nabiela");
        System.out.println("Apakah data kosong ? "+v.isEmpty());
        System.out.println("Berapa ukurannya ? "+v.size());
        System.out.println("Apa isi dari vectornya ? ");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        v.set(1, "another_last_name");
        System.out.println("Apa isi dari vectornya sekarang ? ");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
    
}
