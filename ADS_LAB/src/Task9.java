import java.util.Scanner;

public class Task9 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input n
        int k = scan.nextInt(); //input k
        System.out.printf(Integer.toString(binomialFormula(n, k)));
    }

    /**
     * fuction finds factorial and its created to not interrupt recursion in binomial formula
     * @param n number to find its factorial
     * @return factorial
     */
    public static int factorial(int n) {
        if(n==0)
            return 1;
        else{
            int result = factorial(n-1);
            result *= n;
            return result;
        }
    }

    /**
     * finds result of the binomial formula
     * @param n lower part of the formula
     * @param k upper part of the formula
     * @return result of the binomial formula
     */
    public static int binomialFormula(int n, int k) {
        return factorial(n) / (factorial(n-k)*factorial(k));
    }
}
