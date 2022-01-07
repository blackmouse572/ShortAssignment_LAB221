/*
 * Nguyen Phuoc Tung - de160250
 */
package P0050;

import java.util.Scanner;


public class Validation {
    private static String testString;
    private final static Scanner scanner = new Scanner(System.in);
    
    //check user input string is null or not
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            testString = scanner.nextLine().trim();
            if (testString.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return testString;
            }
        }
    }
    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
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
    
    public static float checkInputfloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(scanner.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static boolean checkPerfectSquare(float n){
        // If ceil and floor are equal
        // the number is a perfect square
        if (Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))) return true;
        else return false;
    }   
}
