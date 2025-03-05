package uetoasis.tuan2;

public class PhanSo {
    private int numerator;
    private int denominator;

    private int getNumerator() {
        return numerator;
    }

    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    private void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.denominator = denominator;
    }
    public static void main(String[] args) {
        
    }
}
