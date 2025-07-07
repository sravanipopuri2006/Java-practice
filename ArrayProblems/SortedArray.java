package ArrayProblems;
import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
        int arr[]={1,4,9,13,42};
        int arr2[]={3,5,7,24,63};
        ArrayList<Integer>ans=new ArrayList<>();
        int left=0;
        int right=0;
        while(left<arr.length && right<arr2.length){
            if(arr[left]<arr2[right]){
                ans.add(arr[left]);
                left++;

            }
            else{
                ans.add(arr2[right]);
                right++;
            }

        }
        while(left<arr.length){
            ans.add(arr[left]);
            left++;
        }
        while(right<arr2.length){
            ans.add(arr2[right]);
            right++;
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
