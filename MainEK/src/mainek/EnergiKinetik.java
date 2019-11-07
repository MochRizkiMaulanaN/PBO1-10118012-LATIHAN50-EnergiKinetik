/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainek;

/**
 *
 * @author LENOVO
 */
public class EnergiKinetik {
    private int massa;
    private int kecepatan;
    
    EnergiKinetik(int massa,int kecepatan){
       this.massa=massa;
       this.kecepatan=kecepatan;
        
    }

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitung(){
        double hasil=0.5*massa*(kecepatan*kecepatan);
        return hasil;
    }
    
}
