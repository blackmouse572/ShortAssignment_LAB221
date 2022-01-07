/*
 * Nguyen Phuoc Tung - de160250
 */
package P0050;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        while (true) {            
            switch(Menu.userChoice()){
                case 1: 
                    Equation equation=new Equation();
                    System.out.println("----- Calculate Superlative Equation -----");
                    equation.enterEquation();
                    equation.checkOddEvenSquare();
                    equation.calcutlateEquation();
                    equation.printOddEvenSquare();
                    
                    break;
                case 2:
                    QuadraticEquation quadraticEquation= new QuadraticEquation();
                    System.out.println("----- Calculate Quadratic Equation -----");
                    quadraticEquation.enterEquation();
                    quadraticEquation.checkOddEvenSquare();
                    quadraticEquation.calculateQuadraticEquation();
                    quadraticEquation.printOddEvenSquare();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
