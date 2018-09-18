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
public class TestSiswa {
    public static void main (String [] args) {
        Latihan3 siswa = new Latihan3();
        
        siswa.setName("Dear");
        siswa.setAge(11);
        siswa.getAddress("Malang");
        
        System.out.print("Nama : " +siswa.getName()+ " Absen :" + siswa.getAbsen() + " Address : " +siswa.getAddress());    
    }
    
}
