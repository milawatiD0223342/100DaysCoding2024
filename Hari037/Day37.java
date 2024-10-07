package Hari037;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        int angka1, angka2, hasil;

        Scanner input = new Scanner(System.in);

        System.out.print("Input angka ke 1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka ke 2: ");
        angka2 = input.nextInt();

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka ke 1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka ke 2: ");
        angka2 = input.nextInt();

        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);
    }
}
