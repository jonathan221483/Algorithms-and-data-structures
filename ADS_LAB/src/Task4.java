import java.util.Scanner;

public class Task4  {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input the number
        System.out.printf(String.valueOf(factorialOf(n))); //print the return of the function

    }

    /**
     * function finds factorial of the number
     * @param number the number that you need to find factorial
     * @return returns 1 if number is prime and 0 if its composite
     */
    public static int factorialOf(int number) { //function that finds factorial of the number
        if(number==0){ //stop the function if number reaches 0
            return 1;
        }
        else //recursive case
        {
            int factorial = factorialOf(number-1);
            factorial *= number; //multiply variable "factorial" with parameter "number" that goes from input till 1
            return factorial;
        }

    }

}
