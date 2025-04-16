package ErrorHandlingInJava;
import java.util.*;
public class ErrorHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int div=0;
        try{
            div=num1/num2;
            System.out.println(div);

        }
        catch(ArithmeticException err){
            System.out.println("Zero Division Error! ");


        }
        finally{
            sc.close();
            System.out.println("The Scanner Class is closed");

        }
        

    }

    
}
