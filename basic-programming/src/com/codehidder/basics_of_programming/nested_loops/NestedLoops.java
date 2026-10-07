package com.codehidder.basics_of_programming.nested_loops;

public class NestedLoops {

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

    // 46
    static void printMultiplicationGrid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    // 47
    static void calculateMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Matrix sum = " + sum);
    }

    // 48
    static void printPairsWithGivenSum(int[] arr, int target) {
        System.out.println("Pairs with sum " + target + ":");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Koi pair nahi mila");
        }
    }

    // 49 (digits ke factorial ka sum == number)
    static void checkStrongNumber(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is Strong Number");
        } else {
            System.out.println(n + " is not Strong Number");
        }
    }

    // 50
    static void printArmstrongNumbersInRange(int start, int end) {
        System.out.print("Armstrong numbers from " + start + " to " + end + ": ");
        for (int num = start; num <= end; num++) {
            int digits = String.valueOf(num).length();
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                int p = 1;
                for (int i = 1; i <= digits; i++) {
                    p = p * d;
                }
                sum = sum + p;
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // 51
    static void printTablesFromOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    // 52
    static void printTwinPrimes(int n) {
        System.out.print("Twin primes till " + n + ": ");
        for (int i = 2; i + 2 <= n; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.print("(" + i + ", " + (i + 2) + ") ");
            }
        }
        System.out.println();
    }

    // 53
    static void sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.println("Sum of squares till " + n + " = " + sum);
    }

    // 54 (square ke last digits number jaise ho)
    static void checkAutomorphicNumber(int n) {
        long square = (long) n * n;
        int temp = n;
        boolean automorphic = true;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                automorphic = false;
                break;
            }
            temp = temp / 10;
            square = square / 10;
        }
        if (automorphic) {
            System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is not Automorphic");
        }
    }

    // 55
    static void processATMWithdrawal(int balance, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount 100 ke multiple me hona chahiye");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            int[] notes = {500, 200, 100};
            int remaining = amount;
            for (int i = 0; i < notes.length; i++) {
                int count = remaining / notes[i];
                if (count > 0) {
                    System.out.println(notes[i] + " x " + count);
                    remaining = remaining % notes[i];
                }
            }
            balance = balance - amount;
            System.out.println("Withdrawal successful. Balance = " + balance);
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Level 4: Nested Loops ----");

//        printMultiplicationGrid(5);
//
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        calculateMatrixSum(matrix);
//
//        printPairsWithGivenSum(new int[]{1, 2, 3, 4, 5, 6}, 7);
//
//        checkStrongNumber(145);
//        checkStrongNumber(123);
//
//        printArmstrongNumbersInRange(100, 999);
//
//        printTablesFromOneToN(3);
//
//        printTwinPrimes(50);
//
//        sumOfSquares(5);
//
//        checkAutomorphicNumber(25);
//        checkAutomorphicNumber(76);
//        checkAutomorphicNumber(12);
//
//        processATMWithdrawal(10000, 2700);
//        processATMWithdrawal(1000, 2500);
//        processATMWithdrawal(5000, 750);
    }
}