/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanan;
import java.util.Scanner;
import komposisiroti.*;
import fillingTopping.*;
/**
 *
 * @author ASUS
 */
public class JumlahBahan {
    public static void main(String[] args) {
        Scanner bacaData = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Roti Manis yang akan dibuat : ");
        int Jmanis = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Manis Varian 1 : ");
        int JmanisV1 = bacaData.nextInt();
//        System.out.println("Masukkan Jumlah Roti Manis Varian 2 : ");
//        int JmanisV2 = bacaData.nextInt();
//        System.out.println("Masukkan Jumlah Roti Manis Varian 3 : ");
//        int JmanisV3 = bacaData.nextInt();
        
        manis m1 = new manis();
        manis1 mv1 = new manis1();
        manis2 mv2 = new manis2();
        double TotalBeratDoughM = Jmanis/m1.beratSatuan() * m1.beratDought();
        double TotalRotiM = TotalBeratDoughM / 50;
        int ModalTotalM = (int) (Jmanis/m1.beratSatuan() * m1.hargaTotal());
        int ModalTotalMV1 = (int) (JmanisV1 * mv1.hargaVar());
        int TotM = ModalTotalM + ModalTotalMV1;
        System.out.println("Total Berat adonan      : " + TotalBeratDoughM);
        System.out.println("Jumlah Roti yang dibuat : " + TotalRotiM);
        System.out.println("Modal untuk Roti        : " + ModalTotalM);
        System.out.println("Modal untuk Addition    : " + ModalTotalMV1);
        System.out.println("Total Modal Keseluruhan : " + TotM );
        
        
        System.out.println("Masukkan Jumlah Roti Tawar yang akan dibuat : ");
        int Jtawar = bacaData.nextInt();
        
        tawar t1 = new tawar();
        double TotalBeratDoughT = Jtawar/t1.beratSatuan() * t1.beratDought();
        double TotalRotiT = TotalBeratDoughT / 400;
        int ModalTotalT = (int) (Jtawar/t1.beratSatuan() * t1.hargaTotal());
        System.out.println("Total Berat adonan : " + TotalBeratDoughT);
        System.out.println("Jumlah Roti yang dibuat : " + TotalRotiT);
        System.out.println("Modal yang dikeluarkan : " + ModalTotalT);
        
        
        System.out.println("Masukkan Jumlah Roti Pizza yang akan dibuat : ");
        int Jpizza = bacaData.nextInt();
        
        pizza p1 = new pizza();
        double TotalBeratDoughP = Jpizza/p1.beratSatuan() * p1.beratDought();
        double TotalRotiP = TotalBeratDoughP / 190;
        int ModalTotalP = (int) (Jmanis/p1.beratSatuan() * p1.hargaTotal());
        System.out.println("Total Berat adonan : " + TotalBeratDoughP);
        System.out.println("Jumlah Roti yang dibuat : " + TotalRotiP);
        System.out.println("Modal yang dikeluarkan : " + ModalTotalP);
        
    }
}
