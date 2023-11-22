package org.example;
/*
Two String variables are given, it is necessary to get the number of each of the variables and return their sum
 */
public class Task415 {
    public static void main(String[] args) {
        String s1 = "1as3dasd1";
        String s2 = "asd2asdad2";
        System.out.println(solution(s1, s2));

    }

    private static int solution(String s1, String s2) {
        return getSum(s1) + getSum(s2);
    }

    private static int getSum(String s) {
        StringBuilder current = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                current.append(c);
            }
        }
        return Integer.parseInt(current.toString());
    }

}
