package uetoasis;

public class phanso {
    private int numerator;
    private int denominator;

    public phanso() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("error");
        }
        this.denominator = denominator;
    }

    public phanso(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }
    public static void main(String[] args) {
        
    }
}
