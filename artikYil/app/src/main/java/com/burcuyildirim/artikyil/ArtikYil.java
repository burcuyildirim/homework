package com.burcuyildirim.artikyil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){
        int yil;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        yil=scanner.nextInt();
        if(yil%4==0){
            System.out.println(yil+" artık bir yıldır");
        }
        else{
            System.out.println(yil+" artık bir yıl değildir");
        }

    }
}
