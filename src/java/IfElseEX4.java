//WAP to find the largest of three numbers.
//
//Test Data : 5 8 12
//
//Expected Output
//
//1st Number = 5,
//
//2nd Number = 8,
//
//3rd Number = 12
//
//The 3rd Number is the greatest among three

import java.util.Scanner;

public class IfElseEX4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Number to Enter three numbers: ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+"Is greatest number");}
            else{
                    System.out.println(num3+" is greatest number");

                }}
        else{
            if(num2>num3){
                System.out.println(num2+" iS the Greastest number");

                }
            else{
                System.out.println(num3+ "is the Greatest number");
            }}
        }

    }

