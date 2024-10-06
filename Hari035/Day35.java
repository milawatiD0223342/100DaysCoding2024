package Hari035;

public class Day35 {

    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;
        int hasil;
        System.out.println("CARA PERTAMA");
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);

        hasil = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + " = " + hasil);

        int x = 20;
        System.out.println("CARA KEDUA");

        x += 5; // sama dengan x = x + 5
        System.out.println("20 + 5 = " + x);

        x -= 3; // sama dengan x = x - 3
        System.out.println("25 - 3 = " + x);
    }
}
