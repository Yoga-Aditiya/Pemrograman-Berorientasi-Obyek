/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisiroti;
/**
 *
 * @author ASUS
 */
public class manis extends harga {
    //bahan yang diperlukan
    public int tepung =1000 ;
    public int gula =150 ;
    public int butter =150;
    public int ragi =20;
    public int susububuk =300;
    public int susucair =250;
    public int telur =80;
    public int esbatu =400;
    
    public int getTepung(){
        return tepung;
    }
    public int getGula(){
        return gula;
    }
    public int getButter(){
        return butter;
    }
    public int getRagi(){
        return ragi;
    }
    public int getSBubuk(){
        return susububuk;
    }
    public int getSCair(){
        return susucair;
    }
    public int getTelur(){
        return telur;
    }
    public int getEsBatu(){
        return esbatu;
    }
    
    //menghitung berat adonan
    public double beratDought(){
    return this.tepung + this.gula + this.butter + this.ragi + this.susububuk + this.susucair + this.telur + this.esbatu;
    }
    
    //menghitung modal yang diperlukan
    public double hargaTotal(){
        return this.tepung * this.htepung() + 
                this.gula * this.hgula() +
                this.butter * this.hbutter() +
                this.ragi * this.hragi() +
                this.susububuk * this.hsusububuk() +
                this.susucair * this.hsusucair() +
                this.susububuk * this.hsusububuk() +
                this.telur * this.htelur() +
                this.esbatu * this.hesbatu();
    }
    
    //menghitung banyak roti yang dihasilkan
    public double beratSatuan(){
        return this.beratDought()/50;
    }
}
