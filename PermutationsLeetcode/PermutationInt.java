package PermutationsLeetcode;
import java.util.*;
public class PermutationInt {
    public static void backtrack(ArrayList<ArrayList<Integer>>mpp,ArrayList<Integer>temp,ArrayList<Integer>ans){
        if(temp.size()==0){
            mpp.add(new ArrayList<>(ans));
            return;
            

        }
        for(int i=0;i<temp.size();i++){
            int num=temp.remove(i);
            
            ans.add(num);
            
            backtrack(mpp, temp, ans);
            ans.remove(ans.size() - 1);
            temp.add(i, num);
        }





    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            temp.add(arr[i]);
        }
        ArrayList<ArrayList<Integer>>mpp=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        backtrack(mpp,temp,ans);
        System.out.println(mpp);

    }
}
