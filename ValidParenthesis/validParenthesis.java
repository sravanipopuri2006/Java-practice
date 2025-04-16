package ValidParenthesis;
import java.util.*;

public class validParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }
            else{
                if((ch=='}' && st.peek()=='{') ||(ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') ) {
                    st.pop();
                }
                
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Not Valid parenthesis");
        }
        
    }
    
}
