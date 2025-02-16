package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(dotProductTwoArrays(new int[]{1,0,0,2,3}, new int[]{0,3,0,4,0}));
    }

    public static int dotProductTwoArrays(int[] nums, int[] nums2) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] * nums2[i];
            value = value + sum;
        }
        return value;
    }
}
