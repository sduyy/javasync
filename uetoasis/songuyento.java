package uetoasis;

import java.util.Scanner;

public class songuyento {
    /* */
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n <= 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
            }
        }
        return check;
    }
    /* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
