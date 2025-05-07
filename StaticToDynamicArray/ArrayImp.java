package StaticToDynamicArray;
import java.util.*;

public class ArrayImp {
    public static int index=0;
    public static int arr[];
    public static void add(int element){
        if(index==arr.length){
            
            int temp[]=new int[arr.length];
            temp=arr;

            arr=new int[index+1];
            for(int i=0;i<temp.length;i++){
                arr[i]=temp[i];
            }
        } 
        
        arr[index]=element;
        index++;


    }
    public static int remove(){
        int element=arr[arr.length-1];
        arr[arr.length-1]=0;
        index--;
        int temp[]=new int[arr.length];
        temp=arr;

        arr=new int[index];
        for(int i=0;i<temp.length-1;i++){
            arr[i]=temp[i];
        }
        return element;
    }
    public static int get(int i){
        return arr[i];

    }
    public static int getSize(){
        return index;

    }
    public static void Rightshift(){
        int temp[]=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            temp[i]=arr[i-1];
        }
       
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=temp[i];

        }

    }
    public static void reverse(int start,int end){
        while(start<end && (end<arr.length && start>=0)){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        

    }
    public static void rotate(int num){
        reverse(0,arr.length-num-1);
        reverse(arr.length-num,arr.length-1);
        reverse(0,arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial size for the static array: ");
        int n=sc.nextInt();
        arr=new int[n];
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        
       
        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe element is removed");
        remove();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nThe size of the array is "+getSize());
        System.out.println(get(2));
        Rightshift();
        System.out.println("Elements after right shift");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the number of elements to be rotated in a array: ");
        int num=sc.nextInt();
        rotate(num);
        System.out.println("elements after array is rotated n places");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
        
        

    }
    
}
