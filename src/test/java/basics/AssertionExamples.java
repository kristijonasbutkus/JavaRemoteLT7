package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionExamples {

    @Test
    public void testAssertEquals() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5,5);

        //then
        assertEquals(10,result);
    }

    @Test
    public void testCalculatorSubtraction() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.substract(10, 2);
        //then
        assertEquals(8, result);
    }

    @Test
    public void testCalculatorDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(10,2);
        //then
        assertEquals(5, result);
    }

    @Test
    public void testCalculatorMultiplication() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.miltiply(10,2);
        //then
        assertEquals(20, result);
    }

    @Test
    public void testAssertTrueFalse() {
        //given
        int firstNum = 5;
        int secondNum = 15;

        //when
        boolean condition = firstNum == secondNum;

        //then
        Assertions.assertTrue(firstNum != secondNum);
        Assertions.assertFalse(condition);
    }

    @Test
    public void testAssertNulOrNotNull() {
        //given
        String emptyString = null;
        String text = "sekmadienis";

        //when

        //then
        Assertions.assertNull(emptyString);
        Assertions.assertNotNull(text);
    }

    @Test
    public void testArrayEquals() {
        //given
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        //when

        //then
        Assertions.assertArrayEquals(firstArray,secondArray);
    }

    @Test
    public void testSameOrNotSame () {
        //given
        String text1 = "abc";                       //string pool
        String text2 = "abc";                       //string pool
        String text3 = new String("abc");   // HEAP'e
        //when

        //then
        Assertions.assertSame(text1,text2);
        Assertions.assertNotSame(text1,text3);
    }
}
