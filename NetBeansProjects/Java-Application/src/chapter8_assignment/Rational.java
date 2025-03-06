
package chapter8_assignment;

public class Rational {
    private int numerator;
    private int denominator;

    // No-argument constructor with default values
    public Rational() {
        this(0, 1);
    }

    // Constructor that enables an object of this class to be initialized when it's declared
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // Method to calculate the greatest common divisor (GCD) of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Static method to add two Rational numbers
    public static Rational add(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Static method to subtract two Rational numbers
    public static Rational subtract(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Static method to multiply two Rational numbers
    public static Rational multiply(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.numerator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Static method to divide two Rational numbers
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int numerator = r1.numerator * r2.denominator;
        int denominator = r1.denominator * r2.numerator;
        return new Rational(numerator, denominator);
    }

    // Method to return a String representation of a Rational number in the form a/b
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Method to return a String representation of a Rational number in floating-point format
    public String toDoubleString(int decimalPlaces) {
        double decimalValue = (double) numerator / denominator;
        return String.format("%." + decimalPlaces + "f", decimalValue);
    }

}
