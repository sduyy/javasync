package lam_devuet_bang_java.tuan1.NH;

import java.util.Scanner;

public class NHCau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int n = a / b, d = a % b;
        System.out.println(n + " " + d);
        sc.close();
    }
}
