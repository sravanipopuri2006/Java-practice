package StringDemostration;
import java.util.*;
public class Stringdemo {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int max=0;
        ArrayList<String>arr=new ArrayList<>();
        int right;
        for(right=0;right<s.length();right++){
         while(set.contains(s.charAt(right))){
             arr.add(s.substring(left,right));
             set.remove(s.charAt(left));
             left++;
         }
         set.add(s.charAt(right));
         max=Math.max(max,right-left+1);
 
        }
        arr.add(s.substring(left,right));
        for(String str:arr){
            if(str.length()==max){
                System.out.print(str+" ");
            }
        }
        return max;
 
     }
    public static void main(String[] args) {
        String name="pwwkew";
        
        System.out.println("The longest length is: "+lengthOfLongestSubstring(name));


        

    }
    
    
}
