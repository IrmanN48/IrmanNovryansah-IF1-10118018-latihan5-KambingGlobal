/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5.kambingglobal;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * Kelas    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program ini untuk menampilkan value dari variabel
 *                      instance
 */
public class Latihan5KambingGlobal {
    
    //Variable jumlahKambing menjadi variable Instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing : "+jumlahKambing);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Latihan5KambingGlobal Latihan5KambingGlobal= new Latihan5KambingGlobal();
     
     //menampilkan jumlah kambing yang ada saat program pertama x berjalan
     Latihan5KambingGlobal.getJumlahKambing();
     
     //menambahkan satu kambing
     Latihan5KambingGlobal.getJumlahKambing();
     
     //Menampilkan jumlah kambing yang ada
     Latihan5KambingGlobal.getJumlahKambing();
     
    }

    private void GetJumlahKambing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
