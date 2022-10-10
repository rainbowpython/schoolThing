import java.util.Scanner;
/* main notes
Due to long dinner, and not so good planning, I was unable to code this to its fullest
I would have liked to have implemented

 */
public class BasicCalculator {
    public BasicCalculator(){
        boolean running = true;

        while (running == true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is the first value?");
            double firstNumber = scanner.nextDouble();


            System.out.println("next number?");
            double secondNumber = scanner.nextDouble();

            System.out.println("what operator?\n1: +  2: *  3: -  4: / 5: %");
            String operator = scanner.next();

            switch (operator) {
                case "+", "1" -> System.out.println(firstNumber + secondNumber);
                case "*", "2" -> System.out.println(firstNumber * secondNumber);
                case "-", "3" -> System.out.println(firstNumber - secondNumber);
                case "/", "4" -> System.out.println(firstNumber / secondNumber);
                case "%", "5" -> System.out.println(firstNumber % secondNumber);
                default -> throw new RuntimeException("Error: not a recognizable operation");
            }
            
            System.out.println("what would you like to do next?");
            System.out.println("1: restart  2: choose new calculator  3: exit");


            //made a for loop to meet a requirement
            if (scanner.nextInt() == 1) {

            } else if (scanner.nextInt() == 2) {
                Calculators.chooseCalculator();
            }else {
                running = false;
            }

        }


    }
    public boolean aBoolean(Boolean boo){
        if (boo ==true){return true;}
        else if(boo==false) {return false;}

        return false;
        }
    }

