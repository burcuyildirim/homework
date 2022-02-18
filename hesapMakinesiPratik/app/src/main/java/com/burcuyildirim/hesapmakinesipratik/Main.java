package com.burcuyildirim.hesapmakinesipratik;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int sayi1,sayi2,islem,sonuc;
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        sayi1=scan.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        sayi2=scan.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz.");
        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        islem=scan.nextInt();
        switch (islem){
            case 1:
                sonuc=sayi1+sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println(sonuc);
                break;
        }
    }
}
