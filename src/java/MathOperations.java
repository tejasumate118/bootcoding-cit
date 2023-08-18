
//Take 2 numbers from user and performing arithmetic operations on it.


import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        float num1=scan.nextFloat();
        System.out.println("Enter the Second Number: ");
        float num2=scan.nextFloat();

        //Addition
        float sum=num1+num2;
        System.out.println("Addition of "+num1+" and "+num2+" is "+sum);

        //Subtraction
        float sub=num1-num2;
        System.out.println("Subtraction of "+num1+" and "+num2+" is "+sub);

        //Multiplication
        float mul=num1*num2;
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+mul);

        //Division
        float div=num1/num2;
        System.out.println("Division of "+num1+" and "+num2+" is "+div);

        //Modulus /Remainder

        float modulus=num1%num2;
        System.out.println("Remainder of "+num1+" and "+num2+" is "+modulus+".");






    }
}
