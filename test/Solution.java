package test;

import java.util.Objects;

/**
 * The Solution class represents a fraction with a numerator and denominator.
 * It provides methods for arithmetic operations, reduction, and comparison.
 */
class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructs a Solution object with the given numerator and denominator.
     * Ensures the denominator is not zero.
     *
     * @param num the numerator
     * @param den the denominator
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

    /**
     * Gets the numerator.
     *
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Gets the denominator.
     *
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Sets the numerator and reduces the fraction.
     *
     * @param num the new numerator
     */
    public void setNumerator(int num) {
        this.numerator = num;
        reduce();
    }
    
    /**
     * Sets the denominator if it is not zero and reduces the fraction.
     *
     * @param den the new denominator
     */
    public void setDenominator(int den) {
        if (den != 0) {
            this.denominator = den;
            reduce();
        }
    }

    /**
     * Reduces the fraction to its simplest form.
     */
    private void reduce() {
        if (numerator == 0) {
            denominator = 1;
            return;
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {  // Ensure denominator is always positive
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    /**
     * Computes the greatest common divisor of two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the greatest common divisor
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Adds another fraction to this fraction.
     *
     * @param other the fraction to add
     * @return this fraction after addition
     */
    public Solution add(Solution other) {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    /**
     * Subtracts another fraction from this fraction.
     *
     * @param other the fraction to subtract
     * @return this fraction after subtraction
     */
    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    /**
     * Multiplies this fraction by another fraction.
     *
     * @param other the fraction to multiply with
     * @return this fraction after multiplication
     */
    public Solution multiply(Solution other) {
        numerator *= other.numerator;
        denominator *= other.denominator;
        reduce();
        return this;
    }

    /**
     * Divides this fraction by another fraction.
     *
     * @param other the fraction to divide by
     * @return this fraction after division
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            numerator *= other.denominator;
            denominator *= other.numerator;
            reduce();
        }
        return this;
    }

    /**
     * Checks if this fraction is equal to another object.
     *
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Solution)) {
            return false;
        }
        Solution other = (Solution) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    /**
     * Computes the hash code of this fraction.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    /**
     * Returns a string representation of this fraction.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * Main method for testing the Solution class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        
    }
}
