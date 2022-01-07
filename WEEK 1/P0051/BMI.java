package P0051;

import static java.lang.Math.pow;

public class BMI {
    private double weight, height;

    public BMI(){
        System.out.println("\n----- BMI Calculator -----");
    }

    // Get and Set
    public void setHeight() {
        System.out.print("Enter Height(cm): ");
        this.height = Validation.checkInputNumber();
    }
    public void setWeight() {
        System.out.print("Enter Weight(kg): ");
        this.weight = Validation.checkInputNumber();
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }


    // Return BMI status
    public String getStatus(){
        double BMI = this.weight / pow(this.height, 2) * 10000;

        if (BMI < 18.5)
        {
            return "UNDER-STANDARD";
        }
        else if (BMI < 26)
        {
            return "STANDARD";
        }
        else if (BMI < 30)
        {
            return "OVERWEIGHT";
        }
        else if (BMI < 40)
        {
            return "FAT-SHOULD LOSE WEIGHT";
        }
        else
        {
            return "VERY FAT-SHOULD LOSE WEIGHT IMMEDIATELY";
        }
    }
}


