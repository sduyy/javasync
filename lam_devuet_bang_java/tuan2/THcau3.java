package lam_devuet_bang_java.tuan2;

import java.util.Scanner;

public class THcau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (Character.isUpperCase(c)) {
            char upper = Character.toLowerCase(c);
            System.out.println(upper);
        } else {
            char lower = Character.toLowerCase(c);
            System.out.println(lower);
        }
        sc.close();
    }
}
