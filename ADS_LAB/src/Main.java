import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //initialize Scanner for input from keyboard
        int n = scan.nextInt(); //input task number
        switch (n){
            case 1: Task1.main();
            case 2: Task2.main();
            case 3: Task3.main();
            case 4: Task4.main();
            case 5: Task5.main();
            case 6: Task6.main();
            case 7: Task7.main();
            case 8: Task8.main();
            case 9: Task9.main();
            case 10: Task10.main();
            default: System.out.printf("Invalid number or doesn't exist");



    }
}
}