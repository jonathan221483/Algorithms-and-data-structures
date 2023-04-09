import java.util.Scanner;

public class Task6  {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input the number
        int power = scan.nextInt(); //input the power degree
        System.out.printf(String.valueOf(powerOf(n,power))); //print the return of the function
    }

    /**
     * function finds particular power of the number
     * @param number the number
     * @param power the power of the number
     * @return the resulting number in a given power
     */
    public static int powerOf(int number,int power) {
        if(power==0) //stop the function if number reaches 0 (base case)
            return 1;
        else //recursive case
        {
            int result = powerOf(number,power-1);
            result*=number;//multiply number by itself "power" times
            return result;
        }
    }
}
