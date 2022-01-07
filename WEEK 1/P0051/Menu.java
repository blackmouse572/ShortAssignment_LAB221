package P0051;

/*
@Author: Hoai Linh
*/

public class Menu {
    public static int getChoice() {
        System.out.println("\n======== Calculator program ==========");
        System.out.println("1.Normal Calculator");
        System.out.println("2.BMI Calculator");
        System.out.println("3.Exit");
        System.out.print("Your choice: ");
        return Validation.checkInputIntLimit(1, 3);
    }
}
