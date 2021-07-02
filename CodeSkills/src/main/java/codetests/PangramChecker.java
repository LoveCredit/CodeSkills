package codetests;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 *
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 *
 * different version with:
 * sentence.chars().forEach(c -> bAlphabet[c % 26] = true);
 *
 * Completion time - 25min
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 */
public class PangramChecker {
    public boolean check(String sentence){
        if (sentence == null) return false;
        boolean[] bAlphabet = new boolean[26];
        int i;
        sentence = sentence.toUpperCase();
        for (i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                bAlphabet[sentence.charAt(i) - 'A'] = true;
            }
        }
        for (i = 0; i < bAlphabet.length; i++) {
            if (bAlphabet[i] == false) return false;
        }
        return true;
    }
}
