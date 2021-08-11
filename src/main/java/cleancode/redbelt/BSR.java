package cleancode.redbelt;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Boy Scout Rule (BSR)
 * Lesson: Do small improvements each time.
 */
public class BSR {

    void initialCode() {
        asList(1, 2, 3).forEach(x -> System.out.println(x));
    }

    public void enhancedCode() {
        List<Integer> list = asList(1, 2, 3);
        list.forEach(System.out::println);
    }
}
