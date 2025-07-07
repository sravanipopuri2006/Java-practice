package ArrayProblems;
import java.util.*;
public class Union {
    public static void main(String[] args) {
        int arr[]={1,5,9,33,56};
        int arr1[]={9,5,16,33,12};
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mpp.containsKey(arr[i])){
                mpp.put(arr[i],i);

            }
            
        }
        for(int i=0;i<arr1.length;i++){
            if(!mpp.containsKey(arr1[i])){
                mpp.put(arr1[i],i);

            }

        }
        for(int num:mpp.keySet()){
            System.out.print(num+" ");
        }
        



        
    }
}
