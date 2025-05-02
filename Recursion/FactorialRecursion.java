package Recursion;
import java.util.*;
public class FactorialRecursion {
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static int fibonacci(int num){
        if(num==0 || num==1){
            return num;
        }
       
        
        return fibonacci(num-1)+fibonacci(num-2);
       
    }
    public static void fiboSeries(int num,int a,int b){
        if(num>0){
            System.out.print(a+" ");
            fiboSeries(num-1, b, a+b);
        }
    }
    public static int SumofNatural(int num){
        if(num==1){
            return 1;
        }
        return num+SumofNatural(num-1);
    }
    public static int SumInArray(int arr[],int sum,int length){
        if(length==arr.length){
            return sum;

        }
        return SumInArray(arr, sum+arr[length],length+1);

    }

    public static String ReverseString(String str,String rev,int i){
        if(i<0){
            return rev;
        }
        return ReverseString(str, rev+str.charAt(i), i-1);
    }
    public static String ReverseStringB(String str){
        if(str.length()==0){
            return "";
        }
        return ReverseStringB(str.substring(1))+str.charAt(0);
    }
    public static int gcd(int num1,int num2){
        if(num2==0){
            return num1;

        } 
     return gcd(num2,num1%num2);

    }
    public static void printSubsequence(String str,String permutations,int i){
        if(i==str.length()){
            System.out.print(permutations+" ");
            return;
        }
        printSubsequence(str, permutations+str.charAt(i),i+1);
        printSubsequence(str, permutations, i+1); 

    }
    public static void main(String[] args) {
       
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("Factorial of the Number is: "+factorial(num));
        System.out.println("The fibo Series is:"+fibonacci(num));
        fiboSeries(num,0,1);
        int arr[]={1,2,3,5};
        System.out.println("Sum of elements are: "+SumInArray(arr, 0,0));
        String str="I love Recursion";
        System.out.println("The reverse of the String is: "+ReverseString(str, "", str.length()-1));
        System.out.println("The gcd of two Numbers are: "+gcd(35, 49));
        System.out.println("The Reverse of the string(Backtracking is:):"+ReverseStringB("Sravani"));
        printSubsequence("abc", "", 0);
        System.out.println();
    }
    
}
