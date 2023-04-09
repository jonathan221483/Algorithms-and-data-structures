import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input size of array
        int[] array = new int[n]; //initialize new array
        for(int i=0; i<n; i++){ //input array by user
            array[i]=scan.nextInt();
        }
        int minimum = array[0];
        System.out.printf(String.valueOf(findMin(array,minimum,1))); //print the return of the function
    }

    /**
     * fuction finds minimum value from array
     * @param array array with numbers
     * @param minimum the minimum value
     * @param i index of the array
     * @return final minimum value
     */
    public static int findMin(int[] array, int minimum, int i) {
        if(array[i]<minimum){ //check if the element of array is smaller than minimum value
            minimum=array[i];
        }
        i++; //increase variable i to go to the next element of array
        if(i==array.length){ //stop the function if index reaches the final element of the array
            return minimum;
        }
        else //call the function again
            return findMin(array,minimum,i);
    }

}
