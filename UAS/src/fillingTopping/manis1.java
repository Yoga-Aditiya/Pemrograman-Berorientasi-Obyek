/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class manis1 extends hargafiltop {
    public double keju=5;
    public double coklat=10;
    public double krimVanila;
    public double sRedBean;
    public double sosis;
    public double sBeef;
    public double bBombay;
    
    public double varian(){
        return this.keju + this.coklat + this.coklat;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.coklat * this.hcoklat() ;
        
    }
     public void tampilVarians(){
        System.out.println("Banyak Addition " + this.varian());
        System.out.println("Harga Addition: " + this.hargaVar());
    }
}
