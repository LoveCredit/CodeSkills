package codetests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SqInRectTest {

    @Test
    public void test1() {
        List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
        assertEquals(res, SqInRect.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }
}