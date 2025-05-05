package GenerateParenthesis;
import java.util.*;
public class generateParenthesis {
    private static boolean isvalid(String output){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<output.length();i++){
            char ch=output.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()&&st.peek()=='(' && ch==')'){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    private static void generate(int n,ArrayList<String>res,String output,int open,int close){
        if(open==close && output.length()==2*n){
            if(isvalid(output)){
                res.add(output);

            }
            
            return;
        }
        if(open<n){
            generate(n,res,output+'(',open+1,close);
        }
        if(close<n){
            generate(n, res, output+')', open, close+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to generate the parenthesis: ");
        int num=sc.nextInt();
        ArrayList<String>res=new ArrayList<>();
        generate(num,res,"",0,0);
        System.out.println(res);
        
    }

    
}
