import java.util.Scanner;
//please refer to README.md
//will NOT work with java 8
//PLEASE USE REPLIT
public class Calculators {
    public static void main(String[] args){
        chooseCalculator();
    }


    public static void chooseCalculator(){
        System.out.println("What calculator would you like to use?");
        System.out.println("1: basic calculator  2: side of a triangle ");
        Scanner scanner = new Scanner(System.in);


        switch (scanner.nextInt()){
            case 1 ->BasicCalculator basicCalculator = new BasicCalculator();
            case 2 ->TriangleCalculator triangleCalculator = new TriangleCalculator();
        }

    }
}
