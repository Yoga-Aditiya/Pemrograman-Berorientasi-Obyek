/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisiroti;

/**
 *
 * @author ASUS
 */
public class pizza extends harga {
    public double tepung =1000 ;
    public double gula =100 ;
    public double butter =100;
    public double ragi =20;
    public double susububuk =200;
    public double susucair =180;
    public double telur =50;
    public double esbatu =300;
    
    public double beratDought(){
    return this.tepung + this.gula + this.butter + this.ragi + this.susububuk + this.susucair + this.telur + this.esbatu;
    }
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
    public double beratSatuan(){
        return this.beratDought()/190;
    }
     public void tampilBerat(){
        System.out.println("Berat Adonan: " + this.beratDought());
        System.out.println("Jumlah Adonan yang terbuat: " + this.beratSatuan());
    }
}
