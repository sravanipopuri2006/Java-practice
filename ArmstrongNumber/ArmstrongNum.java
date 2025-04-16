package ArmstrongNumber;
import java.util.Scanner;

public class ArmstrongNum {
    public static int power(int num1,int num2){
        int ans=1;
        for(int i=0;i<num2;i++){
            ans=ans*num1;

        }
        return ans;
    }
    public static boolean Armstrong(int num){
        int temp=num;
       

        int len=(int)Math.log10(num)+1;
        int ans=0;
        while(num>0){
            int ld=num%10;
            ans+=power(ld,len);
            num=num/10;


        }
        if(temp==ans){
            return true;
        }
        else{
            return false;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        
        int num=sc.nextInt();
        System.out.println("Armstrong Numbers in the Range: ");
        for(int i=1;i<=num;i++){
            if(Armstrong(i)){
                System.out.print(i+" ");
            }
        }
        

        

    }
    
}
