package Hari069;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;

        System.out.print("Masukkan angka: ");
        for (int i = 0; i < n; i++) {
            int angka = input.nextInt();
            if (angka > max) {
                max = angka;
            }
        }
        System.out.println("Nilai terbesar adalah: " + max);
    }
}
