/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class manis3 extends hargafiltop {
    public double keju = 10;
    public double coklat;
    public double krimVanila;
    public double sRedBean;
    public double sosis = 10;
    public double sBeef;
    public double bBombay;
    
    public double varian(){
        return this.keju + this.sosis;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.sosis * this.hsosis();
        
    }
     public void tampilVarians(){
        System.out.println("Banyak Addition " + this.varian());
        System.out.println("Harga Addition: " + this.hargaVar());
    }
}
