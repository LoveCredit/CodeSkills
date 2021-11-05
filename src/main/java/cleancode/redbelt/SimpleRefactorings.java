package cleancode.redbelt;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * SimpleRefactorings
 * Lesson: Optimizing code should be done with refactorings.
 * - Method extraction
 * - Renaming
 */
public class SimpleRefactorings {

    public void specializeThisMethodInBeingSuperLong() {
        List<Number> vars = asList(0., 5, 3);
        for (Number i : vars) {
            System.out.println(i);
        }
    }

    public void specializeThisMethodInBeingSuperLong2() {
        List<Number> vars = asList(0, 7, 2, 2.);
        for (Number i : vars) {
            System.out.println(i);
        }
    }

    //instead of the 2 methods above, use the following
    public void printSmallNumberList() {
        List<Number> vars = asList(0., 5, 3);
        printList(vars);
    }

    public void printBigNumberList() {
        List<Number> vars = asList(0, 7, 2, 2.);
        printList(vars);
    }

    private void printList(List<Number> vars) {
        for (Number i : vars) {
            System.out.println(i);
        }
    }
}
