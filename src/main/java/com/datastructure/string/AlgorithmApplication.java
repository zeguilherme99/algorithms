package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(reverse(List.of("azul", "verde", "preto", "rosa")));
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        T head = list.get(0);
        List<T> list2 = list.subList(1, list.size());
        reverse(list2).add(head);

        return list2;
    }
}