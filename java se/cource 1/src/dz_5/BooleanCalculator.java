package dz_5;

import java.util.Scanner;

public class BooleanCalculator {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > 0 or b > 0: " + (a > 0 || b > 0));
        System.out.println("a > 0 and not (b > 0): " + (a > 0 && !(b > 0)));
    }
}
