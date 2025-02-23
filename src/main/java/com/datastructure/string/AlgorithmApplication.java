package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(reverse(List.of("azul", "verde", "preto", "rosa")));
    }

    public static <T> List<T> reverse(List<T> list) {
        List<T> newList = new ArrayList<>();

        return reverseList(list, newList, list.size());
    }

    private static <T> List<T> reverseList(List<T> list, List<T> anotherList, int number){
        if (number == 0) {
            return anotherList;
        }

        anotherList.add(list.get(number - 1));
        return reverseList(list, anotherList, number - 1);
    }
}