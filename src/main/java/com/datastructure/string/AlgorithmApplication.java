package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int value = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                value = value + 1;
                if (value > maxCount) {
                    maxCount = value;
                }
            } else {
                value = 0;
            }
        }
        return maxCount;
    }
}
