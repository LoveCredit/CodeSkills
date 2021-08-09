package cleancode;

/**
 * Favour Composition over Inheritance (FCoI)
 * Lesson: Prior to using inheritance, use composition because inheritance makes exchangability harder.
 * Using composition nurtures decoupling.
 *
 * Task: Create an example where composition is better than inheritance.
 * Solution: Based on given classes exchanging a composition part is easier than a parent class
 */
public class FCoI {

    public static void main(String[] args) {
        Composition composition = new Composition("composition value");
        composition.outputValue();

        InheritanceMain inheritanceMain = new InheritanceMain("inheritance value");
        inheritanceMain.outputValue();

        //compositionPartImpl does not use any part of Composition
        CompositionPartImpl compositionPartImpl = new CompositionPartImpl("compositionPartImpl value");
        compositionPartImpl.outputValue();

        //inheritanceSub uses parent class variable value for outputValue()
        InheritanceSub inheritanceSub = new InheritanceSub("inheritanceSub value");
        inheritanceSub.outputValue();
    }
}

/**
 * In class Composition you may exchange CompositionPartImpl() with any other Implementation.
 * Thus enabling decoupling.
 */
class Composition {

    CompositionPart compositionPart;

    public Composition (String s) {
        compositionPart = new CompositionPartImpl(s);
    }

    void outputValue() {
        compositionPart.outputValue();
    }
}

interface CompositionPart {
    void outputValue();
}

class CompositionPartImpl implements CompositionPart {
    String value;

    CompositionPartImpl(String s) {
        value = s;
    }

    @Override
    public void outputValue() {
        System.out.println(value);
    }
}

/**
 * In class InheritanceMain you must keep String value and void outputValue() to keep its subclass intact.
 */
class InheritanceMain {
    String value;

    public InheritanceMain(String s) {
        value = s;
    }

    void outputValue() {
        System.out.println(value);
    }
}

class InheritanceSub extends InheritanceMain {

    public InheritanceSub(String s) {
        super(s);
    }

    @Override
    void outputValue() {
        additionalTask();
        System.out.println(value);
    }

    private void additionalTask() {
        //do sth
    }
}