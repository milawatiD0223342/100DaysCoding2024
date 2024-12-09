package Hari098;

import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

        int start = Math.min(x, y);
        int end = Math.max(x, y);

        int total = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
            System.out.println("Total penjumlahan bilangan genap dari " + start + " ke " + end + " adalah: " + total);

            scanner.close();
        
    }
}