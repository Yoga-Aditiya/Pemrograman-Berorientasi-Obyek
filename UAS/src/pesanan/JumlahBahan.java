/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanan;
import java.util.Scanner;
import komposisiroti.*;
/**
 *
 * @author ASUS
 */
public class JumlahBahan {
    public static void main(String[] args) {
        Scanner bacaData = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Roti Manis yang akan dibuat : ");
        int Jmanis = bacaData.nextInt();
        
        manis m1 = new manis();
        double TotalBeratDough = Jmanis/m1.beratSatuan() * m1.beratDought();
        double TotalRoti = TotalBeratDough / 50;
        double ModalTotal = Jmanis * m1.hargaTotal();
        double Sisa = TotalRoti - Jmanis;
        System.out.println("Total Berat adonan : " + TotalBeratDough);
        System.out.println("Jumlah Roti yang dibuat : " + TotalRoti);
        System.out.println("Modal yang dikeluarkan : " + ModalTotal);
        System.out.println("Sisa roti : " + Sisa);
        
    }
}
