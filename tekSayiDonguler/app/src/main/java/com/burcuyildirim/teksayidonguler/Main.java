package com.burcuyildirim.teksayidonguler;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       int k=0,toplam=0;
       Scanner scanner=new Scanner(System.in);
       do {
           System.out.println("Bir sayı giriniz");
           k=scanner.nextInt();
           if((k%2==0)&&(k%4==0)){
               toplam+=k;
           }

       }while (k%2==0);{

            System.out.println("Girdiğiniz 2 ve 4'ün katı sayıların toplamı: "+toplam);
        }
    }
}
