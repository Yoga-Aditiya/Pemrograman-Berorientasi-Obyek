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
    public int keju = 5;
    public int coklat = 10;
    
    public int getKeju(){
        return keju;
    }
    public int getCoklat(){
        return coklat;
    }
    
    public double varian(){
        return this.keju + this.coklat;
    }
    
    public double hargaVar(){
        return this.keju * this.hkeju() +
                this.coklat * this.hcoklat() ;
        
    }
     
}
