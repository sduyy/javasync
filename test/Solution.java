package test;

import java.util.Objects;

class Solution {
    private int numerator;
    private int denominator;

    /**
     * This is construtor.
     * @param num
     * @param den
     */
    public Solution(int num, int den) {
        if (den == 0) {
            numerator = 0;
            denominator = 1;
        } else {
            this.numerator = num;
            this.denominator = den;
            reduce();
        }
    }

    // Getter methods
    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }

    // Setter methods
    public void setNumerator(int num) {
        this.numerator = num;
        reduce();
    }
    
    public void setDenominator(int den) {
        if (den != 0) {
            this.denominator = den;
            reduce();
        }
    }

    // Reduce fraction
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {  // Ensure denominator is always positive
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Addition
    public Solution add(Solution other) {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    // Subtraction
    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    // Multiplication
    public Solution multiply(Solution other) {
        numerator *= other.numerator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    // Division
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            numerator *= other.denominator;
            denominator *= other.numerator;
            reduce();
        }
        return this;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Solution)) return false;
        Solution other = (Solution) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        
    }
}
