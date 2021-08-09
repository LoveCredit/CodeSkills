package cleancode;

/**
 * Integration Operation Segregation Principle (IOSP)
 * Lesson: Separation in 'operation' and 'integration' methods.
 *
 * Task: Use appropriate code to explain IOSP
 * Solution: Separate mixed method with method calls and operations.
 */
public class IOSP {

    private static final int CONSTANT = 0;

    //Before status
    private void mixedMethod() {
        int i = calledMethod();
        System.out.println(i + 1);
    }

    //After status
    private void iospMethod() {
        int i = operationMethod(calledMethod());
        System.out.println(i);
    }

    private int calledMethod() {
        //do sth
        return CONSTANT + 1;
    }

    private int operationMethod(int i) {
        return ++i;
    }


}
