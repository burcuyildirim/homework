package com.burcuyildirim.atmprojesi;

import java.util.Scanner;

public class Proje1 {
    public static void main(String[]args){
        String kAdi,sifre;
        Scanner scanner=new Scanner(System.in);
        int right=3,balance=1500,select;
        while(right>0){
            System.out.print("Kullanıcı adını giriniz");
            kAdi=scanner.nextLine();
            System.out.print("Şifre giriniz");
            sifre=scanner.nextLine();
            if((kAdi.equals("patika"))&&(sifre.equals("dev123"))){
                System.out.println("Sisteme giriş yaptınız");
                System.out.print("Patika bankasına hoşgeldiniz");
                do {
                    System.out.print("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.print("1-Para yatırma\n"+
                            "2-Para çekme\n"+
                            "3-Bakiye sorgula\n"+
                            "4-Çıkış yap\n");
                    select=scanner.nextInt();
                    if(select==1){
                        System.out.println("Yatıracağınız para miktarını giriniz");
                        int price=scanner.nextInt();
                        balance+=price;
                        System.out.println("Güncel tutar:"+balance);
                    }
                    else if(select==2){
                        System.out.println("Çekmek istediğiniz miktarı giriniz");
                        int price=scanner.nextInt();
                        if(price>balance){
                            System.out.println("Geçersiz tutar girdiniz");
                        }
                        else {
                            balance-=price;
                            System.out.println("Güncel tutar ="+balance);
                        }
                    }
                    else if(select==3){
                        System.out.println("Güncel tutar:"+balance);
                    }

                }while(select!=4);
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz");
                }
                else {

                    System.out.println("Tekrar deneyiniz.Kalan hak:" + right);
                }
            }

        }
    }
}
