import java.util.Scanner;

public class ForloopEx1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= scan.nextInt();
        System.out.println("Even Numbers");
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Odd Numbers:");

        for(int i=1;i<=n;i++){

            if(i%2!=0){
                System.out.print(i+" ");
            }

            }
        }
    }

