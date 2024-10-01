package Hari030;

import java.math.BigDecimal;

public class Day30 {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("125.555");
        BigDecimal b = new BigDecimal("146.865");
        System.out.println(a.add(b));
        System.out.println(b.multiply(a));
        /*
        disini sya membuat codingan dgn tipe data BigDecimalmenggunakan 2 method. Method add() untuk
        menjumlahkan variabel a dgn b dan outputnya 272.420.Method multiply() untuk mengalikan variabel
        a dgn b dan outputnya 18439.635075
         */
    }
}
