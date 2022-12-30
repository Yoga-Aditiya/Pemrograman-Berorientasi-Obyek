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
    public int keju = 30;
    public int sosis =50;
    public int sBeef = 50;
    public int bBombay = 30;
    
    public int getKeju(){
        return keju;
    }
    public int getSosis(){
        return sosis;
    }
    public int getBeef(){
        return sBeef;
    }
    public int getBombay(){
        return bBombay;
    }
    
    public double varian(){
        return this.keju + this.sosis + this.sBeef + this.bBombay;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.sosis * this.hsosis() +
                this.sBeef * this.hsbeef() +
                this.bBombay * this.hbbombay();
        
    }
}
