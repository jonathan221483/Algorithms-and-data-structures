import java.util.Scanner;

public class Task3  {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input size of array
        if(isPrime(n,n-1)==1)
            System.out.printf("Prime"); //print the return of the function
        else
            System.out.printf("Composite"); //print the return of the function

    }

    /**
     *
     * @param number the number that you need to check if its prime
     * @param i counter that decreases and checks number for division
     * @return returns 1 if number is prime and 0 if its composite
     */
    public static int isPrime(int number, int i) { //function checks whether the number is prime or not
        if(i==1){ //stop the function if index reaches the final element of the array
            return 1;
        }
        else //recursive case
        {
            int prime = 1;
            prime *= isPrime(number,i-1); //multiplication works just like AND operator in boolean logic
            if(number % i == 0) //check for the division remainder
            {
                return 0;
            }
            return prime;
        }

    }

}
