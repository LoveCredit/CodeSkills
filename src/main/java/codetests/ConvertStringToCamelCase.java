package codetests;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Convert string to camel case
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 *
 * Completion time - 13min
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 */
public class ConvertStringToCamelCase {

    static String toCamelCase(String s){
        String result = "";
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(s);

        while (stringCharacterIterator.getIndex() != stringCharacterIterator.getEndIndex()) {
            char curChar = stringCharacterIterator.current();
            if (curChar == '-' || curChar == '_') {
                result+= String.valueOf(stringCharacterIterator.next()).toUpperCase();
            } else {
                result+= curChar;
            }

            stringCharacterIterator.next();
        }
        return result;
    }
}
