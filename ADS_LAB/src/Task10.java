import java.util.Scanner;

public class Task10 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int a = scan.nextInt(); //input first number
        int b = scan.nextInt(); //input second number
        System.out.printf(Integer.toString(findGCD(a, b , a+b))); // divider is a+b as it doesn't matter, it will decrease to needed value
    }

    /**
     * function finds greatest common divider
     * @param a first number
     * @param b second number
     * @param divider used to divide numbers by it
     * @return greatest common divider
     */
    public static int findGCD(int a, int b, int divider) {
        if (a % divider == 0 && b % divider == 0) //check the division using Eucledian algorithm
            return divider;
        else
            return findGCD(a,b,divider-1); //if numbers are not divisible then decrease divider by one and repeat the process
    }
}

