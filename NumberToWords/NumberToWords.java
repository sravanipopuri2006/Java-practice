package NumberToWords;
import java.util.*;


public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int num=sc.nextInt();
        String units[]={"","one","two","three","four","five","six","seven","eight","nine"};
        String Teens[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String teen[]={"","Eleven","tewlve","thirteen","fourteen","fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        if(num==10){
            System.out.println("Ten");
            return;
        }
        if(num==100){
            System.out.println("Hundred");
            return;
        }
        if(num==0){
            System.out.println("Zero");
            return;
        }
        if(num>10 && num<20){
            System.out.println(teen[num%10]);
            return;
        }
        if(num==1000){
            System.out.println("Thousand");
            return;
        }
        if(num>1000){
            System.out.print(units[num/1000]+" Thousand");
            num=num%1000;
        }
        if(num>100){
            System.out.print(units[num/100]+" Hundered and ");
            num=num%100;

        }
        
        if(num>=20){
            System.out.print(Teens[num/10]+" ");
            num=num%10;


        }
        if(num<10){
            System.out.print(units[num]);
        }
    }
    
}
