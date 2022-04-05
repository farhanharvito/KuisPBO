package kuis;

import java.util.Scanner;

public class Kuis {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int form,menu;
        boolean ulang = true;
        
        System.out.println("FORM PENDAFTARAN PT MAKLO GEMING");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        form = input.nextInt();
        
        System.out.println("");
        
        switch(form){

            case 1 : {
            
                Android andro = new Android();
                
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIM : ");
                 andro.setNim(input2.nextLine());
                 System.out.print("Input Nama : ");
                 andro.setNama(input3.nextLine());
                 
                editAndro(andro,input);
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                         case 1 : {
                                    System.out.println("\nFORM EDIT");
                                    editAndro(andro,input);
                                    break;
                         }
                         case 2 : {
                                    hasilAndro(andro);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         } 
                     }
                 }
            break;
            }
            case 2 : {
            
                Web web = new Web();
                
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIM : ");
                 web.setNim(input2.nextLine());
                 System.out.print("Input Nama : ");
                 web.setNama(input3.nextLine());
                
                editWeb(web,input);
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                     
                         case 1 : {
                                    System.out.println("\nFORM EDIT");
                                    editWeb(web,input);
                                    break;
                         }
                         
                         case 2 : {
                                    hasilWeb(web);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         }
                     }
                 }
                break;
            }
        }    
    }
    
    public static void editAndro(Android andro,Scanner input){

         System.out.print("Input Nilai Tes Tulis : ");
         andro.setTulis(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         andro.setCoding(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         andro.setWawancara(input.nextFloat());

    }
    
    public static void hasilAndro(Android andro){
        
        andro.hitungNilai();
   
        System.out.println("Nilai Akhir : " + andro.getNilai());
        if(andro.getNilai()>= 85){
            System.out.println("Keterangan : Lolos");
            System.out.println("Selamat kepada " + andro.getNama() + " telah diterima sebagai Android");
        }else{
            System.out.println("Keterangan : Gagal");
            System.out.println("Mohon maaf kepada " + andro.getNama() + " telah ditolak sebagai Android");
        } 
    
    }
    
    public static void editWeb(Web web,Scanner input){
        
         System.out.print("Input Nilai Tes Tulis : ");
         web.setTulis(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         web.setCoding(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         web.setwawancara(input.nextFloat());

    }
  
    public static void hasilWeb(Web web){
        
        web.hitungNilai();
        
        System.out.println("Nilai Akhir : " + web.getNilai());
        if(web.getNilai()>= 85){
            System.out.println("Keterangan : Lolos");
            System.out.println("Selamat kepada " + web.getNama() + " telah diterima sebagai Web");
        }else{
            System.out.println("Keterangan : Gagal");
            System.out.println("Mohon maaf kepada " + web.getNama() + " telah ditolak sebagai Web");
        } 
    }
}