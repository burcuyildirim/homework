package com.burcuyildirim.ucgenalanodevi;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args){
        int a,b,c;
        double u,alan;

        Scanner scan=new Scanner(System.in);
        System.out.println("A kenarının uzunluğunu giriniz" );
        a=scan.nextInt();
        System.out.println("B kenarının uzunluğunu giriniz");
        b=scan.nextInt();
        System.out.println("C kenarının uzunluğunu giriniz");
        c=scan.nextInt();
        u=(a+b+c)/2;

        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı:  "+alan);


    }
}
