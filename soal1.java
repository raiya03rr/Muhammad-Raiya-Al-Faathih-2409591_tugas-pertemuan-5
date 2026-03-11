package com.mycompany.methodpbo;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai N: ");
        int n = input.nextInt();
        System.out.print("hasil penjumlahan deret: ");
        tampilDeret(n);
        input.close();
    }

    static int hitungDeret(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        return jumlah;
    }

    static void tampilDeret(int n) {
        String ekspresi = "";
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ekspresi += i;
            } else {
                ekspresi += "+" + i;
            }
        }
        System.out.println(ekspresi + "=" + hitungDeret(n));
    }

    
}