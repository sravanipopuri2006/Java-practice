package GenerateParenthesis;
import java.util.*;
public class generateParenthesis {
    private static void generate(int n,ArrayList<String>res,String output,int open,int close){
        if(open==close && output.length()==2*n){
            res.add(output);
            return;
        }
        if(open<n){
            generate(n,res,output+'(',open+1,close);
        }
        if(close<open){
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
