package Hari069;

import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int a = sc.nextInt();
        System.out.print("Output: ");
        String b = (a > 0) ? "Bilangan ini positif" : ((a < 0) ? "Bilangan ini negatif" : "nol");
        System.out.println(b);
    }
}
