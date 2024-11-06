package Hari066;

public class Day66 {

    public static void main(String[] args) {
        System.out.println("=============Persegi=============");
        int sisi = 5;
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========Persegi Panjang==========");
        int panjang = 10;
        int lebar = 5;
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
