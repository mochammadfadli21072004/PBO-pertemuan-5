
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

/**
 *
 * @author Mochammad Fadli
 */
public class diskonPembelianBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        
        // Melakukan input untuk total pembelian
        System.out.print("Total Pembelian Rp. = ");
        double totalBeli = masukkan.nextDouble();
        
        //Melakukan inisialisasi variabel
        double diskon;
        double totalPembayaran;
        
        // Menerapkan sistem diskon berdasarkan studi kasus pada soal
        if (totalBeli < 50000) {
            diskon = 0.5 * totalBeli;
        } else {
            diskon = 0.20 * totalBeli;
        }
        
        // Menghitung total pembayaran
        totalPembayaran = totalBeli - diskon;
        
        // Output
        System.out.println("Besarnya potongan Rp. " + diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalPembayaran);
    }
    
}