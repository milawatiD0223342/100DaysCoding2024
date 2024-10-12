package Hari041;

import java.util.Scanner;

public class Day41_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Input Jari-jari : ");
        int jariJari = sc.nextInt();
        System.out.print("Input satuan    : ");
        String satuan = sc.next();
        System.out.println("==========================HASIL==========================");

        double keliling = 2 * PI * jariJari;//gunakan rumus mencari keliling lingkaran (2*pi*r)untuk menghitung keliling lingkaran
        double luas = PI * jariJari * jariJari;//gunakan rumus mencari luas lingkaran (pi*r*r)untuk menghitung luas lingkaran

        System.out.println("Jari-jari       : " + jariJari + " " + satuan);
        System.out.println("Keliling        : " + keliling + " " + satuan);
        System.out.println("Luas            : " + luas + " " + satuan + "^2");
    }
}
