package Hari069;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu air: ");
        int suhu = sc.nextInt();
        System.out.print("Output: ");
        if (suhu <= 0) {
            System.out.print("Air membeku.");
        } else if (suhu > 0 && suhu <= 100) {
            System.out.print("Air dalam keadaan cair.");
        } else if (suhu > 100) {
            System.out.print("Air mendidih.");
        }
    }
}
