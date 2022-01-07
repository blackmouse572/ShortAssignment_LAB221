/*
 * Nguyen Phuoc Tung - de160250
 */
package P0050;


public class QuadraticEquation extends Equation{
    private float c,x2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(float c, float x2, float a, float b, float x1) {
        super(a, b, x1);
        this.c = c;
        this.x2 = x2;
    }
    
    public void calculateQuadraticEquation(){
        //if a=0 solve it like superlative equation
        if(a==0){
            this.a=this.b;
            this.b=this.c;
            super.calcutlateEquation();
        }else{          //if a !=0 solve it with denta
            System.out.print("Solution: ");
            float denta = b * b - 4 * a * c;
  
        // check if denta is greater than 0
        if (denta > 0) {
  
            this.x1 = (-b + (float)Math.sqrt(denta)) / (2 * a);
            this.x2 = (-b - (float)Math.sqrt(denta)) / (2 * a);
  
            System.out.println("x1= "+x1+" and x2= "+x2);
        }
  
        // check if determinant is equal to 0
        else if (denta == 0) {
  
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            x1=x2=-b / (2 * a);
  
            System.out.println("x1 = x2 = "+x1);
        }else System.out.println("No solution");
        }
    }
    @Override
    public void enterEquation() {
        super.enterEquation();
        //enter c
        System.out.println("Enter C:");
        this.c = Validation.checkInputfloat();
    }


    @Override
    public void checkOddEvenSquare() {
        super.checkOddEvenSquare();

        //check for c
        if(c%2==0) evenList.add(c);
        if (c%2==1) oddList.add(c);
        if(Validation.checkPerfectSquare(c)) squareList.add(c);
        
    }
    
    
}
