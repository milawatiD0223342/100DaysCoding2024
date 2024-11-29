package Hari089;

import java.util.Scanner;

public class Day89 {

    int[] angka = new int[3];

    public Day89(int a, int b, int c) {
        angka[0] = a;
        angka[1] = b;
        angka[2] = c;
    }

    public void kiri(int e) {
        angka[0] -= e;
    }

    public void mundur(int e) {
        angka[1] -= e;
    }

    public void turun(int e) {
        angka[2] -= e;
    }

    public void kanan(int e) {
        angka[0] += e;
    }

    public void maju(int e) {
        angka[1] += e;
    }

    public void naik(int e) {
        angka[2] += e;
    }

    public void hasil() {
        System.out.println("Posisi pesawat di " + angka[0] + ", " + angka[1] + ", " + angka[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("Nilai Awal: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Day89 h = new Day89(a, b, c);

        for (int i = 0; i < 3; i++) {
            String pesawat = sc.next();
            String d = sc.next();
            int nilai = sc.nextInt();

            if (pesawat.equalsIgnoreCase("x")) {
                if (d.equalsIgnoreCase("kiri")) {
                    h.kiri(nilai);
                } else if (d.equalsIgnoreCase("kanan")) {
                    h.kanan(nilai);
                }
            } else if (pesawat.equalsIgnoreCase("y")) {
                if (d.equalsIgnoreCase("maju")) {
                    h.maju(nilai);
                } else if (d.equalsIgnoreCase("mundur")) {
                    h.mundur(nilai);
                }
            } else if (pesawat.equalsIgnoreCase("z")) {
                if (d.equalsIgnoreCase("naik")) {
                    h.naik(nilai);
                } else if (d.equalsIgnoreCase("turun")) {
                    h.turun(nilai);
                }
            }
        }

        System.out.println("Output:");
        System.out.println("x = " + h.angka[0]);
        System.out.println("y = " + h.angka[1]);
        System.out.println("z = " + h.angka[2]);
        h.hasil();

        sc.close();
    }
}
