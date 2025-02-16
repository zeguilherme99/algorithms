package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(sortedSquare(new int[]{-4,-1,0,3,10})));
    }

    public static int[] sortedSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}