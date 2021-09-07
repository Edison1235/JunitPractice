package hk.itcast.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println(result);

        assertEquals(3, result);
    }
}