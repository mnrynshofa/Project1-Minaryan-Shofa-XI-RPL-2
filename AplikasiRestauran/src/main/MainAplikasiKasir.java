/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Toping;
import java.util.Scanner;

/**
 *
 * @author A409FJ
 */
public class MainAplikasiKasir {
    //Tambahkan
    public static double PAJAK_PPN = 0.10;
    public static double Biaya_SERVICE = 0.05;
    //End Of Tambahkan 
    
    public static void main(String[] args) { }
        //init
        Scanner input = new Scanner(System.in);
        //Tambahkan
        String no_transaksi, nama_pesanan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan="", makaan_ditempat;
        int jumlah_pesanan, no_menu;
        //end of tambahkan
        
        MainAplikasiKasir app = new MainAplikasiKasir();
        //tampilkan daftar menu
        app.generateDaftarMenu();
        
       //mulai transaksi
        System.out.println("========== Transaksi ==========");
        
        //ambil data transaksi
        System.out.print("No Transaksi:");
        no_transaksi = input.next();
        System.out.print("Pemesan:");
        nama_pemesan = input.next();
        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.orint("Makan ditempat? [Y/N] ");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")){
            System.out.print("Nomor Meja: ");
            no_meja = input.next();
        }
        
        
        

        
    public void generateDaftarMenu() { 
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chiken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Just Alpukan SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
        
        daftarMenu.tampilDaftraMenu();
    }
    
    public DaftarMenu daftarMenu;
    
}
