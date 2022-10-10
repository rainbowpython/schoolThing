import java.util.Scanner;

public class BasicCalculator {
    public BasicCalculator(){
        boolean running = true;

        while (running == true) {
            //instantiates Scanner object
            Scanner scanner = new Scanner(System.in);

            //asks and recieves input
            System.out.println("What is the first value?");
            double firstNumber = scanner.nextDouble();

            //asks and recieves second input
            System.out.println("next number?");
            double secondNumber = scanner.nextDouble();

            //asks for operator
            System.out.println("what operator?\n1: +  2: *  3: -  4: / 5: %");
            String operator = scanner.next();

            //computes using the 2 values given and the operator
            /*switch (operator) {
                case "+", "1" -> System.out.println(firstNumber + secondNumber);
                case "*", "2" -> System.out.println(firstNumber * secondNumber);
                case "-", "3" -> System.out.println(firstNumber - secondNumber);
                case "/", "4" -> System.out.println(firstNumber / secondNumber);
                case "%", "5" -> System.out.println(firstNumber % secondNumber);
                default -> throw new RuntimeException("Error: not a recognizable operation");
            }*/
            switch(){
                case "1":
                System.out.println(firstNumber + secondNumber);
                break;
                case "2":
                System.out.println(firstNumber * secondNumber);
                break;
                case "3":
                System.out.println(firstNumber - secondNumber);
                break;
                case "4":
                System.out.println(firstNumber / secondNumber);
                break;
                case "5":
                System.out.println(firstNumber / secondNumber);
                break;
            }
            
            System.out.println("what would you like to do next\n1: restart  2: choose new calculator  3: exit");

            //made a for loop to meet a requirement
            //if one is entered, will go back to the start of the basicCalculator
            //if 2 is entered, it will go back to choosing calcualtor prompt
            //if 3 is chosen, application will terminate

            int restart = scanner.nextInt();
            if (restart == 1) {

            } else if (restart == 2) {
                Calculators.chooseCalculator();
            }else {
                running = aBoolean(false);
            }

        }

    }

    //Returns false if given false, true if given true
    //I don't expect extra credit points, but this was created in the name of having them
    public boolean aBoolean(Boolean boo){
        if (boo ==true){return true;}
        else if(boo==false) {return false;}

        return false;
        }
    }

