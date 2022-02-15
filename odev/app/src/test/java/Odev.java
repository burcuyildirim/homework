import java.util.Scanner;

public class Odev {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        Scanner scan=new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat=scan.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=scan.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=scan.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce=scan.nextInt();

        System.out.println("Tarih notunuz");
        tarih=scan.nextInt();

        System.out.println("Müzik notunuz:");
        muzik=scan.nextInt();

        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız:"+ortalama);

        boolean sonuc=ortalama>=50;
        String str=sonuc ? "Geçtiniz":"Kaldınız";
        System.out.println(str);


    }
}
