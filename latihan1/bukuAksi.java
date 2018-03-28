/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author user
 */
public class bukuAksi {
    public static void main (String [] args) {
        buku Bab1 = new buku();
        buku Bab2 = new buku();
        buku Bab3 = new buku();
        
        System.out.println("Bab1");
        Bab1.Cover="Pembahasan";
        Bab1.Halaman=("22-30");
        Bab1.DaftarIsi=("halaman 5");
        Bab1.Bab=("Pembahasan");
            Bab1.infobuku();
            
        System.out.println("Bab2");
        Bab2.Cover="Isi";
        Bab2.Halaman=("31-40");
        Bab2.DaftarIsi=("halaman 5");
        Bab2.Bab=("Isi");
            Bab2.infobuku();
            
        System.out.println("Bab3");
        Bab1.Cover="kesimpulan";
        Bab1.Halaman=("31-40");
        Bab1.DaftarIsi=("halaman 5");
        Bab1.Bab=("kesimpulan");
            Bab3.infobuku();
    }
    
}
