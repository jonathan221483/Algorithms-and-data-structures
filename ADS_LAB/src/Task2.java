import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input size of array
        int[] array = new int[n]; //initialize new array
        for(int i=0; i<n; i++){ //input array by user
            array[i]=scan.nextInt();
        }
        System.out.printf(String.valueOf(findAverage(array,n))); //print the return of the function
    }

    /**
     * fuction finds average value in array
     * @param array array with numbers
     * @param i index of the array
     * @return average of all numbers in array
     */
    public static double findAverage(int[] array, int i) {
        if(i==0){ //stop the function if index reaches the final element of the array
            return 0;
        }
        else //recursive case
        {
            double sum = findAverage(array,i-1) * (i-1); //recursive formula, we must multiply it to i-1 in order to avoid errors in final answer
            sum+=array[i-1];
            return sum / i;
        }

    }

}
