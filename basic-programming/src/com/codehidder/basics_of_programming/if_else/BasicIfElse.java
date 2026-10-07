package com.codehidder.basics_of_programming.if_else;

public class BasicIfElse {

    // 1
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    // 2
    static void checkNumberSign(int n) {
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

    // 3
    static void findLargestOfTwo(int a, int b) {
        if (a > b) {
            System.out.println(a + " is largest");
        } else if (b > a) {
            System.out.println(b + " is largest");
        } else {
            System.out.println("Both are equal");
        }
    }

    // 4
    static void findLargestOfThree(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("Largest of " + a + ", " + b + ", " + c + " is " + largest);
    }

    // 5
    static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    // 6
    static void checkVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is Vowel");
            } else {
                System.out.println(ch + " is Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }

    // 7
    static void countDigits(int n) {
        int num = Math.abs(n);
        int count;
        if (num < 10) {
            count = 1;
        } else if (num < 100) {
            count = 2;
        } else if (num < 1000) {
            count = 3;
        } else if (num < 10000) {
            count = 4;
        } else if (num < 100000) {
            count = 5;
        } else {
            count = 6;
        }
        System.out.println(n + " has " + count + " digit(s) (max 6 tak check kiya)");
    }

    // 8
    static void calculate(double a, double b, char op) {
        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Divide by zero not allowed");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        } else {
            System.out.println("Invalid operator");
        }
    }

    // 9
    static void calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println(marks + " -> Grade A");
        } else if (marks >= 75) {
            System.out.println(marks + " -> Grade B");
        } else if (marks >= 60) {
            System.out.println(marks + " -> Grade C");
        } else if (marks >= 40) {
            System.out.println(marks + " -> Grade D");
        } else {
            System.out.println(marks + " -> Fail");
        }
    }

    // 10
    static void checkDivisibility(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both 3 and 5");
        } else if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3 only");
        } else if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5 only");
        } else {
            System.out.println(n + " is not divisible by 3 or 5");
        }
    }

    // 11
    static void checkValidTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }

    // 12
    static void checkCharacterCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }

    // 13
    static void calculateInterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;
        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
    }

    // 14
    static void checkVotingEligibility(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("Age " + age + ": Eligible to vote");
        } else {
            System.out.println("Age " + age + ": Not eligible, " + (18 - age) + " saal baaki");
        }
    }

    // 15
    static void calculateBMI(double weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static void main(String[] args) {
//        System.out.println("---- Level 1: Basic If-Else ----");
//
//        checkEvenOdd(10);
//        checkEvenOdd(7);
//
//        checkNumberSign(5);
//        checkNumberSign(-3);
//        checkNumberSign(0);
//
//        findLargestOfTwo(10, 20);
//
//        findLargestOfThree(12, 45, 30);
//
//        checkLeapYear(2024);
//        checkLeapYear(1900);
//
//        checkVowelOrConsonant('E');
//        checkVowelOrConsonant('k');
//
//        countDigits(4567);
//
//        calculate(10, 5, '+');
//        calculate(10, 0, '/');
//
//        calculateGrade(82);
//
//        checkDivisibility(15);
//        checkDivisibility(9);
//
//        checkValidTriangle(60, 60, 60);
//        checkValidTriangle(90, 90, 90);
//
//        checkCharacterCase('G');
//        checkCharacterCase('g');
//
//        calculateInterest(10000, 5, 2);
//
//        checkVotingEligibility(20);
//        checkVotingEligibility(15);

        calculateBMI(70, 1.75);
    }
}