import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        findNumberisPositiveNegativeOrZero(number);
        //Closing the scanner object
        scanner.close();
    }
    //Find the number is Positive Negative or Zero
    public static void findNumberisPositiveNegativeOrZero(int number){
        if (number>0){
            System.out.println(number +  " is a POSITIVE NUMBER");
                    }else if (number<0){
            System.out.println(number + "is a NEGATIVE NUMBER");
        }else {
            System.out.println(number + "is Zero");
        }
    }

}
