/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    int jari;
    void hitungluas(){
        int luas = this.jari * this.jari * 22 /7;
        System.out.println("Luas lingkaran: " + luas);
    }
    void hitungkeliling(){
        int keliling = this.jari * 2 * 22/7;
        System.out.println("Keliling lingkaran: " + keliling);
    }
    public static void main(String args[]) {
        Lingkaran l1 = new Lingkaran();
        l1.jari = 6;
        l1.hitungkeliling();
        l1.hitungluas();
        
        Lingkaran l2 = new Lingkaran();
        l2.jari = 12;
        l2.hitungkeliling();
        l2.hitungluas();
    }
}
