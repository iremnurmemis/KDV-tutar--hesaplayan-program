package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kdvsiz_fiyat;
        double kdvli_fiyat,kdvorani=0.18,kdvtutari;
        System.out.print("kdvsiz fiyatı giriniz:");
        kdvsiz_fiyat=inp.nextInt();

        kdvtutari=(kdvsiz_fiyat * kdvorani);
        kdvli_fiyat=kdvsiz_fiyat+kdvtutari;

        System.out.print("kdvsizfiyat:"+kdvsiz_fiyat);
        System.out.print("\nkdv oranı:"+kdvorani);
        System.out.print("\nkdv tutarı:"+kdvtutari);
        System.out.print("\nkdvli fiyat:"+kdvli_fiyat);

    }
}
