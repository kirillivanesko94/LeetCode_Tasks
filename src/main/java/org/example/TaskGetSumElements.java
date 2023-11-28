package org.example;
/*
Get the sum of the numeric elements in the char array.
Then get the sum of the numbers from the found number
 */

public class TaskGetSumElements {
    public static void main(String[] args) {
        char[] chars = {'a', '1', '2', '3', '5', 'c', '5', 'e'};
        int sum = getSumElements(chars);
        System.out.println(get(sum));
    }

    private static int getSumElements(char[] c) {
        int result = 0;
        for (char value : c) {
            if (Character.isDigit(value)) {
                result += Character.getNumericValue(value);
            }
        }
        return result;
    }

    private static int get(int sum) {
        char[] chars = ("" + sum).toCharArray();
        return getSumElements(chars);
    }
}
