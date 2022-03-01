package com.burcuyildirim.uslusayi;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[]args){
        int n,k;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz");
        n=scanner.nextInt();
        System.out.println("Üs olacak sayıyı giriniz");
        k=scanner.nextInt();
        int total=1;
      for(int i=1;i<=k;i++){
          total*=n;
      }
        System.out.println("Cevap:"+total);
    }
}
