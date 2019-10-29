package test;

import io.turtabl.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    public void negOneisPositive(){
        //boolean number = ;
        assertFalse(Numbers.isPositive(-1));
    }

}