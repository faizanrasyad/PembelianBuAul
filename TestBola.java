package OOP.LatihanEnkapsulasi;

import java.util.Scanner;

public class TestBola {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Bola ball=new Bola();

        System.out.println("Masukkan Nilai Jari-jari: ");
        ball.setJarijari(in.nextDouble());
        
        System.out.println("Jari-jari: "+ball.getJarijari());
        System.out.println("Diameter: "+ball.showDiameter());
        System.out.println("Luas Permukaan: "+ball.showLuasPermukaan());
        System.out.println("Volume: "+ball.showVolume());
    }
}
