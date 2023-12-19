import java.util.ArrayList;
public class StackB {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
         
        //push
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        //pop
        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            head=head.next;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
       
    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(s.isEmpty()==false){
            System.out.println(s.peek());
            s.pop();

        }
    }
    

    
}
