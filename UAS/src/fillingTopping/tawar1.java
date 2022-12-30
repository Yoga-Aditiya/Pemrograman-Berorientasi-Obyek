/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class tawar1 extends hargafiltop {
    public double keju;
    public double coklat = 80;
    public double krimVanila;
    public double sRedBean;
    public double sosis;
    public double sBeef;
    public double bBombay;
    
    public double varian(){
        return this.coklat;
    }
    
    public double hargaVar(){
        return this.coklat * this.hcoklat() ;
        
    }
     public void tampilVarians(){
        System.out.println("Banyak Addition " + this.varian());
        System.out.println("Harga Addition: " + this.hargaVar());
    }
}
