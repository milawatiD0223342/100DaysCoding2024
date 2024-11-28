package Hari088;

import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("x = ");
        int a = sc.nextInt();
        System.out.print("y = ");
        int b = sc.nextInt();
        System.out.print("z = ");
        int c = sc.nextInt();
        System.out.println("Output:");
        int[] angka = {0, 0, 30};
        angka[0] += a;
        angka[1] += b;
        angka[2] += c;
        System.out.println("x = " + angka[0]);
        System.out.println("y = " + angka[1]);
        System.out.println("z = " + angka[2]);
    }
}
