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
    //filling dan topping pada Roti Tawarian 2
    public int coklat = 80;
    
    public int getCoklat(){
        return coklat;
    }
    
    //menghitung banyak bahan yang digunakan
    public double varian(){
        return this.coklat;
    }
    
    //menghitung banyak modal yang diperlukan
    public double hargaVar(){
        return this.coklat * this.hcoklat() ;
        
    }
}
