package com.ozen.grup32java.ders4;

import java.util.Scanner;

public class KullaniciIslemleri {

    public void kullaniciGirisi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz");
        String kullaniciAdi = scanner.nextLine();
        if (kullaniciAdi.equals("admin")) {
            System.out.println("Şifrenizi Giriniz");
            Scanner giris = new Scanner(System.in);
            String sifre = scanner.nextLine();
            if (sifre.equals("admin")) {
                adminIslemleri();
            }

        }
    }

    private void adminIslemleri() {
    }

}
