package lam_devuet_bang_java.tuan1.NH;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NHCau5 {
    public static void passRate(double a, double b) {
        DecimalFormat df = new DecimalFormat("0.00");
        double rate = b / a;
        System.out.println(df.format(rate));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        passRate(a, b);
        sc.close();
    }
}
