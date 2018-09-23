/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geo Syah Alkautsar
 * 10117081 IF-2
 * Menampilkan hasil penambahan kambing
 */
public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing() {
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing Setelah Ditambah : " + jumlahKambing);
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    
    }
    
}
