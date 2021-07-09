package codetests;

import java.text.StringCharacterIterator;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (like the name of this kata).
 *
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * Examples:
 *
 * spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
 * spinWords("This is a test") => "This is a test"
 * spinWords("This is another test") => "This is rehtona test"
 *
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 */
public class SpinWords {

    /**
     * Completion time - 30min
     */
    public String spinWords(String sentence) {
        String result = "";
        int startIndex = 0, endIndex;
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(sentence);
        while (stringCharacterIterator.getEndIndex() != stringCharacterIterator.getIndex()) {
            if (stringCharacterIterator.current() == ' ') {
                endIndex = stringCharacterIterator.getIndex();
                if (endIndex - startIndex > 4) {
                    for (int i = endIndex - 1; i >= startIndex; i--) {
                        result+= sentence.charAt(i);
                    }
                } else {
                    result+= sentence.substring(startIndex, endIndex);
                }
                startIndex = stringCharacterIterator.getIndex() + 1;
                if (stringCharacterIterator.getEndIndex() != stringCharacterIterator.getIndex() + 1) result += " ";
            }
            if (stringCharacterIterator.getEndIndex() == stringCharacterIterator.getIndex() + 1) {
                endIndex = stringCharacterIterator.getIndex();
                if (endIndex - startIndex > 4) {
                    for (int i = endIndex; i >= startIndex; i--) {
                        result+= sentence.charAt(i);
                    }
                } else {
                    result+= sentence.substring(startIndex, endIndex + 1);
                }
            }
            stringCharacterIterator.next();
        }
        return result;
    }
}
