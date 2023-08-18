import java.util.Scanner;

public class IfElseEx1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        float num1=scan.nextFloat();
        System.out.println("Enter the Second Number: ");
        float num2=scan.nextFloat();

        if(num1==num2){
            System.out.println("Same Numbers");

        }
        else{
            System.out.println("Not same");}

    }
}
