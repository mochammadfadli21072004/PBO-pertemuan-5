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
public class mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        
        // Melakukan input data mahasiswa
        System.out.print("NPM : ");
        String npm = masukkan.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String nama = masukkan.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        int hadir = masukkan.nextInt();
        
        System.out.print("Nilai Tugas : ");
        int tugas = masukkan.nextInt();
        
        System.out.print("Nilai UTS : ");
        int uts = masukkan.nextInt();
        
        System.out.print("Nilai UAS : ");
        int uas = masukkan.nextInt();
        
        // Cara untuk menghitung nilai akhir
        double nilaiAkhir = (0.10 * hadir) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        String grade;
        String keterangan;
        
        // Menentukan grade dan keterangan berdasarkan nilaiAkhir yang telah didapat
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        // Jika nilaiAkhir bukan bukan angka 0-100
        } else {
            grade = "UNDEFINED";
            keterangan = "SILAHKAN INPUT ULANG NILAI ANDA!";
        }
       
        System.out.println("\nDetail Nilai Mahasiswa");
        System.out.println("NPM Mahasiswa      : " + npm);
        System.out.println("Nama Mahasiswa     : " + nama);
        System.out.println("Nilai Akhir        : " + nilaiAkhir);
        System.out.println("Grade              : " + grade);
        System.out.println("Keterangan         : " + keterangan);
    }
    
}