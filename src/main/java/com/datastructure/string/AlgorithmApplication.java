package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        int[] arr = new int[]{100, 32, 42, -2, 64, 4, -3, 97};
        mergeSortRecursive(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortRecursive(int[] nums, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSortRecursive(nums, first, middle);
            mergeSortRecursive(nums, middle + 1, last);
            merge(nums, first, middle, last);
        }
    }

    public static void merge(int[] nums, int first, int middle, int last) {
        int length = last - first + 1;
        int i = first;
        int j = middle + 1;
        int k = 0;
        int[] arr = new int[length];

        while (i <= middle && j <= last) {
            if (nums[i] < nums[j]) {
                arr[k] = nums[i];
                i++;
            } else {
                arr[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            arr[k] = nums[i];
            i++;
            k++;
        }

        while (j <= last) {
            arr[k] = nums[j];
            j++;
            k++;
        }

        for (int c = 0; c < length; c++) {
            nums[first + c] = arr[c];
        }
    }
}