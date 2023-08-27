
//Take 2 numbers from user and performing arithmetic operations on it.


import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        double num1=scan.nextFloat();
        System.out.println("Enter the Second Number: ");
        double num2=scan.nextFloat();
        scan.close();

        //Addition
        Addition sum=new Addition();
        System.out.println("Addition is :" + sum.add(num1,num2));

        //Subtraction
        System.out.println("Subtraction is :"+ subtraction(num1,num2));

        //Multiplication
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+multiplication(num1,num2));

        //Division
        System.out.println("Division of "+num1+" and "+num2+" is "+division(num1,num2));

        //Modulus /Remainder
        double modulus=num1%num2;
        System.out.println("Remainder of "+num1+" and "+num2+" is "+modulus);
    }
    private static double subtraction(double x,double y){
        return x-y;
        }

    private static double multiplication(double x,double y){
        return x*y;
    }
    private static double division(double x,double y){
        return x/y;
    }
    }

class Addition{
    public double add(double num1,double num2){
     return num1+num2;

}}
