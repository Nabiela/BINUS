/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individu.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static List<Matakuliah> listMatkul = new ArrayList<>();
    static int pilih;
    public static void main(String[] args) {
        while (true){
            System.out.println(" ");
            System.out.println("Pendataan dan Perhitungan IPS (Indeks Prestasi Semester)");
            System.out.println("1. Pendataan Matakuliah");
            System.out.println("2. Perhitungan IPS");
            System.out.println("3. Update Grade");
            System.out.println("4. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            pilih = input.nextInt();
            switch(pilih) {
                case 1:
                    listMatkul = getData();
                    break;
                case 2:
                    perhitunganIps(listMatkul);
                    break;
                case 3:
                    printUpdateGrade(listMatkul);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Terdaftar!");
            }
        }
    }
    
    private static void perhitunganIps(List<Matakuliah> listMatkul){
        DataMatkul datas = getIPS(listMatkul);
        printDataMatkul(datas);
    }
    private static DataMatkul getIPS(List<Matakuliah> listMatkul){
        DataMatkul result = new DataMatkul();
        double jumlahSks = 0;
        double jumlahSksGrade = 0;
        for(int i = 0;i<listMatkul.size();i++){
            jumlahSks = jumlahSks+(listMatkul.get(i).getSks());
            jumlahSksGrade = jumlahSksGrade+(listMatkul.get(i).getSks() * listMatkul.get(i).getConvertGrade());
        }
        
        Double ips = jumlahSks != 0 ? jumlahSksGrade / jumlahSks : 0;
        result.setListOfMatkul(listMatkul);
        result.setIps(ips);
        return result;
    }
    
    private static String printDataMatkul(DataMatkul datas){
        String result = "";
        System.out.println("Matakuliah yang anda ambil adalah :");
        List<Matakuliah> obj = datas.getListOfMatkul();
        for(int i=0;i<obj.size();i++)
            System.out.println(obj.get(i).getKodeMataKuliah()+"\t"+obj.get(i).getNamaMataKuliah()+"\t"+obj.get(i).getGrade()+"\t"+obj.get(i).getSks());
        System.out.println("Nilai IPS anda adalah : "+datas.getIps());
        
        return result;
    }
    
    private static List<Matakuliah> getData(){
        System.out.print("Masukan Jumlah Matakuliah : ");
        int angka = input.nextInt();
        List<Matakuliah> data = new ArrayList<>();
        for (int i = 0; i < angka; i++) {
            Matakuliah matkul = new Matakuliah();
            System.out.println(" ");
	    System.out.print("Masukan Kode Matakuliah\t: ");
            matkul.setKodeMataKuliah(input.next());
                
            System.out.print("Masukan Nama Matakuliah\t: ");
            matkul.setNamaMataKuliah(input.next());
              
            System.out.print("Masukan Grade Matakuliah: ");
            String grade = input.next();
            if(checkNewGrade(grade)){
                matkul.setGrade(grade);
            }else{
                System.out.println("Invalid Grade ");
                break;
            }           
                
            System.out.print("Masukan Jumlah SKS\t: ");
            matkul.setSks(input.nextInt());
            matkul.setConvertGrade(convertGrading(matkul.getGrade()));
	 
            data.add(matkul);  
        }
        return data;
    }
    
    private static int convertGrading(String grade){
        int bilangan = 0;
        switch(grade) {
            case "A":
                bilangan = 4;
	        break;
            case "B":
                bilangan = 3;
                break;
            case "C":
                bilangan = 2;
                break;
            case "D":
                bilangan = 1;
		break;
            case "E":
                bilangan = 0;
		break;
	}
        return bilangan;
    }
    
    
    
    private static boolean checkNewGrade(String newGrade){
        boolean result = false;
        if(newGrade.equals("A") || newGrade.equals("B") 
                || newGrade.equals("C") || newGrade.equals("D") || newGrade.equals("E") )
            result = true;
        return result;
    }
    
    private static List<Matakuliah> updateData(List<Matakuliah> listMatkul){
        System.out.print("Masukkan Kode Matakuliah: ");
        String kode = input.next();
        System.out.print("Masukkan Grade Baru\t: ");
        String newGrade = input.next();
        for(int i = 0; i< listMatkul.size();i++){
            if(listMatkul.get(i).getKodeMataKuliah().equals(kode)){
                if(checkNewGrade(newGrade) == true){
                    listMatkul.get(i).setGrade(newGrade);
                    listMatkul.get(i).setConvertGrade(convertGrading(newGrade));
                }else{
                    System.out.println("Invalid Grade ");
                    break;
                }
            }else{
                 System.exit(0);
                 System.out.println("Invalid Kode ");
                 break;
            }
        }
        
        return listMatkul;
    }
    
    private static String printUpdateGrade(List<Matakuliah> obj){
        obj = updateData(obj);
        String result = "";
        for(int i=0;i<obj.size();i++)
            System.out.println(obj.get(i).getKodeMataKuliah()+"\t"+obj.get(i).getNamaMataKuliah()+"\t"+obj.get(i).getGrade()+"\t"+obj.get(i).getSks());
        return result;
    }
    
}
