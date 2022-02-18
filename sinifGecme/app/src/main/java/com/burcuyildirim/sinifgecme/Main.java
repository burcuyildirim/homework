package com.burcuyildirim.sinifgecme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int mat,fizik,kimya,muzik,turkce;
       double ortalama;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik notunu giriniz");
        mat=scanner.nextInt();
        System.out.println("Fizik notunu giriniz");
        fizik=scanner.nextInt();
        System.out.println("Kimya notunu giriniz");
        kimya=scanner.nextInt();
        System.out.println("Müzik notunu giriniz");
        muzik=scanner.nextInt();
        System.out.println("Türkçe notunu giriniz");
        turkce=scanner.nextInt();
        ortalama=(mat+fizik+kimya+muzik+turkce)/5;
        if(ortalama>=55){
            System.out.println("Sınıfı geçtiniz");
        }
        else {
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println("Ortalamanız:    "+ortalama);
    }
}
