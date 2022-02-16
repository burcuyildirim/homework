package com.burcuyildirim.vucutkitleendeksi;

import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[]args){
        double boy,vki;
        int kilo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz");
        boy=scanner.nextDouble();
        System.out.println("Kilonuzu giriniz");
        kilo=scanner.nextInt();
        vki=(kilo/boy)*boy;
        System.out.println("Vücut kitle endeksiniz: "+vki);
    }
}
