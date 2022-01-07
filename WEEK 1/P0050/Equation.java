/*
 * Nguyen Phuoc Tung - de160250
 */
package P0050;
import java.util.ArrayList;

public class Equation{
    protected float a,b,x1;
    ArrayList<Float> oddList= new ArrayList<>();
    ArrayList<Float> evenList= new ArrayList<>();
    ArrayList<Float> squareList = new ArrayList<>();

    public Equation() {
    }

    public Equation(float a, float b, float x1) {
        this.a = a;
        this.b = b;
        this.x1 = x1;
    }
    
    public void enterEquation(){
        //enter A
        System.out.println("Enter A:");
        a= Validation.checkInputfloat();
        //enter B
        System.out.println("Enter B:");
        b= Validation.checkInputfloat();
    }
    //solve superlative
    public void calcutlateEquation(){
        System.out.print("Solution: ");
        // if a == 0 and b !=0 -> no solution
        //if a ==0 and b==0 -> infinitily many solution
        //if a!=0 x= -b/a
        if(a==0){
           if(b!=0) System.out.println("No solution");
           else System.out.println("Infinitily manny solutions");
        }else {
            this.x1 = (-b)/a;
            System.out.println("x = "+ x1);
        }   
    }
    
    public void checkOddEvenSquare(){

        
        //check for a
        if(a%2==0) evenList.add(a);
        if (a%2==1) oddList.add(a);
        if(Validation.checkPerfectSquare(a)) squareList.add(a);
        
        //check for b
        if(b%2==0) evenList.add(b);
        if (b%2==1) oddList.add(b);
        if(Validation.checkPerfectSquare(b)) squareList.add(b);
        
 } 
    public void printOddEvenSquare(){
        //print odd number
        System.out.print("Number is Odd: ");
        for(float i: oddList){
            System.out.print(i+ ", ");
        }
        //print even number
        System.out.print("\nNumber is Even:");
        for(float i: evenList){
            System.out.print(i+", ");
        }
        //print perfect square number
        System.out.print("\nNumber is PerfectSquare:");
        for (float i: squareList){
            System.out.print(i+", ");
        }
        //xoa cac phan tu trong cac list co phep tinh tiep theo
        oddList.clear();
        evenList.clear();
        squareList.clear();

    }
}
