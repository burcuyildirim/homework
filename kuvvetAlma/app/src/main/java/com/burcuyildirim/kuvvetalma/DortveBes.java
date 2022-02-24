package com.burcuyildirim.kuvvetalma;

import java.util.Scanner;

public class DortveBes {
    public static void main(String[]args){
        int k;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        k=scanner.nextInt();
        for (int i=1;i<k;i*=4){
            System.out.println("Girdiğiniz sayıya kadar 4'ün kuvvetleri:"+i);
        }
        for (int l=1;l<k;l*=5){
            System.out.println("Girdiğiniz sayıya kadar 5'in kuvvetleri:"+l);
        }


    }
}
