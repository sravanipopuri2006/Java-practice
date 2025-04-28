package BitManipulation;
public class CountOnes {
    public static void main(String[] args) {
    int n=77;
    int count=0;
    int l=0;
    int len=Integer.toBinaryString(n).length();
    for(int i=0;i<len;i++)
    {
        l=n&1;
        if(l==1)
        {
            count+=1;
        }
        n>>=1;
    }
    System.out.println(count);
    //To find the Extra letter in second string
    String s1="sravani";
    String s2="lsravani";
    int flag=0;
    System.out.println("The character which is not there in first string is:");
    for(int i=0;i<Math.min(s1.length(),s2.length());i++){
        if((s1.charAt(i)^s2.charAt(i))!=0){
            System.out.println(s2.charAt(i));
            flag=1;
            return;
        }

    }
    if(flag==0){
        System.out.println(s2.charAt(s2.length()-1));
    }

    
        
    }
    
    
    
}
