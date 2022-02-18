package com.burcuyildirim.etkinlikprogrami;

import java.util.Scanner;

public class Min {
    public static void main(String[] args){
        int sicaklik;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz");
        sicaklik=scanner.nextInt();
        if (sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(sicaklik>5||sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(sicaklik>15|| sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
