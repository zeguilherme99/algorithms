package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        return fibonacciTailRecursive(n, 0, 1);
    }

    public static int fibonacciTailRecursive(int n, int firstNumber, int secondNumber) {
        if (n == 0) {
            return firstNumber;
        }

        if (n == 1) {
            return secondNumber;
        }

        return fibonacciTailRecursive(n - 1, secondNumber, secondNumber + firstNumber);
    }
}