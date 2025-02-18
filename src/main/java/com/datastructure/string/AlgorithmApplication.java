package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int number = 0;
        for (int i = m; i < length; i++) {
            nums1[i] = nums2[number];
            number++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}