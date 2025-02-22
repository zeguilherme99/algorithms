package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(sumNaturals(4));
    }

    public static int sumNaturals(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sumNaturals(n - 1);

    }
}