package cleancode;

import java.util.ArrayList;
import java.util.List;

/**
 * Keep it simple, stupid (KISS)
 * Lesson: When doable: [use simpler data structures] & [easy code]
 *
 * Task: Take a list of different values, parse them to a data structure as ints and print them
 */
public class KISS {

    public static void main(String[] args) {
        complicatedCode();
        System.out.println("----------simpleCode----------");
        simpleCode();
    }

    private static void complicatedCode() {
        var list = List.of(1, 2.0, "3");
        List<Integer> intList = new ArrayList<>();
        list.stream().mapToInt(i -> parseInt(i)).forEach(i -> intList.add(i));
        intList.stream().forEach(entry -> System.out.println(entry));
    }

    private static int parseInt(Object o) {
        if (o instanceof Double) return Integer.parseInt((String.valueOf(o)).substring(0, 1));
        if (o instanceof String) return Integer.parseInt((String) o);
        return Integer.parseInt(String.valueOf(o));
    }

    private static void simpleCode() {
        var list = List.of(1, 2.0, "3");
        ArrayList<Integer> intList = new ArrayList<>();;
        list.forEach(i -> intList.add(parseInt(i)));
        intList.forEach(System.out::println);
    }
}
