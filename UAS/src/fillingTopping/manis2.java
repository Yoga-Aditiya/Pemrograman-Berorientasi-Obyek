/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class manis2 extends hargafiltop {
    public double keju;
    public double coklat;
    public double krimVanila = 5;
    public double sRedBean = 10;
    public double sosis;
    public double sBeef;
    public double bBombay;
    
    public double varian(){
        return this.sRedBean + this.krimVanila;
    }
    
    public double hargaVar(){
        return this.sRedBean * this.hselairb() +
                this.krimVanila * this.hkvanila();
        
    }
     public void tampilVarians(){
        System.out.println("Banyak Addition " + this.varian());
        System.out.println("Harga Addition: " + this.hargaVar());
    }
}
