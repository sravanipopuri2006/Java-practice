package ClassDemo;
import java.util.*;
class Demo{
    public static String Palindrome(int a){
        
        String numStr=Integer.toString(a);
        int i=0;
        int j=numStr.length()-1;
        
        while(i<=j){
            if(numStr.charAt(i)!=numStr.charAt(j)){
                return("Not a Palindrome");

            }
            i++;
            j--;

        }
        return("Palindrome");



    }
    public static int reverse(int a){
        int rev=0;
        while(a>0){
            int ld=a%10;
            rev=rev*10+ld;
            a=a/10;
        }
        return rev;
    }
    public static void Compare(int a){
        int rev=0;
        
        
        while(rev<a){
            int ld=a%10;
           
            rev=rev*10+ld;

            a=a/10;
        }
        if(rev==a || rev/10==a){
            System.out.print("Palindrome");
        }
        else{
            // if(a==beforeRev){
            //     System.out.print("Palindrome");

            // }
            System.out.print("Not a Palindrome");

            
           
        }
    }
    public static boolean isPrime(int num){
        int flag=0;

        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        return true;
    }
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
        System.out.println("remainder "+num1);
        System.out.println("Quotient of two Numbers "+quotient);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        
        boolean arr[]=new boolean[a+1];
         for(int i=0;i<=a;i++){
             arr[i]=true;
         }
         for(int j=2;j*j<=a;j++){
            if(arr[j]==true){
               int m=j*j;
               while(m<=a){
                   arr[m]=false;
                   m=m+j;
              }
          }


        }
        System.out.println("Prime Numbers are:");
        for(int k=2;k<=a;k++){
            if(arr[k]==true){
                System.out.print(k+" ");
            }

        }
        
    
        

        
    }
}