
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
              //User input can be taken by using below command.
        System.out.println("Enter the first number:");
        int a= Scan.nextInt();
        System.out.println(("Enter the second number:"));
        int b= Scan.nextInt();
        int c = a+b;

        System.out.println("Sum of the two given number is: "+ c);

    }
}
