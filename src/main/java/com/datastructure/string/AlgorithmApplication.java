package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(longestCommonPrefix(new String[]{"flithasdasd", "flinston", "flior", "flower"}));
    }

    public static String longestCommonPrefix(String[] v) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
            String str = v[i];
            char[] strArray = str.toCharArray();

            if (i == 0 && strBuilder.isEmpty()) {
                strBuilder.append(strArray);
            }

            int minLength = Math.min(strBuilder.length(), strArray.length);

            for (int j = minLength - 1; j >= 0; j--) {
                if (strBuilder.charAt(j) != strArray[j]) {
                    strBuilder.deleteCharAt(j);
                }
            }
        }

        return strBuilder.toString();
    }

}
