package com.maier.javacore.chapter03;

class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nint to byte.");
        b = (byte) i;
        System.out.println("i and b: " + i + ", " + b);

        System.out.println("\ndouble to int.");
        i = (int) d;
        System.out.println("d and i: " + d + ", " + i);

        System.out.println("\ndouble to byte.");
        b = (byte) d;
        System.out.println("d and b: " + d + ", " + b);
    }
}
