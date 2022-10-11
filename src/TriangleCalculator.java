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


          }
          

        }

    }
    public void calculateA(Scanner scanner){
        System.out.println("Enter B (side)");
        double B = scanner.nextDouble();

        System.out.println("Enter C (hypotenuse)");
        double C = scanner.nextDouble();
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
