package uetoasis;

import java.util.Scanner;

public class uocso {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        int ucln = 0;
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            for (byte i = 1; i <= min; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    ucln = i;
                }
            }
        }
        return ucln;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
}
