package com.burcuyildirim.dairealan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int r;
        double alan,a,pi=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.println("Yarıçapı giriniz.");
        r=scan.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz.");
        a=scan.nextDouble();
        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı:  "+alan);

    }
}
