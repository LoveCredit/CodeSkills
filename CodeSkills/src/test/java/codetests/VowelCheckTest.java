package codetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCheckTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "asdioqfiofmnw";
        System.out.println("input: "+input);
        assertEquals(5, VowelCheck.vowelCheck(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "asdioqfiofmnw";
        System.out.println("input: "+input);
        assertEquals(5, VowelCheck.vowelCheck(input));
    }
}