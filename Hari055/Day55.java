package Hari055;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilihan Ari: ");
        String lk1 = sc.nextLine();

        System.out.print("Pilihan Bayu: ");
        String lk2 = sc.nextLine();

        System.out.print("Pilihan Ciko: ");
        String lk3 = sc.nextLine();

        if (lk2.equals(lk1) || lk3.equals(lk1)) {
            System.out.println("BATAL");
        } else {
            if (lk2.equals(lk3)) {
                System.out.println("Ari :: " + lk1);
                System.out.println("Bayu :: " + lk2);
                System.out.println("Ciko :: " + lk3);
            } else {
                System.out.println("Ari :: " + lk1);
                System.out.println("Bayu :: " + lk2);
                System.out.println("Ciko :: " + lk3);
            }
        }
    }
}
