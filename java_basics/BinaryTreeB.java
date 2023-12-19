import java.util.*;
public class BinaryTreeB {
     static class Node{
        int data;
        Node left;
        Node right;
           Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
         static int idx=-1;
        public Node binarytree(int nodes[]){
            idx++;
            while(idx<nodes.length){
                 if(nodes[idx]==-1){
                return null;
            }
            
            Node newNode=new Node(nodes[idx]);
            newNode.left=binarytree(nodes);
            newNode.right=binarytree(nodes);

            return newNode;
        }
          return null;  
           
        }
        //preorder Traversal
        public static void preordr(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preordr(root.left);
            preordr(root.right);
        }
        // Inorder traversal
    public static void inordr(Node root){
            if(root==null){
                return;
            }
            inordr(root.left);
            System.out.print(root.data+" ");
            inordr(root.right);
        }
        //Postorder Traversal
        public static void postordr(Node root){
            if(root==null){
                return;
            }
            postordr(root.left);
            postordr(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new java.util.LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);

                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,};
        BinaryTree tree= new BinaryTree();
        Node root=tree.binarytree(nodes);
       // tree.preordr(root);
      //  System.out.println();
        tree.levelOrder(root);
       // System.out.println();
     //   tree.postordr(root);

       // System.out.println(root.data);
    }
    
}
