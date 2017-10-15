package dz_5;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a./b=" + ((double) a) / b);
        System.out.println("a%b=" + (a % b));
        System.out.println("a^b=" + Math.pow(a, b));
        System.out.println("min=" + Math.min(a, b));
        System.out.println("max=" + Math.max(a, b));
    }
}
