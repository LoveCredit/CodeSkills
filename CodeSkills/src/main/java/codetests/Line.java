package codetests;

import java.util.LinkedList;

/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
 *
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 *
 * Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
 *
 * Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.
 *
 * Completion time - 23min
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
 */
public class Line {

    public static String Tickets(int[] peopleInLine) {
        LinkedList<Integer> exchange = new LinkedList<>();
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] - 25 == 0) {
                exchange.add(25);
                continue;
            }
            if (peopleInLine[i] - 25 > 0) {
                if (peopleInLine[i] == 50) {
                    if (exchange.contains(25)) {
                        exchange.remove(exchange.indexOf(25));
                        exchange.add(50);
                        continue;
                    }
                    return "NO";
                }
                if (peopleInLine[i] == 100) {
                    if (exchange.contains(25) && exchange.contains(50)) {
                        exchange.remove(exchange.indexOf(25));
                        exchange.remove(exchange.indexOf(50));
                        continue;
                    }
                    if (exchange.stream().filter(bill -> bill == 25).count() == 3) {
                        exchange.remove(exchange.indexOf(25));
                        exchange.remove(exchange.indexOf(25));
                        exchange.remove(exchange.indexOf(25));
                        continue;
                    }
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
