package cleancode;

import java.util.*;

/**
 * Don´t Repeat Yourself (DRY)
 * Lesson: If LOC > 1 : Extract method of duplicate code
 */
public class DRY {

    static Collection<Integer> c;
    static Vector<Integer> v;

    public static void main(String[] args) {
        methodWithDuplicateCode();
        duplicatingMethod();
        //-----------------Clean Code DRY-----------------\\
        methodWithoutDuplicateCode();
        differentMethod();
    }

    public static void methodWithDuplicateCode() {
        v = new Vector<>();
        c = new HashSet<Integer>();
        c.add(1);
        c.add(2);
        v.addAll(c);
        for (Enumeration<Integer> e = v.elements(); e.hasMoreElements();)
            System.out.println(e.nextElement());
        System.out.println();
    }

    public static void duplicatingMethod() {
        v = new Vector<>();
        c = new HashSet<Integer>();
        c.add(1);
        c.add(2);
        v.addAll(c);
        for (int i: c)
            System.out.println(i + v.get(i % 2));
        System.out.println();
    }

    //-----------------Clean Code DRY-----------------\\

    public static void methodWithoutDuplicateCode() {
        extractedCodeDRY();
        for (Enumeration<Integer> e = v.elements(); e.hasMoreElements();)
            System.out.println(e.nextElement());
        System.out.println();
    }

    public static void differentMethod() {
        extractedCodeDRY();
        for (int i: c)
            System.out.println(i + v.get(i % 2));
        System.out.println();
    }

    public static void extractedCodeDRY() {
        v = new Vector<>();
        c = new HashSet<Integer>();
        c.add(1);
        c.add(2);
        v.addAll(c);
    }
}
