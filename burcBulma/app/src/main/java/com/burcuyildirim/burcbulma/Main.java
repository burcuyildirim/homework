package com.burcuyildirim.burcbulma;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        int day,month;
        boolean isError=false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğduğunuz günü giriniz");
        day=scanner.nextInt();
        System.out.println("Doğduğunuz ayı giriniz");
        month=scanner.nextInt();
        if(month==1){
            if((day>=1)&&(day<22)){
                System.out.println("Burcunuz oğlaktır");
            }else if((day>=22)&&(day<31)){
                System.out.println("Burcunuz kovadır");
            }
            else {
                isError=true;
            }
        }else if(month==2){
            if((day>=1)&&(day<=19)){
                System.out.println("Burcunuz kovadır");
            }else if ((day>19)&&(day<=28)){
                System.out.println("Burcunuz balıktır");
            }
            else {
                isError=true;
            }
        }else if(month==3){
            if((day>=1)&&(day<=20)){
                System.out.println("Burcunuz balıktır");
            }else if ((day>20)&&(day<=31)){
                System.out.println("Burcunuz koçtur");
            }else {
                isError=true;
            }
        }else if(month==4){
            if((day>=1)&&(day<=20)){
                System.out.println("Burcunuz koçtur");
            }else if((day>20)&&(day<=31)){
                System.out.println("Burcunuz boğadır");
            }else {
                isError=true;
            }
        }else if(month==5){
            if((day>=1)&&(day<=21)){
                System.out.println("Burcunuz boğadır");
            }else if((day>21)&&(day<=31)){
                System.out.println("Burcunuz ikizlerdir");
            }
            else {
                isError=true;
            }
        }else if (month==6){
            if((day>=1)&&(day<=22)){
                System.out.println("Burcunuz ikizlerdir");
            }else if((day>22)&&(day<=31)){
                System.out.println("Burcunuz yengeçtir");
            }else {
                isError=true;
            }
        }else if(month==7){
            if((day>=1)&&(day<=22)){
                System.out.println("Burcunuz yengeçtir");
            }else if((day>22)&&(day<=31)){
                System.out.println("Burcunuz aslandır");
            }
            else {
                isError=true;
            }
        }else if (month==8){
            if((day>=1)&&(day<=22)){
                System.out.println("Burcunuz aslandır");
            }else if((day>22)&&(day<=31)){
                System.out.println("Burcunuz başaktır");
            }else {
                isError=true;
            }
        }else if(month==9){
            if((day>=1)&&(day<=21)){
                System.out.println("Burcunuz başaktır");
            }else if((day>22)&&(day<=31)){
                System.out.println("Burcunuz terazidir.");
            }
            else {
                isError=true;
            }
        }else if(month==10){
            if((day>=1)&&(day<=22)){
                System.out.println("Burcunuz terazidir");
            }else if((day>22)&&(day<=31)){
                System.out.println("Burcunuz akreptir");
            }else {
                isError=true;
            }
        }else if(month==11){
            if((day>=1)&&(day<=21)){
                System.out.println("Burcunuz akreptir");
            }else if((day>21)&&(day<=31)){
                System.out.println("Burcunuz yaydır");
            }else {
                isError=true;
            }
        }else if(month==12){
            if((day>=1)&&(day<=21)){
                System.out.println("Burcunuz yaydır");
            }else if ((day>21)&&(day<=31)){
                System.out.println("Burcunuz oğlaktır");
            }

        }
        if(isError==true){
            System.out.println("Hatalı bir tarih girdiniz");
        }

    }
}
