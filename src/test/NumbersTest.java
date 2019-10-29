package test;

import io.turtabl.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    public void negOneisPositive(){
        boolean number = Numbers.isPositive(-1);
        assertFalse(number);
    }

    @Test
    public void oneIsPositive(){
        boolean number = Numbers.isPositive(1);
        assertTrue(number);
    }

    @Test
    public void thirtyIsPositive(){
        boolean number = Numbers.isPositive(30);
        assertTrue(number);
    }

    @Test
    public void twoisEven(){
        boolean number = Numbers.isEvenOrGreaterThanZero(2);
        assertTrue(number);
    }

    @Test
    public void oneIsNotEven() {
        boolean number = Numbers.isEvenOrGreaterThanZero(1);
        assertFalse(number);
    }

    @Test
    public void zeroIsNotEven(){
        boolean number = Numbers.isEvenOrGreaterThanZero(0);
        assertFalse(number);
    }

    @Test
    public void sumTwoPositiveNumbers(){
        int sum = Numbers.sum(1,2);
        assertEquals(3,sum);
    }

    @Test
    public void sumTwoNegativeNumbers(){
        int sum = Numbers.sum(-1,-4);
        assertEquals(-5, sum);
    }
}