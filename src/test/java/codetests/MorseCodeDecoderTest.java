package codetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
        assertEquals(MorseCodeDecoder.decode(" . "), "E");
    }
}