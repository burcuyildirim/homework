package com.burcuyildirim.ortalamadonguler;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int k,deger=-1,toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        k=scanner.nextInt();
        for(int i=0;i<k;i++){
            if ((i%3==0)&&(i%4==0)){
                toplam+=i;
                deger++;

            }
        }
        double ortalama=toplam/deger;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+ortalama);


    }
}
