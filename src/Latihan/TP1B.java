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
public class TP1B {
    public static void main(String[] args) {
        int password;

        TUGASPRAKTIKUM1 Tayo = new TUGASPRAKTIKUM1(40);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        Tayo.getPenumpang(121);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        System.out.println(" Rata-rata Penumpang : " + Tayo.getAverege());

    }

}

