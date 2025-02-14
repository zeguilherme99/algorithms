package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(invalidTransactions(new String[]{"alice,20,1200,mtv", "bob,50,1200,mtv", "alice,50,800,teste"}));
    }

    public static List<String> invalidTransactions(String[] transactions) {
        Arrays.sort(transactions);

        String[] firstSplit = transactions[0].split(",");
        List<String> result = new ArrayList<>();

        if (Integer.parseInt(firstSplit[2]) > 1000) {
            result.add(String.join(",", firstSplit));
        }

        for (int i = 1; i < transactions.length; i++) {
            String[] trSplit = transactions[i].split(",");

            if ((trSplit[0].equals(firstSplit[0]) && !trSplit[3].equals(firstSplit[3]) && (Integer.parseInt(trSplit[1]) - Integer.parseInt(firstSplit[1]) <= 60))) {
                result.add(String.join(",", trSplit));
                if (Integer.parseInt(firstSplit[2]) <= 1000) {
                    result.add(String.join(",", firstSplit));
                }
            } else if (Integer.parseInt(trSplit[2]) > 1000) {
                result.add(String.join(",", trSplit));
            }

            firstSplit = trSplit;
        }

        return result;
    }
}
