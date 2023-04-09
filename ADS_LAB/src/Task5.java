import java.util.Scanner;

public class Task5  {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input the number
        System.out.printf(String.valueOf(fibbonacci(n,1))); //print the return of the function
    }


    public static int fibbonacci(int number,int i) { //function that finds factorial of the number
        if(number==0) //stop the function if number reaches 0
            return 0;
        else if(number==1)
            return 1;
        else //recursive case
        {
            int result = fibbonacci(number-1,i) + i;
            i = result;
            System.out.printf(String.valueOf(result));
            //result += number; //multiply variable "re" with parameter "number" that goes from input till 1
            return result;
        }
    }
}
