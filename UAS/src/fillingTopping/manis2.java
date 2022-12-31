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
    //filling dan topping pada Roti Manis varian 2
    public int krimVanila = 5;
    public int sRedBean = 10;
    
    public int getVanila(){
        return krimVanila;
    }
    public int getRedBean(){
        return sRedBean;
    }
    
    //menghitung banyak bahan digunakan
    public double varian(){
        return this.sRedBean + this.krimVanila;
    }
    
    //menghitung banyak modal yang diperlukan
    public double hargaVar(){
        return this.sRedBean * this.hselairb() +
                this.krimVanila * this.hkvanila();
        
    }
}
