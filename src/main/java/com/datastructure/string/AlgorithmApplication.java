package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(findEvenNumberDigits(new int[]{555,901,482,1771,12}));
    }

    public static int findEvenNumberDigits(int[] nums) {
        int value = 0;

        for (int num : nums) {
            String strNumber = String.valueOf(num);

            if (strNumber.length() % 2 == 0) {
                value++;
            }
        }
        return value;
    }
}