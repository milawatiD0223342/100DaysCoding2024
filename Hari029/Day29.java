package Hari029;

import java.math.BigInteger;

public class Day29 {
    public static void main(String[] args) {
         BigInteger a = new BigInteger("2024");
        BigInteger b = new BigInteger("2025");
        BigInteger tambah = a.add(b);
        BigInteger kali = a.multiply(b);
        System.out.println(tambah);
        System.out.println(kali);
    }
}
