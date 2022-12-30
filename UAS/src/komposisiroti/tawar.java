/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisiroti;


/**
 *
 * @author ASUS
 */
public class tawar {
    public double tepung =1000 ;
    public double gula =125 ;
    public double butter =100;
    public double ragi =20;
    public double susububuk =250;
    public double susucair =200;
    public double telur =70;
    public double esbatu =300;
    
    public double beratDought(){
    return this.tepung + this.gula + this.butter + this.ragi + this.susububuk + this.susucair + this.telur + this.esbatu;
    }
    public double beratSatuan(){
        return this.beratDought()/400;
    }
     public void tampilBerat(){
        System.out.println("Berat Adonan: " + this.beratDought());
        System.out.println("Jumlah Adonan yang terbuat: " + this.beratSatuan());
    }
}
