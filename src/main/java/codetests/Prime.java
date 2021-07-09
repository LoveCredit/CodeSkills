package codetests;

/**
 * Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.
 *
 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 *
 * Requirements
 * You can assume you will be given an integer input.
 * You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
 * NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
 * Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
 *
 * Completion time - 20min
 * https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
 */
public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        long sqrt = (long) Math.sqrt(num) + 1;
        for (long i = 6L; i <= sqrt; i+= 6) {
            if (num % (i + 1) == 0 || num % (i - 1) == 0) return false;
        }
        return true;
    }

    //long execution time for big numbers
    public static boolean isPrime2(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
