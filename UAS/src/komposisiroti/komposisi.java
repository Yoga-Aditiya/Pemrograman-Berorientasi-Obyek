/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisiroti;

/**
 *
 * @author ASUS
 */
public  class komposisi {
    
    public static void main(String[] args) {
        manis m1 = new manis();
        m1.beratDought();
        m1.beratSatuan();
        m1.tampilBerat();
        m1.hargaTotal();
        
        tawar t1 = new tawar();
        t1.beratDought();
        t1.beratSatuan();
        t1.tampilBerat();
        t1.hargaTotal();
        
        pizza p1 = new pizza();
        p1.beratDought();
        p1.beratSatuan();
        p1.tampilBerat();
       p1.hargaTotal();
    }
}
