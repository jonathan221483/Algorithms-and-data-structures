import java.util.Scanner;

public class Task5  {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input the number
        System.out.printf(String.valueOf(fibbonacci(n,0 , 1))); //print the return of the function
    }

    /**
     * function finds n-th element of fibbonacci series
     * @param n the index of the element of fibbonacci series
     * @param i counter
     * @return n-th element of fibbonacci series
     */
    public static int fibbonacci(int n, int k, int i) {
        if(n==1) //stop the function if number reaches 0
            return i;
        else //recursive case
            return fibbonacci(n-1, i, i + k); //always sums previous two elements
    }
}
