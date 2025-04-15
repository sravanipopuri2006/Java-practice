import java.util.*;

public class DuplicateCheck {
    public static void HashApp(int arr[]){
        int flag=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        System.out.println(mpp.keySet());
      
        for(int element:mpp.keySet()){
            

            for(int k=1;k<=mpp.get(element)/2;k++){
                System.out.println(element);
                

            }
            if(mpp.get(element)>1){
                flag=1;
            }   
            
        }
        if(flag==1){
            System.out.println("Duplicates available");   

        }
        else{
            System.out.println("Duplicates not available");   
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

       
        // Arrays.sort(arr);
        // int flag=0;
        // for(int i=0;i<arr.length-2;i++){
        //     if(arr[i]==arr[i+1]){
        //         flag=1;
                
        //         break;
        //     }
        // }
        // if(flag==1){
        //     System.out.println("Has Duplicates");

        // }
        // else{
        //     System.out.println("Not has Duplicates");

        // }
        System.out.println("HahMap Aprroch");
        HashApp(arr);
        
    }
    
}
