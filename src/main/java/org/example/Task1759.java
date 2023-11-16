package org.example;
/*
Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.
A string is homogenous if all the characters of the string are the same.
A substring is a contiguous sequence of characters within a string.
 */
public class Task1759 {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        String s = "abbcccaa";
        String s1 = "zzzzz";
        System.out.println(solution(s));
        System.out.println(solution(s1));
    }

    private static int solution(String s) {
        int result = 0;
        int currentCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
               currentCount++;
            } else {
                result = (result + (currentCount * (currentCount + 1) / 2) % MOD) % MOD;
                currentCount = 1;
            }
        }
        result = (result + (currentCount * (currentCount + 1) / 2) % MOD) % MOD;

        return result;
    }
}
