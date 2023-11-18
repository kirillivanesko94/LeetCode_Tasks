package org.example;

import java.util.HashMap;
import java.util.Map;

/*
Given the string s, output each digit to the console and how many times it repeats
 */
public class Task3333 {
    public static void main(String[] args) {
        String str = "11224567";
        Map<Character, Integer> map = solution(str);
        printMap(map);

    }

    private static Map<Character, Integer> solution(String s) {
        Map<Character, Integer> result = new HashMap<>();
        int numberOfRepetitions = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.containsKey(c)) {
                result.put(c, numberOfRepetitions + 1);
            } else {
                result.put(c, numberOfRepetitions);
            }
        }
        return result;
    }

    private static void printMap(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
