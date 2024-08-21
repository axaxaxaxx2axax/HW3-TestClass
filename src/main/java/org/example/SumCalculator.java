package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input number must be greater than or equal to 1.");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new SumCalculator().sum(-3));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
