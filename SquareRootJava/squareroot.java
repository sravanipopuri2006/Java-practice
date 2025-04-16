package SquareRootJava;
import java.util.*;

public class squareroot {
    public static double perfectSqrt(int num){
        int left=0;
        int right=num;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid*mid==num){
                return mid;
                
            }
            else if(mid*mid*mid<num){
                left=mid+1;
                
            }
            else{
                right=mid-1;
            }
        }
        return sqrt((double)num);


    }
    public static double sqrt(double num){
        double left=0;
        double right=num;
        while(left<=right){
            double mid=left+(right-left)/2;
            if((double)mid*mid*mid<=num){
                left=mid+0.00001;
                
            }
            else{
                right=mid-0.00001;
                
            }
        }
        return right;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double sqnum=sc.nextDouble();
        System.out.println("root of the number "+(perfectSqrt((int)sqnum)));
        
        
    }
}


