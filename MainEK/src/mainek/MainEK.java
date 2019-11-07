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
public class MainEK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik EK=new EnergiKinetik(145,25);
        System.out.println("Massa : "+EK.getMassa());
        System.out.println("Kecepatan : "+EK.getKecepatan());
        System.out.println("");
        System.out.println("Hasil Energi Kinetiknya Adalah : "+EK.hitung());
    }
    
}
