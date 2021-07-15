package codetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrainLuckTest {

    @Test
    public void testEchoUntilByte255Encountered() {
        assertEquals(new BrainLuck(",+[-.,+]").process("Codewars" + ((char) 255)),  "Codewars");
    }

    @Test
    public void testEchoUntilByte0Encountered() {
        assertEquals(new BrainLuck(",[.[-],]").process("Codewars" + ((char) 0)), "Codewars");
    }

    @Test
    public void testTwoNumbersMultiplier() {
        final char[] input = {8, 9};
        assertEquals(new BrainLuck(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.")
                .process(String.valueOf(input[0]) + String.valueOf(input[1])), String.valueOf((char) (input[0] * input[1])));
    }
}