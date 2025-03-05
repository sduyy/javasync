package uetoasis.tuan2;

import java.util.Scanner;

public class Fibonacci {
    /** Calculate fibonacci number. */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long next = 0;
            for (int i = 2; i <= n; i++) {
                if (b > Long.MAX_VALUE - a) {
                    return Long.MAX_VALUE;
                }
                next = a + b;
                a = b;
                b = next;
            }
            return b;
        }
    }

    /** Main method to read input and calculate fibonacci number. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
