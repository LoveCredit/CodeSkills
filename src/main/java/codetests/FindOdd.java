package codetests;

import java.util.Arrays;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 *
 * Completion time - 18min
 * https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
 */
public class FindOdd {

    public static int findIt(int[] a) {
        for (int i : a) {
            if ((Arrays.stream(a).filter(entry -> entry == i).count() - 1) % 2 == 0) {
                return i;
            }
        }
        return 0;
    }
}
