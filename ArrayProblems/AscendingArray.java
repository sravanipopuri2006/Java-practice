package ArrayProblems;
import java.util.*;
public class AscendingArray {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elemnt to be inserted: ");
        int num=sc.nextInt();
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(24);
        arr.add(63);

        int index=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>num){
                index=i;
                break;
            }
           


        }
         arr.add(index,num);
        System.out.println("Index is:"+index);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));

        }
        

       

        
    }
}
