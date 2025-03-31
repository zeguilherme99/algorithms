package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(selectionSort(new int[]{0, 42, 32, 44, 64, 75, -2, 97})));
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                int number = nums[j];
                if (number < nums[minIndex]) {
                    minIndex = j;
                }
                System.out.println(Arrays.toString(nums));
            }
            if (minIndex != i) {
                int aux = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = aux;
            }
        }

        return nums;
    }
}