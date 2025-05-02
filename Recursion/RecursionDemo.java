package Recursion;
public class RecursionDemo {
    public static void print100(int start,int end){
        if(start==end+1){
            return;
        }
        System.out.println(start);
        print100(start+1, end);
    }
    public static void main(String[] args) {
        for(int i=1;i<=1000000;i++){
            System.out.println(i);
        }
        print100(1,1000000);
    }
    
}
