package cleancode.redbelt;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Root Cause Analysis (RCA)
 * Lesson: When doable: Use deep analysis rather than surface fixes.
 *
 * Task: Create a sorting problem with surface and deep analysis fix. Show that deep analysis fix is better.
 * Solution: Showcase that a surface fix would ignore that the value 64000 gets casted to short. Deep analysis
 * uses the correct value.
 */
public class RCA {

    public static void main(String[] args) {
        sortingMethod();
        System.out.println();
        surfaceFix();
        System.out.println();
        deepAnalysisFix();
    }

    public static void sortingMethod() {
        var list = asList(1, 2, 3, 15, 6, 8, 257, 64000);
        list.sort(Integer::compareTo);
        List<Short> shortList = new ArrayList<>();
        list.forEach(x -> shortList.add(x.shortValue()));
        shortList.forEach(System.out::println);
    }

    //rather than finding the actual problem, the surfaceFix approach simply cures a symptom
    public static void surfaceFix() {
        var list = asList(1, 2, 3, 15, 6, 8, 257, 64000);
        list.sort(Integer::compareTo);
        List<Short> shortList = new ArrayList<>();
        shortList.add(list.get(7).shortValue());
        list.stream().filter(i -> list.indexOf(i) < list.size() - 1).forEach(i -> shortList.add(i.shortValue()));
        shortList.forEach(System.out::println);
    }

    //use integer list rather than short list
    public static void deepAnalysisFix() {
        var list = asList(1, 2, 3, 15, 6, 8, 257, 64000);
        list.sort(Integer::compareTo);
        list.forEach(System.out::println);
    }
}
