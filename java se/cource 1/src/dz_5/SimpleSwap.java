package dz_5;

public class SimpleSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
       /* a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("b = " + b + "\na = " + a);*/

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
