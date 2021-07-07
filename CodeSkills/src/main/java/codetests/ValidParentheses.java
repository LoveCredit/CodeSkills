package codetests;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
 * The function should return true if the string is valid, and false if it's invalid.
 *
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 * Constraints
 * 0 <= input.length <= 100
 *
 * Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
 * Furthermore, the input string may be empty and/or not contain any parentheses at all.
 * Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
 *
 * Completion time - 16min
 * https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
 */
public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        int openParens = 0, closeParens = 0;
        List<Character> chars = parens.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for (char c: chars) {
            switch (c) {
                case '(':
                    openParens++;
                    break;
                case ')':
                    closeParens++;
                    break;
            }
            if (closeParens > openParens) return false;
        }
        if (closeParens == openParens) return true;
        return false;
    }
}
