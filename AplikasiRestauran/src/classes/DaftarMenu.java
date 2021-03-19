/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author A409FJ
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DaftarMenu {
    private ArrayList<Menu> daftarMenu;
    
    public DaftarMenu() { 
        daftarMenu = new ArrayList<>();
    }
    
    public void tambahMenu (Menu menu) { 
        daftarMenu.add(menu);
    }
    
    public void getMenuByKategori(String kategori) { 
        System.out.println("========" + kategori + "========");
        
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)){
                System.out.println((i + 1) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }
    
    public void tampilDaftarMenu() { 
        System.out.println("======== CHEWYRAMEN ========");
        getMenuByKategori("Ramen");
        getMenuByKategori("Kuah");
        getMenuByKategori("Toping");
        getMenuByKategori("Minuman");
    }

    public void tampilDaftraMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //tambah method
    public Menu pilihMenu(){
        try{
            Scanner input = new Scanner(System.in);
            
            System.out.print("Nomor Menu yang dipersan: ");
            int no_menu = input.nextInt();
            
            Menu m = daftarMenu.get(no_menu-1);
            
            //get menu berdasarkan no_menu, di -1 karena arraylist muali dari 0
            if(!m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            } else {
                //jika yang dipilih adalah menu kuah maka tidak bisa, user harus memilihh lagi
                System.out.println("[Err] Pesanan dulu Menu Ramen");
                return pilihMenu();
            }
        }catch(IndexOutOfBoundsException err){
            //jika no_menu tidak ada, makan akan masuk ke sini
            //no_menu dianggap tidak ada ketika no_menu diluar dari index pada arrayLIst
            
            System.out.println("[Err] Pesanan Tidak Tersedia");
            //Jika tidak ada, maka user akan diminta untuk mengulang memasukkan nomor menu
            //teknik ini disebut dengan rekursif
            return pilihMenu();
        }catch(InputMismatchException err){
            //jika input bukan berupa kangka akan masuk kesini
            System.out.println("[Err] Mohon masukkan nomor menu");
            return pilihMenu();
        }
    }
    public Menu pilihKuah(){
        try{
            Scanner input = new Scanner(System.in);
            
            System.out.print("Kuah [sesuai nomor menu] : ");
            int no_menu = input.nextInt();
            
            //get menu berdasarkan no_menu, di -1 karena arrayList mulai dari 0
            Menu m = daftarMenu.get(no_menu-1);
            
            //cek apakah menu kuah?
            if(m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            }else{
                System.out.println("[Err] Bukan Menu Kuah");
                return pilihKuah();
            }
        }catch(IndexOutOfBoundsException err){
            //jika no_menu tidak ada, maka akan masuk kesini
            //no_menu dianggap tidak ada ketika no_menu dilkuar dari index pada arrayList
            
            System.out.println("[Err] Pesanan Tidak tersedia");
            //jika tidak ada, maka user akan diminta untuk mengulang memasukkan nomor menu
            //teknik ini disebut dengan rekursif
            return pilihKuah();
        }catch(InputMismatchException err){
            //jika input bukan berupa angka akan masuk kesini
            System.out.println("[Err] Mohon masukkan nomor kuah");
            return pilihKuah();
        }
    }
} 
