import java.util.Scanner;

public class Task7 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input size of array
        String numbers = scan.next();
        System.out.printf(reverseArray(numbers.trim(),n-1)); //print the return of the function
    }
    public static String reverseArray(String numbers, int length) {
        if(length==0){ //stop the function if index reaches the final element of the array
            return "";
        }
        else //recursive case
        {
            String reverse = reverseArray(numbers,length-1);
            reverse += numbers.charAt(numbers.length()-length) + " ";
            return reverse;
        }
    }
}
