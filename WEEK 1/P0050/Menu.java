/*
 * Nguyen Phuoc Tung - de160250
 */
package P0050;
/**
 *
 * @author Admin
 */
public class Menu {
    public static int userChoice(){
        System.out.println("\n========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.println("Please choice one option:");
        int userChoice = Validation.checkInputIntLimit(1, 3);
        return userChoice;
    }
}
