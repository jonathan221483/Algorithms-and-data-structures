import com.sun.jdi.Value;

import java.util.Scanner;

public class Task8 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        String line = scan.next(); //input line to check for numbers and characters
        if(checkDigits(line, line.length()-1))
            System.out.printf("Yes"); //print the return of the function
        else
            System.out.printf("No");
    }

    /**
     * function checks whether given line has letters in it
     * @param line the line to be checked
     * @param i index of elements in line
     * @return boolean value true if there are no letters, false if there are letters
     */
    public static boolean checkDigits(String line, int i) {
        if(i==0){ //stop the function if index reaches the final element of the array
            return Character.isDigit(line.charAt(i));
        }
        else //recursive case
        {
            boolean check = checkDigits(line,i-1);
            if(!Character.isDigit(line.charAt(i))) //isDigit() checks every element in string
            {
                check = false;
            }
            return check;
        }
    }
}
