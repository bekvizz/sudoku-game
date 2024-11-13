package com.bekvizz.sudokugame;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Matrices mx = new Matrices(5,3);
        mx.fillMatrix(0);
        System.out.println(mx);
        System.out.println(Arrays.toString(mx.getRow(3)));
        System.out.println(Arrays.toString(mx.getRow(1)));
        System.out.println();
        System.out.println(Arrays.toString(mx.getColumn(2)));
        System.out.println(Arrays.toString(mx.getColumn(3)));
    }
}
