package codetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class XbonacciTest {

    private double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, Xbonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, Xbonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, Xbonacci.tribonacci(new double []{0,1,1},10), precision);
    }
}