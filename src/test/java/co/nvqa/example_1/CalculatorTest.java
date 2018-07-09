package co.nvqa.example_1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class CalculatorTest
{
    @Test
    public void add()
    {
        Calculator calculator = new Calculator();
        double expectedResult = 30;
        double actualResult = calculator.add(10, 20);
        Assert.assertEquals("Result is incorrect.", expectedResult, actualResult, 0);
    }

    @Test
    public void div()
    {
        Calculator calculator = new Calculator();
        double expectedResult = 2;
        double actualResult = calculator.div(20, 10);
        Assert.assertEquals("Result is incorrect.", expectedResult, actualResult, 0);
    }
}