package lam_devuet_bang_java.tuan1.NH;

import java.util.Scanner;

public class NHCau2 {
    public static int volume(int a, int b, int h) {
        return a * b * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
        System.out.println(volume(a, b, h));
        sc.close();
    }
}
