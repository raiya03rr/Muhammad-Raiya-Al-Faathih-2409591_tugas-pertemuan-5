package com.mycompany.methodpbo;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input batas awal : ");
        int batasAwal = input.nextInt();
        System.out.print("input batas akhir: ");
        int batasAkhir = input.nextInt();
        tampilBanyakGanjil(batasAwal, batasAkhir);
        input.close();
    }

    static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }

    static void tampilBanyakGanjil(int batasAwal, int batasAkhir) {
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isGanjil(i)) {
                count++;
            }
        }
        System.out.println("banyaknya bilangan ganjil antara "
                + batasAwal + " dan " + batasAkhir + " adalah " + count);
    }
}