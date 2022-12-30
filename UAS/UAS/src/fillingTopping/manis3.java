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
    public int keju = 10;
    public int sosis = 10;
    
    public int getKeju(){
        return keju;
    }
    public int getSosis(){
        return sosis;
    }
    
    public double varian(){
        return this.keju + this.sosis;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.sosis * this.hsosis();
        
    }
}
