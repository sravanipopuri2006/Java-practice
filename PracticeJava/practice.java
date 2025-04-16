package PracticeJava;
import java.util.Scanner;

public class practice {
    public static int multiply(int num1,int num2){
        int ans=0;
        for(int i=0;i<num2;i++){
            ans=ans+num1;

        }
        return ans;

    }
    public static void division(int num1,int num2){
        int quotient=0;
        
        while(num1>0 && num1>=num2){
            

            num1=num1-num2;
            quotient++;
        }
        System.out.println("remainder of two numbers : "+num1);
        System.out.println("Quotient of two Numbers : "+quotient);
        
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication : "+multiply(a, b));
        division(a, b);
        
    }
    
}
