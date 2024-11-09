package Hari069;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Output: ");
        if (a < 0 || b < 0) {
            System.out.print("Salah satu bilangan bernilai negatif");
        } else if (a < 0 && b < 0) {
            System.out.print("Kedua bilangan bernilai negatif");
        } else {
            System.out.print("Kedua bilangan bernilai positif");
        }
    }
}
