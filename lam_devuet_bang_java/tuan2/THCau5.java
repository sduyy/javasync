package lam_devuet_bang_java.tuan2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class THCau5 {
    public static double average(double a, double b, double c, double d, double e, double f) {
        double avg = ((a + b + c) + d * 2 + e * 2 + f * 3)/10;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(),
               d = sc.nextDouble(), e = sc.nextDouble(),
               f = sc.nextDouble();
        System.out.println(df.format(average(a, b, c, d, e, f)));
        sc.close();
    }
}
