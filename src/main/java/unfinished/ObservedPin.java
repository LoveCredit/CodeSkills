package unfinished;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Alright, detective, one of our colleagues successfully observed our target person, Robby the robber. We followed him to a secret warehouse, where we assume to find all the stolen stuff. The door to this warehouse is secured by an electronic combination lock. Unfortunately our spy isn't sure about the PIN he saw, when Robby entered it.
 *
 * The keypad has the following layout:
 *
 * ┌───┬───┬───┐
 * │ 1 │ 2 │ 3 │
 * ├───┼───┼───┤
 * │ 4 │ 5 │ 6 │
 * ├───┼───┼───┤
 * │ 7 │ 8 │ 9 │
 * └───┼───┼───┘
 *     │ 0 │
 *     └───┘
 * He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent digit (horizontally or vertically, but not diagonally). E.g. instead of the 1 it could also be the 2 or 4. And instead of the 5 it could also be the 2, 4, 6 or 8.
 *
 * He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs, they never finally lock the system or sound the alarm. That's why we can try out all possible (*) variations.
 *
 * * possible in sense of: the observed PIN itself and all variations considering the adjacent digits
 *
 * Can you help us to find all those variations? It would be nice to have a function, that returns an array (or a list in Java and C#) of all variations for an observed PIN with a length of 1 to 8 digits. We could name the function getPINs (get_pins in python, GetPINs in C#). But please note that all PINs, the observed one and also the results, must be strings, because of potentially leading '0's. We already prepared some test cases for you.
 *
 * Detective, we are counting on you!
 *
 * For C# user: Do not use Mono. Mono is too slower when run your code.
 *
 * Current time - 102min
 * https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java
 */
public class ObservedPin {

    private static LinkedList linkedList = new LinkedList();

    public static List<String> getPINs(String observed) {
        String[][] pinWithNeighborsArray = new String[observed.length()][];
        int i = 0;
        int[] currentPins = new int[observed.length()];
        String[] combinations = new String[observed.length() * observed.length()];

        HashSet<Character> chars = (HashSet<Character>) observed.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        
        for (char pin: chars) {
            combinations[0] = "";
            pinWithNeighborsArray[i] = getPinWithNeighbors(pin);

            i++;
            return null;
        }

        int j = 0;
        while (j != observed.length() * observed.length()) {
            //if (j == observed.length())
            currentPins[j] = 0;
            for (String[] pinWithNeighbors: pinWithNeighborsArray) {
                combinations[i]+= pinWithNeighbors[currentPins[j]];
                j++;
                for (int pinIndex = 0; pinIndex < observed.length(); pinIndex++) {

                }
            }
            i++;
        }

        
        HashSet hashSet = (HashSet) Arrays.stream(pinWithNeighborsArray).collect(Collectors.toSet());

        //hashSet.stream().sorted()
        return null;
    } // getPINs

    public static String[] getPinWithNeighbors(int pin) {
        switch (pin) {
            case 0:
                return new String[]{"8", "0"};
            case 1:
                return new String[]{"1", "2", "4"};
            case 2:
                return new String[]{"1", "2", "5", "3"};
            case 3:
                return new String[]{"2", "3", "6"};
            case 4:
                return new String[]{"1", "4", "5", "7"};
            case 5:
                return new String[]{"2", "4", "5", "6", "8"};
            case 6:
                return new String[]{"3", "5", "6", "9"};
            case 7:
                return new String[]{"4", "7", "8"};
            case 8:
                return new String[]{"5", "7", "8", "9", "0"};
            case 9:
                return new String[]{"6", "8", "9"};
        }
        return null;
    }

} // ObservedPin

class PinWithNeighbors {

    public static String[] neighbors;

    public PinWithNeighbors(int pin) {
        switch (pin) {
            case 0:
                neighbors = new String[]{"8", "0"};
            case 1:
                neighbors = new String[]{"1", "2", "4"};
            case 2:
                neighbors = new String[]{"1", "2", "5", "3"};
            case 3:
                neighbors = new String[]{"2", "3", "6"};
            case 4:
                neighbors = new String[]{"1", "4", "5", "7"};
            case 5:
                neighbors = new String[]{"2", "4", "5", "6", "8"};
            case 6:
                neighbors = new String[]{"3", "5", "6", "9"};
            case 7:
                neighbors = new String[]{"4", "7", "8"};
            case 8:
                neighbors = new String[]{"5", "7", "8", "9", "0"};
            case 9:
                neighbors = new String[]{"6", "8", "9"};
        }
    }

    public static String[] getNeighbors() {
        return neighbors;
    }
}