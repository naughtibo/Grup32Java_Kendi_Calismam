package com.ozen.grup32java.ders4;

import java.util.Scanner;

public class ForDongusu {
    public void forDongusu() {
        for (int i = 0; i < 100; i++) {
            System.out.println("İndis :" + i);
        }
    }

    public void ciftSayilar() {
        for (int sayi = 0; sayi < 100; sayi++)
            if (sayi % 2 == 0)
                System.out.println("Çift Sayılar :" + sayi);
    }

    public void ucVeBesKatlari() {
        for (int i = 0; i < 100; i++)
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println("3 ve 5 in katları :" + i);
    }

    public void karekokBulma() {
        System.out.println("Bir Sayı Giriniz");
        Scanner scanner = new Scanner(System.in);
        int girilenDeger = scanner.nextInt();
        int toplam = 0;
        int tekSayi = 1;

        for (int i = 1; i < girilenDeger; i++) {

            toplam = tekSayi + toplam;
            if (toplam > girilenDeger) {
                System.out.println("Karekök " + (i - 1));
                break;
            }
            tekSayi = i + 2;
        }
    }

    public void asalSayiBulma() {
        System.out.println("Bir Sayı Giriniz");
        Scanner scanner = new Scanner(System.in);
        int girilenDeger = scanner.nextInt();
        boolean sayiAsal=false;
        for (int i = 2; i < girilenDeger; i++) {
            if (girilenDeger % i == 0){
                System.out.println("Asal Değildir");
                break;
            }

        }
        if(!sayiAsal)
            System.out.println("Sayı Asaldır");
    }

}
