package com.company;

import java.util.Scanner;

public class Calculator {

    /**
     * ADDITION METHOD
     * The addition method calculates the sum of two or more numbers.
     * The input method is called before the addition method to collect the number
     * of
     * entries expected by the user before going on to print out the results.
     */
    public void addition() {
        // a is the number to calculate the addition
        float a;
        float b;
        float total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextFloat();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextFloat();
        // Storing the variable a + b in the variable total
        total = a + b;
        // Printing the results
        System.out.println("Addition result = " + total);
    }

    /**
     * SUBTRACTION METHOD
     * The subtraction method calculates the deduction of two or more numbers.
     * The input method is called before the subtraction method to collect the
     * number of
     * entries expected by the user before going on to print out the results
     */
    public void subtraction() {
        // a and b are the numbers to calculate the subtraction
        float a;
        float b;
        float total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextFloat();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextFloat();
        // Storing the variable a - b in the variable total
        total = a - b;
        // Printing the results
        System.out.println("Subtraction results = " + total);
    }

    /**
     * MULTIPLICATION METHOD
     * The multiplication method calculates the increase of two or more numbers.
     * The input method is called before the multiplication method to collect the
     * number of
     * entries expected by the user before going on to print the results.
     */
    public void multiplication() {
        // a is the number to calculate the addition
        float a;
        float b;
        float total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextFloat();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextFloat();
        // Storing the variable a + b in the variable total
        total = a * b;
        // Printing the results
        System.out.println("Addition result = " + total);
    }

    /**
     * DIVISION METHOD
     * The division method calculates the splitting of a large number into equal
     * smaller number.
     * The input method is called before the division method to collect the number
     * of
     * entries expected by the user before going on to print out the results.
     */
    public void division() {
        // a and b are the numbers to calculate the division
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextDouble();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextDouble();
        // Storing the variable a / b in the variable total
        total = a / b;
        // Printing the results
        System.out.println("Division result = " + total);
    }

    /**
     * POWER METHOD
     * The power method calculates the number with the largest absolute value.
     * The input method is called before the power method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void power() {
        // a and b are the numbers to calculate the power
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        // Reading the first number inputed by the user
        a = input.nextInt();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextInt();
        // Storing the variable findPower(a,b) in the variable total
        total = Math.pow(a, b);
        // Printing the results
        System.out.println("Power result = " + total);
    }

    /**
     * SQUARE METHOD
     * The square method calculates the result of multiplying a number by itself.
     * The input method is called before the square method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void square() {
        // a is the number to calculate the square
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed from the user
        a = input.nextDouble();
        // Storing the variable a*a in the variable total
        total = a * a;
        // Printing the results
        System.out.println("Square result = " + total);
    }

    /**
     * CUBE METHOD
     * The cube method calculates the result of multiplying a number by itself
     * twice.
     * The input method is called before the cube method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void cube() {
        // a is the number to calculate the cube
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        // Storing the variable a*a*a in the variable cube
        total = a * a * a;
        // Printing the results
        System.out.println("Cube result = " + total);
    }

    /**
     * SQUARE ROOT METHOD
     * The square root method calculates the factor of a number that when multiplied
     * by itself, gives the original number.
     * The input method is called before square root method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void square_root() {
        // x is the number to calculate the square root
        double x;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        x = input.nextDouble();
        // Storing the variable findsqrt(x) in the variable total
        total = findsqrt(x);
        // Printing the results
        System.out.println("Square root result = " + total);
    }

    /**
     * ROUND METHOD
     * The round method calculates a number with an approximate value that has a
     * simpler representation
     * The input method is called before the round method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void round() {
        // a is the number to calculate round
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        // Storing the variable Math.round(a) in the variable total
        total = Math.round(a);
        // Printing the results
        System.out.println("round result = " + total);
    }

    /**
     * CEILING METHOD
     * The ceiling method is a function that returns the largest number.
     * The input method is called before the ceiling method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void ceiling() {
        // a is the number to calculate the ceil
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        // Storing the variable Math.ceil(a) in the variable total
        total = Math.ceil(a);
        // Printing the results
        System.out.println("Ceiling result = " + total);
    }

    /**
     * FLOOR METHOD
     * The floor method is a function that returns the smallest number.
     * The input method is called before the floor method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void floor() {
        // a is the number to calculate the floor
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        // Storing the variable Math.floor(a) in the variable total
        total = Math.floor(a);
        // Printing the results
        System.out.println("Floor result = " + total);
    }

    /**
     * MIN VALUE METHOD
     * The min value method is a function that takes two numbers and returns the
     * smallest one.
     * The input method is called before the min value method to collect the number
     * of
     * entries expected by the user before going on to print the results.
     */
    public void min_value() {
        // a and b are the numbers to calculate min_value
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextDouble();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextDouble();
        // Storing the variable Math.min(a,b) in the variable total
        total = Math.min(a, b);
        // Printing the results
        System.out.println("Min_value result = " + total);
    }

    /**
     * MAX VALUE METHOD
     * The max value method is a function that takes two numbers and returns the
     * largest one.
     * The input method is called before the max value method to collect the number
     * of
     * entries expected by the user before going on to print the results.
     */
    public void max_value() {
        // a and b are the numbers to calculate max_value
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextDouble();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextDouble();
        // Storing the variable Math.max(a,b) in the variable total
        total = Math.max(a, b);
        // Printing the results
        System.out.println("Max_value result = " + total);
    }

    /**
     * SIN METHOD
     * The sin method is a function that takes the ratio of the side of the triangle
     * opposite the angle divided by the hypotenuse.
     * The input method is called before the sin method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void sin() {
        // a is the number to calculate the sin
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println(("Please enter your first number"));
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = Math.toRadians(a);
        // Storing the variable Math.sin(a) in the variable total
        total = Math.sin(b);
        // Printing the results
        System.out.println("Sin result = " + total);
    }

    /**
     * COS METHOD
     * The cos method is a function that takes the ratio of the side of the triangle
     * adjacent to the angle divided by the hypotenuse.
     * The input method is called before the cos method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void cos() {
        // a is the number is to calculate cos
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = Math.toRadians(a);
        // Storing the variable Math.cos(b) in the variable total
        total = Math.cos(b);
        // Printing the results
        System.out.println("Cos result = " + total);
    }

    /**
     * TAN METHOD
     * The tan method is a function that takes the ratio of the side of the triangle
     * opposite to the angle divided by the adjacent.
     * The input method is called before the cos method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void tan() {
        // a is the number is to calculate tan
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = Math.toRadians(a);
        // Storing the variable Math.tan(b) in the variable total
        total = Math.tan(b);
        // Printing the results
        System.out.println("Tan result = " + total);
    }

    /**
     * ASIN METHOD
     * The asin method is used to find the angle when opposite and hypotenuse are
     * given .
     * The input method is called before the asin method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void asin() {
        // a is the number to calculate asin
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = (Math.PI * a) / 180;
        // Storing the variable Math.asin(math.sin(b)) in the variable total
        total = Math.asin(Math.sin(b));
        // Printing the result
        System.out.println("Asin result = " + total);
    }

    /**
     * ACOS METHOD
     * The acos method is used to find the angle when adjacent and hypotenuse are
     * given.
     * The input method is called before the acos method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void acos() {
        // a is the number to calculate acos
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = (Math.PI * a) / 180;
        // Storing the variable Math.acos(Math.cos(b)) in the variable total
        total = Math.acos(Math.cos(b));
        // Printing the results
        System.out.println("Acos result = " + total);
    }

    /**
     * ATAN METHOD
     * The atan method is used to find the angle when opposite and adjacent are
     * given.
     * The input method is called before the atan method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void atan() {
        // a is the number to calculate atan
        double a;
        double b;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        b = (Math.PI * a) / 180;
        // Storing the variable Math.atan(b) in the variable total
        total = Math.atan(b);
        // Printing the results
        System.out.println("Atan result = " + total);
    }

    /**
     * EXPONENTIAL METHOD
     * The exponential method is a function in which an independent variable appears
     * in one of the exponents.
     * The input method is called before the exponential method to collect the
     * number of
     * entries expected by the user before going on to print the results.
     */
    public void exponential() {
        // a is the number to calculate exponential
        double a;
        double total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextDouble();
        // Storing the variable Math.exp(a) in the variable total
        total = Math.exp(a);
        // Printing the results
        System.out.println("Exponential result = " + total);
    }

    /**
     * PALINDROME METHOD
     * The palindrome method is a number that reads the same forward and backward.
     * The input method is called before the palindrome method to collect the number
     * of
     * entries expected by the user before going on to print the results.
     */
    public void palindrome() {
        int remainder;
        int sum = 0;
        int temp;
        int palindrome;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        palindrome = input.nextInt();
        // The temp variable is equated to the temp variable, a variable that'll check
        // for the palindrome.
        temp = palindrome;
        while (palindrome > 0) {
            // The remainder variable is set to the modulus of the palindrome when divided
            // by 10
            remainder = (palindrome % 10);
            // The sum is set to be equal to the sum multiplied by 10 and added to
            // remainder.
            sum = (sum * 10) + remainder;
            // The palindrome is equal to itself divided by 10 .
            palindrome = palindrome / 10;
        }
        // If the temp is equal to the sum the program prints a confirmation message to
        // tell the user if or not the number is a palindrome
        if (temp == sum) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    /**
     * ARMSTRONG NUMBER METHOD
     * The armstrong number is an integer such that the sum of the cubes of its
     * digits is equal to the number itself.
     * The input method is called before the armstrong method to collect the number
     * of
     * entries expected by the user before going on to print the results.
     */
    public void armstrong_number() {
        // x is the number to calculate the armstrong number
        int x = 0;
        int y = 0;
        int z = 0;
        int temp;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        // Reading the number inputed by the user
        x = input.nextInt();
        temp = x;
        while (x > 0) {
            y = x % 10;
            x = x / 10;
            z = z + (y * y * y);
        }
        // If temp is not equals to z it's an armstrong number else it's not an
        // armstrong number
        if (temp == z) {
            System.out.println("Armstrong number = " + temp);
        } else {
            System.out.println("Armstrong number is not = " + temp);
        }
    }

    /**
     * PRIME NUMBER METHOD
     * The prime number method is a whole number greater than 1 whose only factors
     * are 1 and itself.
     * The input method is called before the prime number method to collect the
     * number of
     * entries expected by the user before going on to print the results.
     */
    public void prime_number() {
        // a is the number to find the prime number
        int a;
        boolean flag = false;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the number inputed by the user
        a = input.nextInt();
        for (int i = 2; i <= a / 2; ++i) {
            // Condition for non-prime number
            if (a % i == 0) {
                flag = true;
                break;
            }
        }
        // If flag is false then the number is prime else it's not a prime number
        if (!flag)
            System.out.println("Prime number = " + a);
        else
            System.out.println("Prime number is not = " + a);
    }

    /**
     * AVERAGE NUMBER METHOD
     * The average number method is to add up all the numbers, then divide by how
     * many numbers there are.
     * The input method is called before the average number method to collect the
     * number of
     * entries expected by the user before going on to print the results.
     */
    public void average_number() {
        // c and b is the number to calculate the average number
        float a;
        float b;
        float total = 0;
        float c;
        float num = 0;
        float average;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Numbers Do You Want To Calculate The Average?");
        // Reading the number inputed by the user
        c = input.nextFloat();
        // For loop sums up the current answer with the new input value put in by the
        // user everytime the input field is filled
        for (a = 0; a < c; a++) {
            System.out.println("Enter the number");
            // Reading the number inputed by the user
            b = input.nextFloat();
            total = total + b;
            num++;
        }
        // Storing the variable total / num in the variable average
        average = total / num;
        // Printing the results
        System.out.println("Average result = " + average);
    }

    /**
     * GCD METHOD
     * The gcd method also known as greatest common divisor is said to be relatively
     * prime.
     * The input method is called before the gcd method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void gcd() {
        // a and b are the numbers to calculate the GCD
        int a;
        int b;
        int total = 0;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        a = input.nextInt();
        System.out.println("Please enter your second number");
        // Reading the second number inputed by the user
        b = input.nextInt();
        // Storing the variable findGCD(a,b) in the variable total
        total = findGCD(a, b);
        // Printing the results
        System.out.println("Gcd result =  " + total);
    }

    /**
     * LCM METHOD
     * The lcm method is smallest positive integer that is a multiple of each of the
     * numbers.
     * The input method is called before the lcm method to collect the number of
     * entries expected by the user before going on to print the results.
     */
    public void lcm() {
        // x and y are the numbers to find the LCM
        int x;
        int y;
        int total;
        // Creating objects of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        // Reading the first number inputed by the user
        x = input.nextInt();
        System.out.println("Please enter the second number");
        // Reading the second number inputed by the user
        y = input.nextInt();
        // Storing the variable findLcm(x,y) in the variable total
        total = findLcm(x, y);
        // Printing the results
        System.out.println("Lcm result = " + total);
    }

    // User-defined method that contains the logic to find the Gcd of a number
    public static int findGCD(int a, int b) {
        // While statement repeat the instructions based on b is not equal to zero
        while (b != 0) {
            if (a > b) {
                // return a if a is greater than b
                a = a - b;
            } else {
                // return b if a is less than b
                b = b - a;
            }
        }
        // Calling function that returns the GCD
        return a;
    }

    // User-defined method that contains the logic to find the Lcm of a number
    public static int findGcd(int x, int y) {
        if (x == 0)
            // return y if x == 0
            return y;
        // calling function that returns GCD
        return findGcd(y % x, x);
    }

    public static int findLcm(int x, int y) {
        // returns the LCM
        return (x / findGcd(x, y)) * y;
    }

    // User-defined method that contains the logic to find the power of a number
    public static int findPower(int a, int b) {
        // temporary variable
        int temp;
        if (b == 0)
            return 1;
        temp = findPower(a, b / 2);

        if (b % 2 == 0)
            return temp * temp;
        else {
            if (b > 0)
                return a * temp * temp;
            else {
                return (temp * temp) / a;
            }
        }
    }

    // User-defined method that contains the logic to find the square root of a
    // number
    public static double findsqrt(double x) {
        // temporary variables
        double a;
        double sqrt = x / 2;
        // Do function executes until the conditions becomes false
        do {
            a = sqrt;
            sqrt = (a + (x / a)) / 2;
            // While statement repeat the instructions until the conditions become true
        } while ((a - sqrt) != 0);
        // Calling functions that returns the square root
        return sqrt;
    }

}
