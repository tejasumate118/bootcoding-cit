package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        //Array Declaration.
        int[] temp;
        //Delclaration + Initialize Array.
        int[] arr={5,9,15,2,8};
        //Length Of Array
        int n=arr.length;
        //Traverse array.
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)//Only print Even Numbers.
            System.out.print(arr[i] + " ");
        }
    }
}
