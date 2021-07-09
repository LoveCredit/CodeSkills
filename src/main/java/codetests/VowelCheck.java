package codetests;

import java.text.StringCharacterIterator;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * checks for the number of vowels in a given string
 */
public class VowelCheck {

    private static LinkedList initializeVowels() {
        LinkedList vowels = new LinkedList();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }

    public static void main(String[] args) {
        vowelCheck("asdioqfiofmnw");
        streamVowelCheck("asdioqfiofmnw");
    }

    /**
     *  different version possible with String currentChar = str.substring(i, i+1);
     */
    public static int vowelCheck(String str) {
        int vowelsCount = 0;
        LinkedList vowels = initializeVowels();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        while (stringCharacterIterator.getIndex() != stringCharacterIterator.getEndIndex()) {
            char curChar = stringCharacterIterator.current();
            if (vowels.contains(curChar)) {
                vowelsCount++;
            }
            stringCharacterIterator.next();
        }
        return vowelsCount;
    }

    public static int streamVowelCheck(String str) {
        int vowelsCount;
        LinkedList vowels = initializeVowels();
        Stream<Character> characterStream = str.chars().mapToObj(i -> (char) i);
        vowelsCount = (int) characterStream.filter(vowels::contains).count();
        return vowelsCount;
    }
}
