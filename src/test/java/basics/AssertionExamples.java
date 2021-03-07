package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {

    @Test
    public void testAssertEquals() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5,5);

        //then
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testCalculatorSubtraction() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.substract(14, 2);
        //then
        Assertions.assertEquals(13, result);
    }

    @Test
    public void testCalculatorDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(10,2);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testCalculatorMultiplication() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.miltiply(10,2);
        //then
        Assertions.assertEquals(20, result);
    }
}
