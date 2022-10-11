import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TriangleCalculator {
    public TriangleCalculator(){
        boolean running = true;

        while (running){
            Scanner scanner = new Scanner(System.in);

            System.out.println("What side of a triangle would you like to calculate\n1: A  2: B  3: C");
            int side = scanner.nextInt();
            switch(side){
              case 1->calculateA(scanner);
              case 2->calculateB(scanner);
              case 3->calculateC(scanner);

          }
            System.out.println("what would you like to do next\n1: restart  2: choose new calculator  3: exit");
            //made a for loop to meet a requirement
            //if one is entered, will go back to the start of the basicCalculator
            //if 2 is entered, it will go back to choosing calcualtor prompt
            //if 3 is chosen, application will terminate

            int restart = scanner.nextInt();
            if (restart == 1) {

            } else if (restart == 2) {
                Main.chooseCalculator();
            }else {
                running = false;
            }
        }
    }
    //each of these methods calculate respective sides
    public void calculateA(Scanner scanner){
      //asks for one side
        System.out.println("Enter B (side)");
        double B = scanner.nextDouble();
      //asks for another side
        System.out.println("Enter C (hypotenuse)");
        double C = scanner.nextDouble();

      //uses valutes in equation to print answer
        double result = sqrt(C*C - B*B);
        if(result == 0){
            throw new RuntimeException("invalid inputs");
        }
        System.out.println("Your result is " + result);
    }

    public void calculateB(Scanner scanner){
        System.out.println("Enter A (side)");
        double A = scanner.nextDouble();

        System.out.println("Enter C (hypotenuse)");
        double C = scanner.nextDouble();
      
        double result = sqrt(C*C - A*A);
        if(result == 0){
            throw new RuntimeException("invalid inputs");
        }
        System.out.println("Your result is " + result);
    }

    public void calculateC(Scanner scanner){
        System.out.println("Enter A (side)");
        double A = scanner.nextDouble();

        System.out.println("Enter B (side)");
        double B = scanner.nextDouble();
      
        double result = sqrt(B*B + A*A);
        if(result == 0){
            throw new RuntimeException("invalid inputs");
        }
      
        System.out.println("Your result is " + result);
    }
}
