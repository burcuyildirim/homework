package com.burcuyildirim.atmprojesi;

import java.util.Scanner;

public class Proje2 {
    public static void main(String[]args){
        String userName,password;
        Scanner scanner=new Scanner(System.in);
        int right=3,select,balance=1500;
        while (right>0) {
            System.out.println("Kullanıcı adını giriniz");
            userName=scanner.nextLine();
            System.out.println("Şifrenizi giriniz");
            password=scanner.nextLine();
            if((userName.equals("patika"))&&(password.equals("dev123"))){
                System.out.println("Başarıyla giriş yaptınız.Patika Bankasına hoşgeldiniz");
                System.out.println("Yapmak istediğiniz işlemi seçiniz");
                System.out.println("1-Para yatırma\n"
                +"Para çekme\n"+"3-Bakiye sorgulama\n"+"4-Çıkış yap\n");
                select=scanner.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Yatırmak istediğiniz miktarı giriniz");
                        int price=scanner.nextInt();
                        balance+=price;
                        System.out.println("Yeni tutar: "+balance);
                        continue;
                    case 2:
                        System.out.println("Çekmek istediğiniz miktarı giriniz");
                        price=scanner.nextInt();
                        if(price>balance){
                            System.out.println("Hatalı tutar girdiniz");
                        }else {
                            balance-=price;
                            System.out.println("Yeni tutar: "+balance);
                        }
                        continue;
                    case 3:
                        System.out.println("Güncel bakiyeniz: "+balance);
                        continue;
                    case 4:
                        System.out.println("Başarıyla çıkış yaptınız");
                        break;
                }


            }
            else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı.Lütfen tekrar deneyin");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçin");
                }
                else {
                    System.out.println("Kalan hak: "+right);
                }
            }

        }
    }
}
