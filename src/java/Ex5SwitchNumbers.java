//WAP to swap variables with each other's value
//
//Test Data : 5 8
//
//Expected Output 8 5

import java.util.Scanner;

public class Ex5SwitchNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        System.out.println("Your Entered Numbers are "+ num1 +" "+ num2);
        System.out.println("SWAPPING NUMBERS!!");
        int holder=num1;
        num1=num2;
        num2=holder;
        System.out.println("Numbers swapped :"+ num1 + " "+num2);

    }
}
