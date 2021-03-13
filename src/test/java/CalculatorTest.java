import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void testsqrt(){
        assertEquals("Square root of positive integer", 10, calculator.sqrt(100),DELTA);
        assertEquals("Square root of positive integer", 10, calculator.sqrt(100),DELTA); //for decimal
        assertEquals("Square root of negative integer", -1, calculator.sqrt(-4), DELTA);
    }
    @Test
    public void testlog(){
        assertEquals("Log of positive number", 2.302585092994046, calculator.log(10), DELTA);
        assertEquals("Log of negative number", -1, calculator.log(-9), DELTA);
        assertEquals("Log of 0", -1, calculator.log(0), DELTA);
    }
    @Test
    public void testpow(){
        assertEquals("Power of a and b where a and b are positive", 81, calculator.pow(3,4), DELTA);
        assertEquals("Power of a and b where a and b are negetive", 0.25, calculator.pow(-2,-2), DELTA);
        assertEquals("Power of a and b where a is negative and b is positive", 81, calculator.pow(-3,4), DELTA);
        assertEquals("Power of a and b where a is positive and b is negetive", 0.25, calculator.pow(2,-2), DELTA);
        assertEquals("Log of negative number", -1, calculator.log(-9), DELTA);
    }
    @Test
    public void testfact(){
        assertEquals("Fatorial of a where a is positive", 120, calculator.fact(5), DELTA);
        assertEquals("Fatorial of a where a is positive", 1, calculator.fact(0), DELTA);
        assertEquals("Fatorial of a where a is negative", -1, calculator.fact(-23), DELTA);
        assertEquals("Fatorial of a where a is positive", 1, calculator.fact(1), DELTA);
        assertEquals("Fatorial of a where a is positive", 39916800, calculator.fact(11), DELTA);
       
    }
}
