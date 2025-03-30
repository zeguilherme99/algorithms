package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(bubbleSort(new int[]{0, 42, 32, 44, 64, 75, 86, 97})));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int number = nums[i];
            int nextNumber = nums[i + 1];

            if (number > nextNumber) {
                nums[i + 1] = number;
                nums[i] = nextNumber;
            }
        }

        return nums;
    }
}