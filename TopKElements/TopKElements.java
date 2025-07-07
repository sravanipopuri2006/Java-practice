package TopKElements;
import java.util.*;
public class TopKElements {
    int count;
    int element;
    public TopKElements(int element,int count){
        this.count=count;
        this.element=element;
    }
    public static void generateArray(int arr[]){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        TopKElements result[]=new TopKElements[mpp.size()];
        int i=0;
        for(Map.Entry<Integer,Integer>num:mpp.entrySet()){
            result[i]=new TopKElements(num.getKey(), num.getValue());
            i++;

        }
        Comparator<TopKElements>com=new Comparator<TopKElements>() {
            @Override
            public int compare(TopKElements t1,TopKElements t2){
                return t1.count>t2.count?-1:1;
            }
        };
        Arrays.sort(result,com);
        for(int j=0;j<3;j++){
            System.out.println(result[j].element);
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("The elements are:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements are:");
        generateArray(arr);

        
    }

    
}
