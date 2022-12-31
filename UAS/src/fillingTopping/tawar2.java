/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fillingTopping;

/**
 *
 * @author ASUS
 */
public class tawar2 extends hargafiltop {
    //filling dan topping pada Roti Tawar varian 1
    public int keju = 80;
    
    public int getKeju(){
        return keju;
    }
    
    //menghitung bayak bahan yang digunakan
    public double varian(){
        return this.keju;
    }
    
    //menghitung banyak modal yang diperlukan
    public double hargaVar(){
        return this.keju * this.hkeju();
        
    }
}
