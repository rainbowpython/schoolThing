import java.util.Scanner;
//please refer to README.md
//needs jdk 12 or higher
public class Main {
    public static void main(String[] args){
        chooseCalculator();
    }
  
  //prompts user to select from 2 calulators
    public static void chooseCalculator(){
        System.out.println("What calculator would you like to use?");
        System.out.println("1: basic calculator  2: side of a triangle ");
        Scanner scanner = new Scanner(System.in);


        switch (scanner.nextInt()){
            case 1:
            BasicCalculator basicCalculator = new BasicCalculator();
            break;
            case 2:
            TriangleCalculator triangleCalculator = new TriangleCalculator();
            break;
        }

    }
}
