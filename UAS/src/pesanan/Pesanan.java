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
public class Pesanan {
    public static void main(String[] args) {
        //memasukkan data pesanan roti manis yang akan dibuat
        Scanner bacaData = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Roti Manis yang akan dibuat : ");
        int Jmanis = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Manis Varian 1 : ");
        int JmanisV1 = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Manis Varian 2 : ");
        int JmanisV2 = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Manis Varian 3 : ");
        int JmanisV3 = bacaData.nextInt();
        System.out.println("");
        
        //menghitung adonan, filling, topping, modal, dan profit dari manis yang dipesan
        manis m1 = new manis();
        manis1 mv1 = new manis1();
        manis2 mv2 = new manis2();
        manis3 mv3 = new manis3();
        int TotalBeratDoughM = (int) (Jmanis/m1.beratSatuan() * m1.beratDought());
        int TotalRotiM = (int) (TotalBeratDoughM / 50);
        int ModalTotalM = (int) (Jmanis/m1.beratSatuan() * m1.hargaTotal());
        int ModalTotalMV1 = (int) (JmanisV1 * mv1.hargaVar());
        int ModalTotalMV2 = (int) (JmanisV2 * mv2.hargaVar());
        int ModalTotalMV3 = (int) (JmanisV3 * mv3.hargaVar());
        int TotM = ModalTotalM + ModalTotalMV1 + ModalTotalMV2 + ModalTotalMV3;
        int PM = TotM * 50/100;
        int PcsM =( TotM + PM )/TotalRotiM;

        if ( JmanisV1 + JmanisV2 + JmanisV3 == Jmanis){
            System.out.println("Total Berat adonan      : " + TotalBeratDoughM);
            System.out.println("Jumlah Roti yang dibuat : " + TotalRotiM);
            System.out.println("---------------------------------------------");
            System.out.println("Modal untuk Adonan Roti : Rp. " + String.format("%,d\n",ModalTotalM));
            System.out.println("Modal untuk Varian 1    : Rp. " + String.format("%,d\n",ModalTotalMV1));
            System.out.println("Modal untuk Varian 2    : Rp. " + String.format("%,d\n",ModalTotalMV2));
            System.out.println("Modal untuk Varian 3    : Rp. " + String.format("%,d\n",ModalTotalMV3));
            System.out.println("---------------------------------------------");
            System.out.println("Total Modal Keseluruhan : Rp. " + String.format("%,d\n",TotM));
            System.out.println("=============================================");
            System.out.println("Profit Roti Manis       : Rp. " + String.format("%,d\n",PM));
            System.out.println("Harga per Pcs           : Rp. " + String.format("%,d\n",PcsM));
            System.out.println("");
            System.out.println("");
        }
        else {
            System.out.println("DATA YANG ANDA MASUKKAN TIDAK SESUAI ! ");
            System.exit(0);
        }
        
        //memasukkan data pesanan roti tawar yang akan dibuat
        System.out.println("Masukkan Jumlah Roti Tawar yang akan dibuat : ");
        int Jtawar = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Tawar Varian 1 : ");
        int JtawarV1 = bacaData.nextInt();
        System.out.println("Masukkan Jumlah Roti Tawar Varian 2 : ");
        int JtawarV2 = bacaData.nextInt();
        System.out.println("");
        
        //menghitung adonan, filling, topping, modal, dan profit dari roti tawar yang dipesan
        tawar t1 = new tawar();
        tawar1 tv1 = new tawar1();
        tawar2 tv2 = new tawar2();
        int TotalBeratDoughT = (int) (Jtawar/t1.beratSatuan() * t1.beratDought());
        int TotalRotiT = (int) (TotalBeratDoughT / 400);
        int ModalTotalT = (int) (Jtawar/t1.beratSatuan() * t1.hargaTotal());
        int ModalTotalTV1 = (int) (JtawarV1 * tv1.hargaVar());
        int ModalTotalTV2 = (int) (JtawarV2 * tv2.hargaVar());
        int TotT = ModalTotalT + ModalTotalTV1 + ModalTotalTV2;
        int PT = TotT * 50/100;
        int PcsT =( TotT + PT )/TotalRotiT;

        if ( JtawarV1 + JtawarV2 == Jtawar ){
           
            System.out.println("Total Berat adonan      : " + TotalBeratDoughT);
            System.out.println("Jumlah Roti yang dibuat : " + TotalRotiT);
            System.out.println("---------------------------------------------");
            System.out.println("Modal untuk Adonan Roti : Rp. " + String.format("%,d\n",ModalTotalT));
            System.out.println("---------------------------------------------");
            System.out.println("Modal untuk Varian 1    : Rp. " + String.format("%,d\n",ModalTotalTV1));
            System.out.println("Modal untuk Varian 2    : Rp. " + String.format("%,d\n",ModalTotalTV2));
            System.out.println("---------------------------------------------");
            System.out.println("Total Modal Keseluruhan : Rp. " + String.format("%,d\n",TotT));
            System.out.println("=============================================");
            System.out.println("Profit Roti Tawar       : Rp. " + String.format("%,d\n",PT));
            System.out.println("Harga per Pcs           : Rp. " + String.format("%,d\n",PcsT));
            System.out.println("");
            System.out.println("");
        }
        else {
            System.out.println("DATA YANG ANDA MASUKKAN TIDAK SESUAI ! ");
            System.exit(0);
        }
        
        //memasukkan data pesanan pizza yang akan dibuat
        System.out.println("Masukkan Jumlah Roti Pizza yang akan dibuat : ");
        int Jpizza = bacaData.nextInt();
        System.out.println("");
        
        //menghitung adonan, filling, topping, modal, dan profit dari pizza yang dipesan
        pizza p1 = new pizza();
        pizza1 pv1 = new pizza1();
        int TotalBeratDoughP = (int) (Jpizza/p1.beratSatuan() * p1.beratDought());
        int TotalRotiP = (int) (TotalBeratDoughP / 190);
        int ModalTotalP = (int) (Jmanis/p1.beratSatuan() * p1.hargaTotal());
        int ModalTotalPV1 = (int) (Jpizza * pv1.hargaVar());
        int TotP = ModalTotalP + ModalTotalPV1;
        int PP = TotP * 50/100;
        int PcsP =( TotP + PP )/TotalRotiP;
        
        System.out.println("Total Berat adonan : " + TotalBeratDoughP);
        System.out.println("Jumlah Roti yang dibuat : " + TotalRotiP);
        System.out.println("Modal untuk Adonan Pizza: Rp. " + String.format("%,d\n",ModalTotalP));
        System.out.println("---------------------------------------------");
        System.out.println("Modal untuk Topping     : Rp. " + String.format("%,d\n",ModalTotalPV1));
        System.out.println("---------------------------------------------");
        System.out.println("Total Modal Pizza       : Rp. " + String.format("%,d\n",TotP));
        System.out.println("=============================================");
        System.out.println("Profit Pizza            : Rp. " + String.format("%,d\n",PP));
        System.out.println("Harga per Pcs           : Rp. " + String.format("%,d\n",PcsP));
        System.out.println("");
        System.out.println("");
        
        // LIST TOPPING DAN FILLING YANG DIPERLUKAN //
            int Coklat = mv1.getCoklat() + tv1.getCoklat();
            int Keju = mv1.getKeju() + mv3.getKeju() + tv2.getKeju() + pv1.getKeju();
            int RedBean = mv2.getRedBean();
            int Vanila = mv2.getVanila();
            int Sosis = mv3.getSosis() + pv1.getSosis();
            int Beef = pv1.getBeef();
            int Bombay = pv1.getBombay();
            
        // LIST BAHAN DASAR ADONAN YANG DIPERLUKAN //
            int Tepung = m1.getTepung() + t1.getTepung() + p1.getTepung();
            int Gula = m1.getGula() + t1.getGula() + p1.getGula();
            int Butter = m1.getButter() + t1.getButter() + p1.getButter();
            int Ragi = m1.getRagi() + t1.getRagi() + p1.getRagi();
            int SBubuk = m1.getSBubuk() + t1.getSBubuk() + p1.getSBubuk();
            int SCair = m1.getSCair() + t1.getSCair() + p1.getSCair();
            int Telur = m1.getTelur() + t1.getTelur() + p1.getTelur();
            int EsBatu = m1.getEsBatu() + t1.getEsBatu() + p1.getEsBatu();
        
        //total keseluruhan bahan adonan dari pesanan yang masuk
        System.out.println("=============================================");
        System.out.println("LIST TOTAL BAHAN DASAR ADONAN");
        System.out.println("Tepung  : " + Tepung * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("Gula    : " + Gula * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("Butter  : " + Butter * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("Ragi    : " + Ragi * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("S.Bubuk : " + SBubuk * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("S.Cair  : " + SCair * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("Telur   : " + Telur * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        System.out.println("Es Batu : " + EsBatu * (TotalRotiM + TotalRotiT + TotalRotiP)+" Gram");
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        
        //total kesseluruhan filling dan topping dari pesanan yang masuk
        System.out.println("LIST TOTAL TOPPING & FILLING");
        System.out.println("Coklat  : " + Coklat * (JmanisV1 + JtawarV1)+" Gram");
        System.out.println("Keju    : " + Keju * (JmanisV1 + JmanisV3 + JtawarV2 + Jpizza)+" Gram");
        System.out.println("RedBean : " + RedBean * JmanisV2+" Gram");
        System.out.println("Vanila  : " + Vanila * JmanisV2+" Gram");
        System.out.println("Sosis   : " + Sosis * (JmanisV3 + Jpizza)+" Gram");
        System.out.println("Beef    : " + Beef * Jpizza+" Gram");
        System.out.println("Bombay  : " + Bombay * Jpizza+" Gram");
        System.out.println("=============================================");
        
        //Total keseluruhan modal dan profit dari pesanan yang masuk
        int TotalAll = TotM + TotT + TotP;
        int profit = TotalAll * 50/100;
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("Total Seluruh Modal Adalah : Rp. " + String.format("%,d\n",TotalAll));
        System.out.println("Profit Seluruh Roti        : Rp. " + String.format("%,d\n",profit));
        System.out.println("=============================================");
        System.out.println("");
    }
}
