package com.burcuyildirim.kuvvetalma;

import java.util.Scanner;

public class IkininUssu {
    public static void main(String[]args){
        int k,kare;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        k=scanner.nextInt();
        for (int i=1;i<k;i++){
            kare=i*i;
            System.out.println(i+"'nin karesi:"+kare);
        }

    }
}
