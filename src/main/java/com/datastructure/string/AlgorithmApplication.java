package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        System.out.println(isAnagram("anagram", "ramgana"));
    }

    public static boolean isAnagram(String s, String t) {
        String[] a = s.split("");
        String[] b = t.split("");
        Arrays.sort(a);
        Arrays.sort(b);

        String str1 = String.join("", a);
        String str2 = String.join("", b);

        if (str1.equals(str2)) {
            return true;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = getCharacters(s);
        Map<Character, Integer> map2 = getCharacters(t);

        for (int i = 0; i< t.length(); i++) {
            Character c = t.charAt(i);

            if (!map2.containsKey(c) || !map.containsKey(c)){
                return false;
            }

            int charNumber = map2.get(c);
            int charNumber2 = map.get(c);

            if (charNumber != charNumber2) {
                return false;
            }
        }

        return true;
    }

    public static Map<Character, Integer> getCharacters(String s) {
        Map<Character, Integer> teste = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            int charCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(j) == s.charAt(i)) {
                    charCount++;
                }
                teste.put(s.charAt(j), charCount);
            }
        }
        return teste;
    }

}
