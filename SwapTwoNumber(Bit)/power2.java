
import java.util.*;

public class power2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int num=sc.nextInt();
       int n=Integer.toBinaryString(num).length();
        int mask=(1<<n)-1;
        System.out.println("The complement is: ");
        System.out.println(mask^num);
        int a=10;
        int b=8;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
        
    }
}
