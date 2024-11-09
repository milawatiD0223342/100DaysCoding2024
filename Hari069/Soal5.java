package Hari069;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int a = sc.nextInt();
        System.out.print("Output: ");
        switch (a) {
            case 1:
                System.out.print("Hari kesatu adalah Senin");
                break;
            case 2:
                System.out.print("Hari kedua adalah Selasa");
                break;
            case 3:
                System.out.print("Hari ketiga adalah Rabu");
                break;
            case 4:
                System.out.print("Hari keempat adalah Kamis");
                break;
            case 5:
                System.out.print("Hari kelima adalah Jumat");
                break;
            case 6:
                System.out.print("Hari keenam adalah Sabtu");
                break;
            case 7:
                System.out.print("Hari ketujuh adalah Minggu");
                break;
            default:
                System.out.print("Input ketidak valid");
        }
    }
}
