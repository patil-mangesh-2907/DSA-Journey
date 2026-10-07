package com.codehidder.basics_of_programming.tricky_loops;

public class TrickyLoops {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 31
    static void checkPrime(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }

    // 32
    static void printPrimeNumbers(int n) {
        System.out.print("Primes till " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 33
    static void checkArmstrong(int n) {
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + (int) Math.pow(d, digits);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is Armstrong");
        } else {
            System.out.println(n + " is not Armstrong");
        }
    }

    // 34
    static void printFibonacciSeries(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 35
    static void findGCD(int a, int b) {
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " = " + x);
    }

    // 36
    static void findLCM(int a, int b) {
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int lcm = (a * b) / x;
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }

    // 37
    static void checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n && n > 0) {
            System.out.println(n + " is Perfect Number");
        } else {
            System.out.println(n + " is not Perfect Number");
        }
    }

    // 38
    static void sumFibonacciNumbers(int terms) {
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum = sum + a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of first " + terms + " Fibonacci numbers = " + sum);
    }

    // 39
    static void calculatePower(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        System.out.println(base + " ^ " + exp + " = " + result);
    }

    // 40
    static void countPrimeNumbers(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Primes till " + n + " = " + count);
    }

    // 41
    static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest nahi mila");
        } else {
            System.out.println("Second largest = " + second);
        }
    }

    // 42
    static void countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count = count + n / i;
        }
        System.out.println("Trailing zeros in " + n + "! = " + count);
    }

    // 43
    static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("Binary of 0 = 0");
            return;
        }
        int temp = n;
        String binary = "";
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        System.out.println("Binary of " + n + " = " + binary);
    }

    // 44
    static void binaryToDecimal(int binary) {
        int temp = binary;
        int decimal = 0;
        int power = 1;
        while (temp > 0) {
            int digit = temp % 10;
            decimal = decimal + digit * power;
            power = power * 2;
            temp = temp / 10;
        }
        System.out.println("Decimal of " + binary + " = " + decimal);
    }

    // 45
    static void calculateHarmonicSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println("Harmonic sum till " + n + " = " + sum);
    }

    public static void main(String[] args) {
//        System.out.println("---- Level 3: Tricky Loops ----");
//
//        checkPrime(17);
//        checkPrime(18);
//        printPrimeNumbers(30);
//        checkArmstrong(153);
//        checkArmstrong(123);
//        printFibonacciSeries(10);
//        findGCD(12, 18);
//        findLCM(12, 18);
//        checkPerfectNumber(28);
//        checkPerfectNumber(12);
//        sumFibonacciNumbers(10);
//        calculatePower(2, 10);
//        countPrimeNumbers(50);
//        findSecondLargest(new int[]{10, 45, 32, 78, 56});
//        countTrailingZeros(100);
//        decimalToBinary(10);
//        binaryToDecimal(1010);
        calculateHarmonicSum(5);
    }
}