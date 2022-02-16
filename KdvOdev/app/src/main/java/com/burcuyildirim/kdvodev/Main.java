package com.burcuyildirim.kdvodev;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOrani,kdvTutari,kdvliFiyat;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz");
        tutar=scan.nextDouble();
        if(tutar>=0&&tutar<=1000){
           kdvOrani=0.18;
           kdvTutari=tutar*0.18;
           kdvliFiyat=tutar+kdvTutari;
            System.out.println("Ürün fiyatı:    "+tutar);
            System.out.println("KDV oranı:  "+kdvOrani );
            System.out.println("KDV tutarı:  "+kdvTutari );
            System.out.println("KDV'li fiyat:   "+kdvliFiyat);
        }
        else if (tutar>1000)
        {
            kdvOrani=0.8;
            kdvTutari=tutar*0.8;
            kdvliFiyat=tutar+kdvTutari;
            System.out.println("Ürün fiyatı:    "+tutar);
            System.out.println("KDV oranı:  "+kdvOrani );
            System.out.println("KDV tutarı:  "+kdvTutari );
            System.out.println("KDV'li fiyat:   "+kdvliFiyat);
        }



    }
}
