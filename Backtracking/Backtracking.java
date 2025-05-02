package Backtracking;
import java.util.*;

public class Backtracking {
    public static void printPermutations(String str,String ans,ArrayList<String>list){
        if(str.isEmpty()){
            list.add(ans);
         }
        for(int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            printPermutations(res, ans+ch,list);
           

        }
    }
    public static void main(String[] args) {
          ArrayList<String>list=new ArrayList<>();
          printPermutations("abc", "",list);
          System.out.println(list);
    }
    
}
