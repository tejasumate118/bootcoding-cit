import java.util.Scanner;

public class VolumeOfBox {
    public static void main(String[] args) {
        Volume vol1 =new Volume();
        double height,width,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height, Width and Length of the box: ");
        height= sc.nextDouble();
        width= sc.nextDouble();
        length= sc.nextDouble();
        sc.close();
        vol1.calculation(width,height,length);


    }}
class Volume {
    public void calculation(double x, double y, double z) {
        System.out.println("Volume is :" + (x*y*z));
    }


}
