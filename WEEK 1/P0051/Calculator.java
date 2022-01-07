package P0051;

import static java.lang.Math.pow;

public class Calculator {
    private double numA, numB;
    private char operator;


    public Calculator(){
        System.out.println("\n----- Normal Calculator -----");
    }

    // Get and set methods
    public void setNumA(){
        System.out.print("Enter number: ");
        this.numA = Validation.checkInputNumber();
    }

    public void setNumB(){
        System.out.print("Enter number: ");
        this.numB = Validation.checkInputNumber();
    }

    public void setOperator(){
        System.out.print("Enter Operator: ");
        this.operator = Validation.checkInputOperator();
    }
    public double getNumA(){
        return this.numA;
    }
    public double getNumB(){
        return this.numB;
    }
    public char getOperator(){
        return this.operator;
    }


    public double Calculate(double a, char operator, double b){

        double result = 0;
        switch (operator){
            case '+':
                result = a + b;
                this.numA = result;
                break;
            case '-':
                result = a - b;
                this.numA = result;
                break;
            case '/':
                // catch where divided case 0
                try {
                    if (b == 0){
                        throw new ArithmeticException();
                    }
                    else {
                        result = a / b;
                        this.numA = result;
                    }
                }
                catch (ArithmeticException e){
                    System.err.println("Can not divided by 0");
                }
                break;
            case '*':
                result = a * b;
                this.numA = result;
                break;
            case '^':
                try {
                    if (b < 0 ){
                        throw new ArithmeticException();
                    }
                    else {
                        result = (float) pow(a, b);
                        this.numA = result;
                    }
                }
                catch (ArithmeticException e){
                    System.err.println("Can not power to a negative number");
                }
                break;
            case '=':
                result = a;
                this.numA = result;
        }
        return result;
    }

}
