import java.util.*;


public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String units[]={"","one","two","three","four","five","six","seven","eight","nine"};
        String Teens[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        if(num==10){
            System.out.println("Ten");
        }
        if(num==100){
            System.out.println("Hundred");
        }
        if(num>100){
            System.out.print(units[num/100]+" Hundered and ");
            num=num%100;

        }
        if(num>=10){
            System.out.print(Teens[num/10]+" ");
            num=num%10;


        }
        if(num<10){
            System.out.print(units[num]);
        }
    }
    
}
