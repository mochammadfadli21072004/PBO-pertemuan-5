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
public class indeksMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan =new Scanner(System.in);
        
        // Melakukan input berat badan
        System.out.print("Berat badan (kg) = ");
        double beratBadan = masukkan.nextDouble();
        
        //Melakukan input tinggi badan
        System.out.print("Tinggi badan (cm) = ");
        double tinggiBadan = masukkan.nextDouble();
        
        // Tinggi badan dalam satuan m
        double tinggiBadan2 = tinggiBadan / 100;
        
        // Menghitung IMT berdasarkan rumus pada studi kasus
        double imt = beratBadan / (tinggiBadan2 * tinggiBadan2);
        
        // Melakukan pengkondisian
        int kategoriIMT;
          if (imt <= 18.4) {
            kategoriIMT = 1;
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategoriIMT = 2;
        } else if (imt >= 25 && imt <= 29.9) {
            kategoriIMT = 3;
        } else if (imt >= 30 && imt <= 39.9) {
            kategoriIMT = 4;
        } else {
            kategoriIMT = 5;
        }
          
        // Menggunakan switch case untuk memanggil kategoriIMT
        String kriteria;
        switch (kategoriIMT) {
            case 1:
                kriteria = "Berat Badan Kurang";
                break;
            case 2:
                kriteria = "Berat Badan Ideal";
                break;
            case 3:
                kriteria = "Berat Badan Lebih";
                break;
            case 4:
                kriteria = "Gemuk";
                break;
            case 5:
                kriteria = "Sangat Gemuk";
                break;
            default:
                kriteria = "Tidak diketahui";
        }
        
        //Menampilkan output
        System.out.println("\nNilai IMT : " + imt);
        System.out.println("Kriteria    : " + kriteria);
    }
    
}