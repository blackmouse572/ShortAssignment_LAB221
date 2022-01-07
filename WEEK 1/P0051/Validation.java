package P0051;

import java.util.Scanner;

public class Validation {

    static Scanner sc = new Scanner(System.in);

    // Check if a string is empty
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.err.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    // Check if user input is in allow numbers
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check user input for Number
    public static double checkInputNumber() {
        while (true) {
            double result;
            try {
                String input = checkInputString();

                result = Double.parseDouble(input);
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check user input is an Operator
    public static char checkInputOperator(){
        while (true){
            char result = sc.nextLine().charAt(0);
            // Check if result is an operator
            if (result != '+' && result != '-' && result != '/' && result != '*' && result != '^' && result != '='){
                System.err.println("Please input (+, -, *, /, ^)");
                System.err.println("Enter again: ");
            }
            else
            {
                return result;
            }
        }
    }

}
