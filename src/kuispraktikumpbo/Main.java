/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispraktikumpbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
         static ArrayList listdata = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
        
        int pilih, pilih2;
        char ulang;
        
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.println("\nFORM PENDAFTARAN PT. SAMSAN\n");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form : ");
            pilih = scan.nextInt();
            
            switch(pilih){
                case 1 -> { 
                     formdaftar dftr = new formdaftar();
                    
                    System.out.println("FORM PENDAFTARAN");
                
                            System.out.print("Input NIK\t: "); 
                            dftr.nik = scan.nextDouble();
                            System.out.print("Input Nama\t: "); 
                            dftr.nama = scan.nextDouble();
                            System.out.print("Nilai Tes Tulis\t: "); 
                            dftr.nilai1 = scan.nextDouble();
                            System.out.print("Nilai Tes Coding\t: "); 
                            dftr.nilai2 = scan.nextDouble();
                            System.out.print("NIlai Tes Wawancara\t: "); 
                            dftr.nilai3 = scan.nextDouble();
                            
                            System.out.println("\n-------- Menu --------");
                             System.out.println("1. Edit");
                             System.out.println("2. Tampil");
                             System.out.println("3. Exit");
                             System.out.print("Pilih : ");
                             pilih2 = scan.nextInt();
                             switch(pilih2){
                                         case 1 -> {
                                                 edit();
                                                     break;}
                                            case 2 -> {
                                                  tampil();
                                                         break;
                                            }
                                            case 3 -> {
                                                      System.exit(0);
                                                         break;}
                                           
                                             }
                    break;
                }
                
                case 2-> {
                    formdaftar dftr = new formdaftar();
                    
                    System.out.println("FORM PENDAFTARAN");
                
                            System.out.print("Input NIK\t: "); 
                            dftr.nik = scan.nextDouble();
                            System.out.print("Input Nama\t: "); 
                            dftr.nama = scan.nextDouble();
                            System.out.print("Nilai Tes Tulis\t: "); 
                            dftr.nilai1 = scan.nextDouble();
                            System.out.print("Nilai Tes Coding\t: "); 
                            dftr.nilai2 = scan.nextDouble();
                            System.out.print("NIlai Tes Wawancara\t: "); 
                            dftr.nilai3 = scan.nextDouble();
                            
                            System.out.println("\n-------- Menu --------");
                             System.out.println("1. Edit");
                             System.out.println("2. Tampil");
                             System.out.println("3. Exit");
                             System.out.print("Pilih : ");
                             pilih2 = scan.nextInt();
                             switch(pilih2){
                                         case 1 -> {
                                                 edit();
                                                     break;}
                                            case 2 -> {
                                                  tampil();
                                                         break;
                                            }
                                            case 3 -> {
                                                      System.exit(0);
                                                         break;}
                                           
                                             }
                    break;
                }
            
                }
}


static void edit() throws IOException{
    formdaftar dftr = new formdaftar();
     Scanner scan=new Scanner(System.in);

                                System.out.print("Form Edit");
       
        
                            System.out.print("Nilai Tes Tulis\t: "); 
                            dftr.nilai1 = scan.nextDouble();
                             listdata.set(indexdftr, nilai1);
                            
                            System.out.print("Nilai Tes Coding\t: "); 
                            dftr.nilai2 = scan.nextDouble();
                            listdata.set(indexdftr, nilai2);
                            
                            System.out.print("NIlai Tes Wawancara\t: "); 
                            dftr.nilai3 = scan.nextDouble();
                            listdata.set(indexdftr, nilai3);

    }

 static void tampil(){
        if(listdata.isEmpty()){
           System.out.println("Belum ada data");
        }
        else {
            
            for(int i = 0; i < listdata.size(); i++){
                System.out.println(String.format("[%d] %s",i, listdata.get(i)));
            }
        }
 }
