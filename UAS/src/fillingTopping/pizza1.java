/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class pizza1 extends hargafiltop {
    public double keju = 30;
    public double coklat;
    public double krimVanila;
    public double sRedBean;
    public double sosis =50;
    public double sBeef = 50;
    public double bBombay = 30;
    
    public double varian(){
        return this.keju + this.sosis + this.sBeef + this.bBombay;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.sosis * this.hsosis() +
                this.sBeef * this.hsbeef() +
                this.bBombay * this.hbbombay();
        
    }
     public void tampilVarians(){
        System.out.println("Banyak Addition " + this.varian());
        System.out.println("Harga Addition: " + this.hargaVar());
    }
}
