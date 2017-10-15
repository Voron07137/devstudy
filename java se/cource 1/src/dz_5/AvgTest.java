package dz_5;

import java.util.Scanner;

public class AvgTest {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Avg=" + (a + b) / 2);
    }
}
