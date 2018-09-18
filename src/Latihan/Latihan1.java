/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Nita
 */
public class Latihan1 {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak() {
        System.out.println("Penumpang Bus Sekarang adalah " +penumpang);
         System.out.println ("Penumpang maksimum seharusnya adalah " +maxPenumpang);
    }
}

    

 class busMini {
     public static void main (String [] args ) {
                  
         //membuat objek busMini dari kelas Bus
            Latihan1 busMini = new Latihan1();
            
         //memasukan nilai jumlah penumpang dan penumpang maksimal ke dalam objek bus Mini
         busMini.penumpang = 5;
         busMini.maxPenumpang= 15;
         
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         //menambahkan penumpang pada busMini
         busMini.penumpang = busMini.penumpang + 5;
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         //mengurangi jumlah penumpag pada busMini
         busMini.penumpang = busMini.penumpang - 2;
         busMini.cetak();
         
         //menambahkan jumlah penumpang pada busMini
         busMini.penumpang = busMini.penumpang + 8;
         busMini.cetak();          
     }
 }