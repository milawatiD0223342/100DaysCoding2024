package Hari064;

public class Day64 {

    public static void main(String[] args) {
        int i = 2;
        loop:
        while (i < 10) {
            if (i == 6) {
                break loop;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
