package codetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecomposeTest {



    @Test
    public void test1() {
        Decompose d = new Decompose();
        assertEquals("1 2 4 10",  d.decompose(11));
        assertEquals("1 3 5 6 11 157 12420",  d.decompose(12421));
    }
}