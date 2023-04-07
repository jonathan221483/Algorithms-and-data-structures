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
     * @param array array with numbers
     * @param i index of the array
     * @return average of all numbers in array
     */
    public static int isPrime(int number, int i) {
        if(i==1){ //stop the function if index reaches the final element of the array
            return 1;
        }
        else //recursive case
        {
            int prime = 1;
            prime *= isPrime(number,i-1);
            if(number % i == 0)
            {
                return 0;
            }
            return prime;
        }

    }

}
