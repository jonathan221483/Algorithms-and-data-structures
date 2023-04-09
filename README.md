# Algorithms-and-data-structures
# Laboratory 1
## Task 1
You are given a number “n” and an array of “n” elements, 
write the function that returns minimum of them.

### Solution

```
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
```

## Task 2
You are given a number “n” and an array of “n” elements, 
write the function that returns average of them. 

### Solution

```
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
```

## Task 3
You are given a number “n”, write the function for checking 
whether“n” is prime.

### Solution

```
public static int isPrime(int number, int i) {
        if(i==1){ //stop the function if index reaches the final element of the array
            return 1;
        }
        else //recursive case
        {
            int prime = 1;
            prime *= isPrime(number,i-1); //multiplication works just like AND operator in boolean logic
            if(number % i == 0) //check for the division remainder
            {
                return 0;
            }
            return prime;
        }
    }
```

## Task 4
You are given a number “n”, write the program using recursion for
finding “n!”

### Solution

```
public static int factorialOf(int number) { //function that finds factorial of the number
        if(number==0){ //stop the function if number reaches 0
            return 1;
        }
        else //recursive case
        {
            int factorial = factorialOf(number-1);
            factorial *= number; //multiply variable "factorial" with parameter "number" that goes from input till 1
            return factorial;
        }
    }
```

## Task 5
You are given a number “n”, write the function for finding n-th
elements in Fibonacci sequence using recursion.

### Solution

```
public static int fibbonacci(int n, int k, int i) {
        if(n==1) //stop the function if number reaches 0
            return i;
        else //recursive case
            return fibbonacci(n-1, i, i + k); //always sums previous two elements
    }
```

## Task 6
You are given numbers “a” and “n”, write the function that 
returns “a^n”.

### Solution

```
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
```

## Task 7
You are given a number “n” and an array of “n” elements, 
write the program that returns given array in reverse order 
without using array data structure.

### Solution

```
public static String reverseArray(String numbers, int length) {
        if(length==0){ //stop the function if index reaches the final element of the array
            return "";
        }
        else //recursive case
        {
            String reverse = reverseArray(numbers,length-1);
            reverse += numbers.charAt(numbers.length()-length) + " "; //numbers put in the end of the string
            return reverse;
        }
    }
```

## Task 8
You are given a string “s”, write the function for checking 
whether “s” is all consists of digits.

### Solution

```
public static boolean checkDigits(String line, int i) {
        if(i==0){ //stop the function if index reaches the final element of the String
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
```

## Task 9
You are given numbers“n” and “k”,write the program that 
finds binomial coefficient.

### Solution

```
public static int factorial(int n) {
        if(n==0)
            return 1;
        else{
            int result = factorial(n-1);
            result *= n;
            return result;
        }
    }
    
public static int binomialFormula(int n, int k) {
        return factorial(n) / (factorial(n-k)*factorial(k));
    }
```

## Task 10
You are given “a” and “b”, write the function for finding 
GCD(a, b) using recursion. (Hint: Euclidean Algorithm)

### Solution

```
public static int findGCD(int a, int b, int divider) {
        if (a % divider == 0 && b % divider == 0) //check the division using Eucledian algorithm
            return divider;
        else
            return findGCD(a,b,divider-1); //if numbers are not divisible then decrease divider by one and repeat the process
    }
```
