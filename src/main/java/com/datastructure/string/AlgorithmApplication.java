package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(insertionSort(new int[]{0, 32, 42, -2, 64, 4, -3, 97})));
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int index = i;
            int aux = nums[i];
            for (int j = i - 1; j >= 0 && nums[j] > aux; j--) {
                nums[j + 1] = nums[j];
                index = j;
            }
            nums[index] = aux;
        }

        return nums;
    }
}