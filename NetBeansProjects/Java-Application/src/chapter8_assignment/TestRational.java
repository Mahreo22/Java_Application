
package chapter8_assignment;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        Rational sum = Rational.add(r1, r2);
        System.out.println("r1 + r2: " + sum);

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("r1 - r2: " + difference);

        Rational product = Rational.multiply(r1, r2);
        System.out.println("r1 * r2: " + product);

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("r1 / r2: " + quotient);

        System.out.println("r1 as a double: " + r1.toDoubleString(4));
    }

}
