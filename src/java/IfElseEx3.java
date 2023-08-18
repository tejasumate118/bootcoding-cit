//WAP to check whether a given number is positive or negative.
//
//Test Data : 11
//
//Expected Output 11 is a positive number

import java.util.Scanner;

public class IfElseEx3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Number to check Positive or negative: ");
        int a = scan.nextInt();

        if(a>0){
            System.out.println(a+" is a Positive integer.");
        }
        else{
            System.out.println(a+ " is a Negative integer.");
        }

    }
}
