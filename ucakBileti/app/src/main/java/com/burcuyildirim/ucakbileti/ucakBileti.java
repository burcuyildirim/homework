package com.burcuyildirim.ucakbileti;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        int km,yas,yolculukTipi;
        double mesafeUcreti=0.10,indirimsizFiyat,yasIndirimi,tipIndirimi,indirimliFiyat;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç km gideceğinizi giriniz");
        km=scanner.nextInt();
        System.out.println("Yaşınızı giriniz");
        yas=scanner.nextInt();
        System.out.println("Yolculuk tipinizi seçiniz.1-Tek gidiş\n 2-Gidiş-Dönüş\n");
        yolculukTipi=scanner.nextInt();
        indirimsizFiyat=(km)*(mesafeUcreti);
        System.out.println("İndirimsiz bilet fiyatınız:"+indirimsizFiyat);
        if((yas>=0)&&(km>0)){
            if((yas<12)&&(yas>=0)||(yolculukTipi)==1){
                yasIndirimi=(indirimsizFiyat)*(0.5);
                indirimliFiyat=(indirimsizFiyat)-(yasIndirimi);
                System.out.println("İndirimli bilet fiyatınız:"+indirimliFiyat);
            }
            else if ((yas<12)&&(yas>=0)||(yolculukTipi)==2){
                yasIndirimi=(indirimsizFiyat)*(0.5);
                indirimliFiyat=(indirimsizFiyat)-(yasIndirimi);
                tipIndirimi=(indirimliFiyat)*(0.2);
                System.out.println("İndirimli bilet fiyatınız:"+tipIndirimi);
            }
            else if((yas>=12)&&(yas<24)||(yolculukTipi)==1){
                yasIndirimi=(indirimsizFiyat)*(0.1);
                indirimliFiyat=(indirimsizFiyat)-yasIndirimi;
                System.out.println("İndirimli bilet fiyatınız:"+indirimliFiyat);
            }
            else if((yas>=12)&&(yas<24)||(yolculukTipi)==2){
                yasIndirimi=(indirimsizFiyat)*(0.1);
                indirimliFiyat=(indirimsizFiyat)-(yasIndirimi);
                tipIndirimi=(indirimliFiyat)*(0.2);
                System.out.println("İndirimli bilet fiyatınız:"+tipIndirimi);
            }
            else if((yas>=24)&&(yas<65)||(yolculukTipi)==1){

                System.out.println("Biletinize indirim yoktur"+indirimsizFiyat);
            }
            else if ((yas>=24)&&(yas<65)||(yolculukTipi)==2){
                tipIndirimi=indirimsizFiyat*(0.2);
                System.out.println("İndirimli bilet fiyatınız:"+tipIndirimi);
            }
            else if ((yas>=65)||(yolculukTipi)==1){
                yasIndirimi=(indirimsizFiyat)*(0.3);
                indirimliFiyat=indirimsizFiyat-yasIndirimi;
                System.out.println("İndirimli bilet fiyatınız:"+indirimliFiyat);
            }
            else if((yas>65)||(yolculukTipi)==2){
                yasIndirimi=(indirimsizFiyat)*(0.3);
                indirimliFiyat=indirimsizFiyat-yasIndirimi;
                tipIndirimi=(indirimliFiyat)*(0.2);
                System.out.println("İndirimli bilet fiyatınız:"+tipIndirimi);
            }
        }
        else {
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}
