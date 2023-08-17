//Write a programme to find out the percentage obtained by a student in 5 subjects.
//Take marks from user.

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects (Max Marks per subject =100)");
        float marks1= scan.nextFloat();
        float marks2= scan.nextFloat();
        float marks3= scan.nextFloat();
        float marks4= scan.nextFloat();
        float marks5= scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter Student Name:");
        String name= scan.nextLine();
        float TotalMarksObtained= marks1+marks2+marks3+marks4+marks5;
        float MaxMarks=500;
        float percent= (TotalMarksObtained/MaxMarks) *100;
        System.out.println("Percentage Obtained by" + name + " is:"+ percent);


        System.out.println("Thank You!");
    }
}
