package com.burcuyildirim.kombinasyon;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir faktöriyel sayısı giriniz:");
        int n = scanner.nextInt();
        int i=1;
        int total=1;
        while (i<=n){
           total=total*i;
            i++;
        }
        System.out.println(n+". faktöriyel değeri:"+total);

    }
}
