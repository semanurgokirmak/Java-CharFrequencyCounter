package Javapackage;

import java.util.Scanner;

public class HarfBul {

    public static void main(String[] args) {
    	
        // kullanıcıdan alınan bir string içinde kaç tane belirtilen harfin olduğunu bulan proje
    	
    	
        Scanner scan = new Scanner(System.in);
        String cumle;
        char harf;
        
        System.out.println("Lütfen bir cümle giriniz");
        cumle = scan.nextLine(); 
        
        System.out.println("Lütfen saymak istediğiniz harfi giriniz");
        harf = scan.next().charAt(0); 
        
        int i, sayac = 0, uzunluk;
        uzunluk = cumle.length();
        
        for (i = 0; i < uzunluk; i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        
        System.out.println("'" + harf + "' harfi sayısı: " + sayac);
        
        
    }
}
