package com.ozen.grup32java.ders4;

import java.util.Scanner;

public class KullaniciIslemleri {

    public void kullaniciGirisi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz");
        String kullaniciAdi = scanner.nextLine();

        if (kullaniciAdi.equals("admin")) {
            System.out.println("Şifrenizi Giriniz");
            Scanner scanner1 = new Scanner(System.in);
            String sifre = scanner1.nextLine();
            if (sifre.equals("admin"))
                adminIslemleri();
            else
                System.out.println("Şifrenizi Yanlış Girdiniz");
        } else if (kullaniciAdi.equals("user")) {
            System.out.println("Şifrenizi Giriniz");
            Scanner scanner2 = new Scanner(System.in);
            String sifre = scanner2.nextLine();
            if (sifre.equals("user"))
                userIslemleri();
            else
                System.out.println("Şifrenizi Yanlış Girdiniz");

        } else
            System.out.println("Kullanıcı Adını Yanlış Girdiniz");

    }

    private void userIslemleri() {
        System.out.println("1-  Toplama işlemi İçin 1 e basınız");
        System.out.println("2-  Çıkarma işlemi İçin 2 ye basınız");
        Scanner scanner3 = new Scanner(System.in);
        int secim = scanner3.nextInt();
        //aritmetikIslemlerUser(secim);
        if (secim == 1)
            aritmetikHesaplar(1);
        else if (secim == 2)
            aritmetikHesaplar(2);
        else
            System.out.println("Hatalı Seçim!!");
    }


    private void adminIslemleri() {
        System.out.println("1-  Toplama işlemi İçin 1 e basınız");
        System.out.println("2-  Çıkarma işlemi İçin 2 ye basınız");
        System.out.println("3-  Çarpma işlemi İçin 3 e basınız");
        System.out.println("4-  Bölme işlemi İçin 4 e basınız");
        System.out.println("5-  Karekök işlemi İçin 5 e basınız");
        Scanner scanner4 = new Scanner(System.in);
        int secim = scanner4.nextInt();
        //aritmetikIslemlerAdmin(secim);
        if (secim == 5) {
            ForDongusu forDongusu = new ForDongusu();
            forDongusu.karekokBulma();
        } else if (secim == 2)
            aritmetikHesaplar(secim);
        else if (secim == 3)
            aritmetikHesaplar(secim);
        else if (secim == 4)
            aritmetikHesaplar(secim);
        else
            System.out.println("Hatalı Seçim!!");
    }

    private void aritmetikIslemlerUser(int tercih) {
        System.out.println("1. Sayıyı Giriniz");
        Scanner scanner5 = new Scanner(System.in);
        int sayi1 = scanner5.nextInt();
        System.out.println("2. Sayıyı Giriniz");
        Scanner scanner6 = new Scanner(System.in);
        int sayi2 = scanner6.nextInt();

        if (tercih == 1)
            System.out.println("Sayıların Toplamı :" + (sayi1 + sayi2));
        else if (tercih == 2)
            System.out.println("Sayıların Farkı :" + (sayi1 - sayi2));
        else
            System.out.println("Yanlış Tercih Yaptınız");
    }

    private void aritmetikIslemlerAdmin(int islemNo) {
        System.out.println("1. Sayıyı Giriniz");
        Scanner scanner5 = new Scanner(System.in);
        int sayi1 = scanner5.nextInt();
        System.out.println("2. Sayıyı Giriniz");
        Scanner scanner6 = new Scanner(System.in);
        int sayi2 = scanner6.nextInt();

        if (islemNo == 1)
            System.out.println("Sayıların Toplamı :" + (sayi1 + sayi2));
        else if (islemNo == 2)
            System.out.println("Sayıların Farkı :" + (sayi1 - sayi2));
        else if (islemNo == 3)
            System.out.println("Sayıların Çarpımı :" + (sayi1 * sayi2));
        else if (islemNo == 4)
            System.out.println("Sayıların Bölümü :" + (sayi1 / sayi2));
        else if (islemNo == 5) {
            ForDongusu forDongusu = new ForDongusu();
            forDongusu.karekokBulma();
        } else
            System.out.println("Yanlış Tercih Yaptınız");
    }

    private void aritmetikHesaplar(int no) {
        System.out.println("1. Sayıyı Giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz");
        Scanner scanner2 = new Scanner(System.in);
        int sayi2 = scanner.nextInt();

        if (no == 1)
            System.out.println("Sayıların Toplamı  :" + (sayi1 + sayi2));
        else if (no == 2)
            System.out.println("Sayıların Farkı  :" + (sayi1 - sayi2));
        else if (no == 3)
            System.out.println("Sayıların Çarpımı  :" + (sayi1 * sayi2));
        else if (no == 4)
            System.out.println("Sayıların Bölümü  :" + (sayi1 / sayi2));


    }
}

