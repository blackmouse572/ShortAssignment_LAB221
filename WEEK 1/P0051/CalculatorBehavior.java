package P0051;
/*
Author: @Hoai Linh
*/

public class CalculatorBehavior {

    // method call normal Cal
    public static void normalCalculator()
    {
        Calculator cal = new Calculator();

        cal.setNumA();


        // Continue calculate
        boolean on_going = true;
        while (on_going) {

            double a = cal.getNumA();
            cal.setOperator();
            char operator = cal.getOperator();


            // Stop when user hit '='
            if (operator == '=') {
                System.out.println("Result: " + a);
                on_going = false;
            } else {
                cal.setNumB();
                double b = cal.getNumB();

                double result = cal.Calculate(a, operator, b);
                System.out.println("Result: " + result);
            }
        }
    }

    // method call BMI Cal
    public static void BMICalculator()
    {
        BMI bmi = new BMI();

        bmi.setWeight();
        bmi.setHeight();
        System.out.println("BMI Status: " + bmi.getStatus());
    }
}
