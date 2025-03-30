package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(bubbleSort(new int[]{0, 42, 32, 44, 64, 75, -2, 97})));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length -1 - i; j++) {
                int number = nums[j];
                int nextNumber = nums[j + 1];

                if (number > nextNumber) {
                    nums[j + 1] = number;
                    nums[j] = nextNumber;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return nums;
    }
}