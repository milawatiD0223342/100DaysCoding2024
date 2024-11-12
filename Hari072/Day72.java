package Hari072;

public class Day72 {

    public static int rekursifMethod(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * rekursifMethod(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int hasil = rekursifMethod(n);
        System.out.println(hasil);
    }
}
