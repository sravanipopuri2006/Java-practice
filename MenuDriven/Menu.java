package MenuDriven;
import java.util.*;

public class Menu {
    public static void add(int num1,int num2){
        System.out.println("The addition numbers is :"+((int)num1+num2));
        

    }
    public static void sub(int num1,int num2){
        System.out.println("The subtraction of numbers is :"+((int)num1-num2));


    }
    public static void multiply(int num1,int num2){
        System.out.println("The Multiplication of two numbers: "+((int)num1*num2));

    }
    public static void divide(int num1,int num2){
        System.out.println("The division of two numbers: "+((int)num1/num2));

    }
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1: Add two numbers\n2.Subtract two Numbers\n3.Multiply numbers\n4.Divide Numbers\n5:Exit");
        System.out.println("Enter the Number1 :");
       
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the Number2 :");
        int num2=sc.nextInt();
        int choice=0;
        
        
            
            while(choice!=5){
                System.out.println("Enter the Choice :");
                choice=sc.nextInt();
                switch(choice){
                    case 1: add(num1,num2);
                    break;
                    case 2: sub(num1,num2);
                    break;
                    case 3: multiply(num1,num2);
                    break;
                    case 4: divide(num1,num2);
                    break;

            }
            
            
                
                
                
                


            

        }
       
    }
    
}
