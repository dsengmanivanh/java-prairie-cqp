package stringCalculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void addTest_Without_Number() {
        // set
        String x = "";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(0, result);

    }

    @Test
    public void addTest_With_one_Number() {
        // set
        String x = "1";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(1, result);

    }

    @Test
    public void addTest_With_two_Number() {
        // set
        String x = "1,2";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(3, result);

    }

    @Test
    public void addTest_with_three_Number() {
        // set
        String x = "1,2,3";
        StringCalculator calculator = new StringCalculator();
        // test
        int result = calculator.add(x);
        //assert
        assertEquals(6, result);
    }

    @Test
    public void addTest_with_three_Number_and_new_separator() {
        // set
        String x = "1\n2,3";
        StringCalculator calculator = new StringCalculator();
        // test
        int result = calculator.add(x);
        //assert
        assertEquals(6, result);
    }


    @Test
    public void addTest_with_three_Number_and_wrong_new_separator() {
        // set
        String x = "1,\n";
        StringCalculator calculator = new StringCalculator();
        // test
        int result = calculator.add(x);
        //assert
        assertEquals(0, result);
    }

    @Test
    public void addTest_with_Other_separator() {
        // set
        String x = "[;]1;2";
        StringCalculator calculator = new StringCalculator();
        // test
        int result = calculator.add(x);
        //assert
        assertEquals(3, result);
    }

}