/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Persegi {
    int sisi;
    void hitungluas(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luasnya: " + luas);
    }
    void hitungkeliling(){
        int keliling = this.sisi * 4;
        System.out.println("Kelilingnya: " + keliling);
    }
    public static void main(String args[]) {
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.hitungkeliling();
        p1.hitungluas();
        // TODO code application logic here
    }
}