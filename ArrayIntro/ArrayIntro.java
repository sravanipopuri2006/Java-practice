package ArrayIntro;
import java.util.*;

public class ArrayIntro {
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;


            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int numArr[]=new int[n];
        System.out.println("Enter the element one by one: ");
        for(int i=0;i<numArr.length;i++){
            numArr[i]=sc.nextInt();
        }
        if(isSorted(numArr)){
            System.out.println("The array is in incresing order");
        }
        else{
            System.out.println("The array is not in increasing order");
        }
        
    }
}
