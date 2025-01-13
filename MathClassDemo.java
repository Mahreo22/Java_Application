public class MathClassDemo{
    public static void main(String[] args) {
        // Example for Math.pow()
        double base = 2.0;
        double exponent = 3.0;
        double resultPow = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + resultPow);
        
        // Example for Math.sqrt()
        double number = 16.0;
        double resultSqrt = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + resultSqrt);

        // Example for Math.PI
        System.out.println("The value of Pi (π) is: " + Math.PI);

        // Example for Math.min()
        double num1 = 5.5, num2 = 3.2;
        double resultMin = Math.min(num1, num2);
        System.out.println("The smaller value between " + num1 + " and " + num2 + " is: " + resultMin);

        // Example for Math.max()
        double resultMax = Math.max(num1, num2);
        System.out.println("The larger value between " + num1 + " and " + num2 + " is: " + resultMax);

        // Example for Math.round()
        double num = 2.7;
        long roundedValue = Math.round(num);
        System.out.println(num + " rounded to the nearest integer is: " + roundedValue);

        // Example for Math.random()
        double randomValue = Math.random();
        System.out.println("A random number between 0.0 and 1.0: " + randomValue);
    }
}
