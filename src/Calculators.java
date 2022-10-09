import java.util.Scanner;

public class Calculators {
    public static void main(String[] args){
        chooseCalculator();

    }
    public static void chooseCalculator(){
        System.out.println("What calculator would you like to use?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: basic calculator  2: side of a triangle ");
        switch (scanner.nextInt()){
            case 1:
                BasicCalculator basicCalculator = new BasicCalculator();
                break;
            case 2:
                TriangleCalculator triangleCalculator = new TriangleCalculator();
        }

    }
}
