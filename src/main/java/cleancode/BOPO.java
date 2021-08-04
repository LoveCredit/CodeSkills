package cleancode;

import java.util.LinkedList;

/**
 * Beware of Premature Optimization (BOPO)
 * Lesson: Optimizing code comes with cost of less readable or repairable code. Contrast: Less read or repair -able code.
 * Therefore use simple code if enhancements or maintenance are likely.
 *
 * Task: Show difference of maintaining easy and complex code.
 * Solution: Show 2 different implementation styles and compare their maintainability.
 */
public class BOPO {

    LinkedList<String> linkedList = new LinkedList<>();

    private void optimizedCode() {
        linkedList.forEach(System.out::println);
    }

    private void simpleCode() {
        for (String element: linkedList) {
            System.out.println(element);
        }
    }

    /**
     * coder wants to have the method also add an element X after each printing.
     */

    private final String X = "Coder wish changes code.";

    private void optimizedCodeAfterAdjustment() {
        linkedList.forEach(s -> {
            System.out.println(s);
            linkedList.add(X);
        });
    }

    private void simpleCodeAfterAdjustment() {
        for (String element: linkedList) {
            System.out.println(element);
            linkedList.add(X);
        }
    }
}
