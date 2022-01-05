/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.a.tugas.java.konversi.suhu;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {
    
    public String getSuhu(){
        String konversi = "";
        
        double celcius = 55.4;
        double fahrenheit = 150.7;
        double kelvin = 200;
        
        double suhu;
        
        String pilih = "c";
        
        if(pilih=="c"){
            suhu = fahrenheit-32*5/9;
            konversi = "suhu celcius : " + suhu;
        }else if(pilih =="f"){
            suhu = 9/5*celcius + 32;
            konversi = "suhu fahrenheit : " + suhu;
        }else {
            konversi = "tidak ditemukan";
        }
        
        return konversi;
        
    }
}
