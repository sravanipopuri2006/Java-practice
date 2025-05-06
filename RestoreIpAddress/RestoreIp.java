package RestoreIpAddress;
import java.util.*;
public class RestoreIp {
    public static void restore(String str,ArrayList<String>result,String addr,int start,int segments){
        if(segments>=4){
            if(str.length()==start){
                addr=addr.substring(0,addr.length()-1);
                result.add(addr);
            }
            return;

        }
        for(int i=start;i<str.length();i++){
            String curr=str.substring(start,i+1);
            if(isValid(curr)){
                restore(str, result, addr+curr+".", i+1, segments+1);
            }
        }
        
    }
    public static boolean isValid(String curr){
        if(curr.isEmpty() || (curr.charAt(0)=='0'&& curr.length()>1) ||Integer.parseInt(curr)>255 || curr.length()>3){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String addr="";
        int start=0;
        int segments=0;
        ArrayList<String>result=new ArrayList<>();
        restore(str,result,addr,start,segments);
        System.out.println(result);
        
    }
}
