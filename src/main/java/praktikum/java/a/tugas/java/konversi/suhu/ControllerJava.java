/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.a.tugas.java.konversi.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */
@Controller
@ResponseBody
public class ControllerJava {
    
    KonversiSuhu ks = new KonversiSuhu();
    
    @RequestMapping("/suhu")
    public String suhu(){
        String hasil = ks.getSuhu();
        
        return hasil;
    }
}
