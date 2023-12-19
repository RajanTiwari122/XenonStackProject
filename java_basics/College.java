public class College {
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
    public static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;

    }
    public static int count(Node root){
        if(root==null) return 0;
        int leftC=count(root.left);
        int Rightc=count(root.right);
        return leftC+Rightc+1;
    }
    public static int diameter(Node root){
        if(root==null) return 0;
        int Leftdia=diameter(root.left);
        int Rightdia=diameter(root.right);
        int leftH=height(root.left);
        int RightH=height(root.right);
        int SelfDia=leftH+RightH+1;
        return Math.max(Math.max(Rightdia, Leftdia), SelfDia);
    }
    public static void main (String arg[]){
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left =new Node(6);
        root.right.right =new Node(7);
        System.out.println(count(root));
        System.out.println(diameter(root));
    }
}
