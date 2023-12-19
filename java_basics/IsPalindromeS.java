import java.util.*;
public class IsPalindromeS {
    public static class Node{
        char data;
        Node next;

        public Node(char d){
            this.data=d;
            this.next=null;
        }
      

    
    }
     
    public static boolean isPalin(){
        
    Stack<Character> s=new Stack<>();
    
    Node slow = head;
    boolean palin =true;
    while(slow!=null){
        s.push(slow.data);
        slow=slow.next;
    }
    Node temp=head;
    while(!s.isEmpty()){
        char i=s.pop();
        if(i==temp.data){
            
            palin= true;
        }
        else{
            palin= false;
            break;
            
        }
        temp=temp.next;
    }
    if(s.isEmpty()){
        palin= true;
    }
    return palin;
    }
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     public static Node head;
    
    public static void main(String[] args) {
        IsPalindromeS ll=new IsPalindromeS();
        ll.head=new Node('a');
        ll.head.next=new Node('b');
        ll.head.next.next=new Node('c');
        ll.head.next.next.next=new Node('b');
        ll.head.next.next.next.next=new Node('a');
        ll.print();
        System.out.println(ll.isPalin());
    }

    
}
