package com.ozen.grup32java.ders4;

import java.util.Scanner;

public class Ders4 {
    public  void ifelse(int yas){


        if (yas > 0 && yas < 12) {
            System.out.println("Çocuksunuz");
        }else if (yas > 11 && yas < 20) {

            System.out.println("Gençsiniz");
        }else if (yas > 19 && yas < 40) {

            System.out.println("Orta Yaş Grubundasınız");
        } else if (yas > 19 && yas < 40) {

            System.out.println("Orta Yaş Grubundasınız");
        }else if (yas > 39 && yas < 99) {

            System.out.println("Orta-Üst Yaş Grubundasınız");
        }else  {
            System.out.println("Çok Yaşlısınız");
        }

    }
}
