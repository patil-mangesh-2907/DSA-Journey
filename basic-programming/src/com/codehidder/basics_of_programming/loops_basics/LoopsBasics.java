package com.codehidder.basics_of_programming.loops_basics;

public class LoopsBasics {

    // 16
    static void printOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 17
    static void printNToOne(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 18
    static void sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 1 to " + n + " = " + sum);
    }

    // 19
    static void calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    // 20
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 21
    static void sumOfDigits(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Sum of digits of " + n + " = " + sum);
    }

    // 22
    static void reverseNumber(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + n + " = " + rev);
    }

    // 23
    static void checkPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }
    }

    // 24
    static void countDigitsUsingLoop(int n) {
        int temp = n;
        int count = 0;
        if (temp == 0) {
            count = 1;
        }
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println(n + " has " + count + " digits");
    }

    // 25
    static void sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum of even numbers till " + n + " = " + sum);
    }

    // 26
    static void sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum of odd numbers till " + n + " = " + sum);
    }

    // 27
    static void printEvenNumbers(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 28
    static void productOfDigits(int n) {
        int temp = n;
        int product = 1;
        while (temp > 0) {
            product = product * (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Product of digits of " + n + " = " + product);
    }

    // 29
    static void countZeros(int n) {
        int temp = n;
        int count = 0;
        if (temp == 0) {
            count = 1;
        }
        while (temp > 0) {
            if (temp % 10 == 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Zeros in " + n + " = " + count);
    }

    // 30
    static void findFirstAndLastDigit(int n) {
        int last = n % 10;
        int first = n;
        while (first >= 10) {
            first = first / 10;
        }
        System.out.println("First digit = " + first + ", Last digit = " + last);
    }

    public static void main(String[] args) {
        System.out.println("---- Level 2: Loops Basics ----");

//        printOneToN(10);
//        printNToOne(10);
//        sumNaturalNumbers(100);
//        calculateFactorial(5);
//        printTable(7);
//        sumOfDigits(1234);
//        reverseNumber(1234);
//        checkPalindrome(121);
//        checkPalindrome(123);
//        countDigitsUsingLoop(98765);
//        sumEvenNumbers(10);
//        sumOddNumbers(10);
//        printEvenNumbers(20);
//        productOfDigits(234);
//        countZeros(10200);
        findFirstAndLastDigit(98765);
    }
}