public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
        this.data=data;
        this.next=next;
        this.prev=prev;

    }

    }
    public static Node head;
    public static Node tail;
    public static int  size;

    // addFirst method
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //printing LL
    public void print(){
        int data;
		Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    // remove element
    public void removeFirst(){
        if(head==null){
            System.out.println("dll is empty");
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    // add last
    public void addLast(int data){
        Node NewNode=new Node(data);
        size++;
        if(head==null){
            head=tail=NewNode;
            return;
        }
        tail.next=NewNode;
        NewNode.next=null;
        NewNode.prev=tail;
        tail=NewNode;
    }
    // remove last
    public void removeLast(){
        if(head==null){
            System.out.println("dLL is empty");
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        
         Node prev=head;
         for(int i=0;i<size-2;i++){
            prev=prev.next;
         }
            prev.next=null;
            tail.prev=prev;
            tail=prev;
            size--;
        
    }
    //reverse a DLL
    public void reverse(){
        Node curr=head;
        Node prev= null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addLast(2);
        dll.addLast(3);
        dll.print();
        dll.reverse();
        dll.print();
        
        

        // dll.print();
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        //   dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);


    }
}
