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
public class TP2B {
    public static void main(String[] args) {
        double r = 14;
        TUGASPRAKTIKUM2 bola = new TUGASPRAKTIKUM2(7);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println();
        System.out.println();
        System.out.println();

        bola.setJarijari(r);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}

