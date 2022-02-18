package com.burcuyildirim.girisprogrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName,password,newpassword;
        int secim;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz");
        userName=scan.nextLine();
        System.out.println("Şifrenizi giriniz");
        password=scan.nextLine();
        if (userName.equals("Burcu")&& password.equals("patika123")){
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else {
            System.out.println("Kullanıcı adı veya şifre hatalı.Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet\n 2-Hayır");
            secim=scan.nextInt();
            switch (secim){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz");
                    newpassword=scan.nextLine();
                    if (newpassword.equals("patika123")){
                        System.out.println("Yeni şifreniz ve eski şifreniz aynı olamaz.Şifre oluşurulamadı.");
                    }
                    else {
                        System.out.println("Yeni şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Başarıyla çıkış yaptınız.");
                    break;
            }
        }

    }
}
