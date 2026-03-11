package com.mycompany.methodpbo;

import java.util.Scanner;

public class soal3 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai n: ");
        int n = input.nextInt();
        tampilFaktorial(n);
        input.close();
    }

    static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }

    static void tampilFaktorial(int n) {
        String ekspresi = n + "!=";
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                ekspresi += i;
            } else {
                ekspresi += i + "*";
            }
        }
        ekspresi += "=" + hitungFaktorial(n);
        System.out.println(ekspresi);
    }
}