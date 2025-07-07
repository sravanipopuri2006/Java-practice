package ArrayProblems;
import java.util.*;
public class array {
    public static void main(String args[]){
        int arr[]=new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=5;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr);
        arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
            System.out.println(list.get(i));
        }
        list=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }

        

    }
    
}
