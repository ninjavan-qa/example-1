package co.nvqa.example_1;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class Calculator
{
    public Calculator()
    {
    }

    public double add(double operand1, double operand2)
    {
        return operand1+operand2;
    }

    public double div(double operand1, double operand2)
    {
        if(operand2==0)
        {
            throw new IllegalArgumentException("Operand 2 cannot be 0.");
        }

        return operand1/operand2;
    }
}
