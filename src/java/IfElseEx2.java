import java.util.Scanner;

//WAP to check whether a given number is even or odd.
//WAP to check whether a given number is positive or negative.

//        Test Data : 11
//
  //      Expected Output 11 is a positive number
public class IfElseEx2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Number to check even or odd: ");
        int num1=scan.nextInt();
        if(num1>0) {
            System.out.println(num1+ " is a Positive number");}
        else{
            System.out.println(num1+ " is a Negative number");}
        }
    }


