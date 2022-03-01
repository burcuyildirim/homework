package com.burcuyildirim.kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[]args){
/*
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("n sayısını giriniz");
        int n=scanner.nextInt();
        System.out.println("r sayısını giriniz");
        int r=scanner.nextInt();
        int total=1,total2=1,kombinasyon;
        for (int i=1;i<=n;i++){
            total=total*i;
        }
        for (int l=1;l<=r;l++){
            total2=total2*l;
        }

        kombinasyon=total/(total2*(n-r));
        System.out.println("Kombinasyon:"+kombinasyon);
    }
}
