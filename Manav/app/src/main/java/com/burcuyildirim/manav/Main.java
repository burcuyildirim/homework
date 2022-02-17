package com.burcuyildirim.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlıcanf=5.00,tutar;
        int armutk,elmak,domatesk,muzk,patlıcank;
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç kilo armut aldığınızı giriniz.");
        armutk=scan.nextInt();
        System.out.println("Kaç kilo elma aldığınızı giriniz.");
        elmak=scan.nextInt();
        System.out.println("Kaç kilo domates aldığınızı giriniz.");
        domatesk=scan.nextInt();
        System.out.println("Kaç kilo muz aldığınızı giriniz");
        muzk=scan.nextInt();
        System.out.println("Kaç kilo patlıcan aldığınızı giriniz.");
        patlıcank=scan.nextInt();
        tutar=(armutf*armutk)+(elmaf*elmak)+(domatesf*domatesk)+(muzf*muzk)+(patlıcanf*patlıcank);
        System.out.println("Toplam tutar:   "+tutar);
    }
}
