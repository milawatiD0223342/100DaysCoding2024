package Hari100;

import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        LocalTime waktuSaatIni = LocalTime.now();

        String beriSalam;
        if (waktuSaatIni.isBefore(LocalTime.NOON)) {
            beriSalam = "Selamat pagi";
        } else if (waktuSaatIni.isBefore(LocalTime.of(17, 0))) {
            beriSalam = "Selamat siang";
        } else {
            beriSalam = "Selamat malam";
        }

        System.out.println("===================================");
        System.out.println(beriSalam + ", " + nama);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");

    }
}
