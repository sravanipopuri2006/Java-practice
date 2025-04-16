package PerfectNumber;
import java.util.*;
public class perfectNumber {
    public static boolean isPerfectNum(int num){
        int ans=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                ans+=i;
            }

        }
        if(ans==num){
            return true;
            
        }
        else{
            return false;
            
        }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(isPerfectNum(i)){
                System.out.println(i+" ");
    
            }
            

        }
        System.out.println("Enter the Num of cube root");
       
        

    }
    
}
