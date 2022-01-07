Author: @lilinkw aka (Hoài Linh)
This is P0050 work done my Hoai Linh


Sample of a main class to call this Project:

public class Main {

    public static void main(String[] args) {

        boolean running = true;
        while (running){
            switch (Menu.getChoice()){
                case 1 ->CalculatorBehavior.normalCalculator();
                case 2->CalculatorBehavior.BMICalculator();
                case 3->running=false;
            }
        }
    }
}
