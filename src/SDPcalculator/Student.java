package SDPcalculator;

public class Student
{

    public static void main(String[] args)
    {
        Calculator operation = new Calculator(new AddOperator());
        operation.Calculate(30, 10);

        operation = new Calculator(new SubtractOperator());
        operation.Calculate(40, 10);

        operation = new Calculator(new MultiplicationOperator());
        operation.Calculate(50, 10);

        operation = new Calculator(new DivisionOperator());
        operation.Calculate(60, 10);
    }
}
