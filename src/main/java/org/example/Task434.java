package org.example;
/*
Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
 */
public class Task434 {
    public static void main(String[] args) {
        String s = "I want to walk my dog";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int result = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result++;
        }
        return result;
    }
}
