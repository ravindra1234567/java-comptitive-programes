
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int num){
        this.data = num;
        this.left= null;
        this.right = null;
    }
}

public class BinaryTree {

     Node root;
    BinaryTree(){
        this.root=null;
    }
    
      static Node insertElement(int num,Node root){
            Node node = new Node(num);
            if(root == null)
                root = node;
            if(root.data > num)
                root.left = insertElement(num,root.left);
            if(root.data < num)
                root.right = insertElement(num,root.right);

        return root;
        }

        static void inOrder(Node root){
            if(root==null)
                return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        static void preOrder(Node root){
            if(root==null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
            
        }
        static void postOrder(Node root){
            if(root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        BinaryTree tree = new BinaryTree(); 
      for(int i=0;i<7;i++){
          int n = scan .nextInt();
          tree.root = insertElement(n,tree.root);

      }
        System.out.println("In Order");
        inOrder(tree.root);
        System.out.println("\nPre Order");
        preOrder(tree.root);
        System.out.println("\nPost Order");
        postOrder(tree.root);

        scan.close();

    }
    
}
