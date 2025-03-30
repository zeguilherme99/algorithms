package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(binarySearch(new int[]{0, 21, 42, 53, 64, 75, 86, 97}, 10));
    }

    public static int binarySearch(int[] nums, int number) {
        return binarySearchRecursive(nums, 0, nums.length - 1, number);
    }

    public static int binarySearchRecursive(int[] nums, int initiate, int last, int number) {

        if (initiate > last) {
            return -1;
        }

        int num = (last + initiate) / 2;

        if (nums[num] == number) {
            return num;
        } else if (nums[num] < number) {
            return binarySearchRecursive(nums, num + 1, last, number);
        } else {
            return binarySearchRecursive(nums, initiate, num - 1, number);
        }
    }
}