package pl.camp.it.test;

import java.sql.SQLOutput;

public class MainGra {
    public static void main(String[] args) {
        String haslo = "2345";
        int iloscStrzalow = 5;
        String[] strzaly = new String[iloscStrzalow];
        strzaly[0] = "9871";
        strzaly[1] = "7645";
        strzaly[2] = "3284";
        strzaly[3] = "4539";
        strzaly[4] = "2345";

        gra(haslo,strzaly);
    }

    public static void gra(String haslo, String[] strzaly){

        for (int h = 0; h <strzaly.length;h++ ){
            int poma = 0;
            int pomb = 0;

        for (int i = 0; i < strzaly[h].length(); i++){

             if (haslo.charAt(i) == strzaly[h].charAt(i))poma++;
             if (haslo.charAt(i) == strzaly[h].charAt(0) |
                     haslo.charAt(i) == strzaly[h].charAt(1) |
                     haslo.charAt(i) == strzaly[h].charAt(2) |
                     haslo.charAt(i) == strzaly[h].charAt(3) )  {
                 pomb++;
             }

        }
        System.out.println(poma + "-" +( pomb - poma ));
    }

    }


}
