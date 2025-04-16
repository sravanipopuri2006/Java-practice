package BinaryTreeImplementation;
import java.util.*;
public class BinaryTree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   
    public static int index = -1;

    public Node Construct(int arr[]) {
        index++;
        if(index>=arr.length || arr[index]==-1){
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = Construct(arr);
        newNode.right = Construct(arr);
        return newNode;

    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                l.add(q.poll().data);

            }
            ans.add(l);
        }
        return ans;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int lCount=countNodes(root.left);
        int rCount=countNodes(root.right);
        return lCount+rCount+1;
    }
    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int lSum=sumNodes(root.left);
        int rSum=sumNodes(root.right);
        return lSum+rSum+root.data;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node root=bt.Construct(arr);
        System.out.println("The PreOrder Traversal of the Tree: ");
        preOrder(root);
        System.out.println("Level Order Traversal: ");
        System.out.println(levelOrder(root));
        System.out.println("The height of the Tree is: ");
        System.out.println(height(root));
        System.out.println("No of Nodes in Given Tree: ");
        System.out.println(countNodes(root));
        System.out.println("Sum of Nodes in Given Tree: ");
        System.out.println(sumNodes(root));


    }
}
