import java.rmi.server.RemoteStub;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
        
    }
    public static Node head;        
    public static Node tail; 
    public static int size;

    //adding node at first position
    public void addFirst1(int data){
        Node newNode=new Node(data);
        size++;
         if(head==null){
            head=tail=newNode;
            return;
         }
         newNode.next=head;
         head=newNode;

        }

        //adding node at middle
        public void add(int idx,int data){
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            if(idx==0){
                addFirst1(data);
            }
            while(i<idx-1){
               temp=temp.next;
               i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        
        //adding node at last position
        public void addLast1(int data){
        Node newNode=new Node(data);
        size++;
         if(head==null){
            head=tail=newNode;
            return;
         }
         tail.next=newNode;
         tail=newNode;

        }

        //remove node at first position 
        public int RemoveFirst(){
          if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
          }
          else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
          }
          int val=head.data;
          head=head.next;
          size--;
          return val;
        }
        //remove node at last position 
        public int RemoveLast(){
            Node prev = head;
            if(size==0){
                System.out.println("ll is empty");
                
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size--;
                return val;

            }
            for(int i=0;i<size-2;i++){
                prev=prev.next;
           }
            int val=tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        
        //searching for a key using loop
        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;

        }
        //Searching for a key using recursion
        public int recSearch(int key){
            return helper(head,key);
        }
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            idx=idx+1;
            return idx;
        }

        ///method to print the node
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
        // reverse a linked list
        public void reverse(){
            Node prev= null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        // remove Nth element from last
        public void DeleteFromLast(int n){
            //size
            int size=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                size++;
            }
            if(n==size){
                head=head.next;
                return;
            }
            int i=1;
            Node prev=head;
            while(i<(size-n)){
                prev=prev.next;
                i++;

            }
            prev.next=prev.next.next;
            return;
        }
        public Node MidFind(Node head){
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                
            }
            return slow;

        }
        public boolean checkPalindrome(){
            if(head==null || head.next==null){
                return true;
            }
            //step 1
            Node miNode=MidFind(head);
            //step 2
           Node prev=null;
           Node curr=miNode;
           Node next;
           while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

           }
           Node right=prev;
           Node left=head;
           //step 3
           while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
           }
           return true;
        }
        //detecting a cycle in a ll
        public static boolean DetectCycle(){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }

        //removing a cycle
        public static void RemoveCycle(){
            //detect a cycle
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow ==fast){
                    cycle=true;
                }
                
            }
            if(cycle==false){
                return;
            }
            slow=head;
           Node prev=null;
           while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;

           }
           prev.next=null;
        }
        private Node getmid(Node head){
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        private Node Merge(Node head1,Node head2){
            Node mergeLL=new Node(-1);
            Node temp= mergeLL;
            while(head1!=null&&head2!=null){
                if(head1.data<=head2.data){
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                else{
                     temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }
                
            }
            while(head1!=null){
                temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
            }
            return mergeLL.next;
        }

        public Node MergeSort(Node head){
            if(head==null||head.next==null){
                return head;
            }
            Node mid=getmid(head);
            Node RightHead=mid.next;
            mid.next=null;
            Node LeftNew=MergeSort(head);
            Node RightNew=MergeSort(RightHead);
            return Merge(LeftNew, RightNew);

        }

        public Node FindMidZZ(Node head){
            Node slow=head;
            Node fast=head;
             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public Node ReverseZZ(){
            Node prev=null;
            Node curr=FindMidZZ(head);
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            //head=prev;
            return prev;
        }

        public void ZZLL(Node head){
            Node LH=head;
            Node RH=ReverseZZ();
            Node nextL,nextR;
            while(LH!=null&&RH!=null){
                nextL=LH.next;
                LH.next=RH;
                nextR=RH.next;
                RH.next=nextL;
                
                RH=nextR;
                LH=nextL;

            }
        }


           

    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
       ll.addFirst1(5);
       ll.addFirst1(4);
       ll.addFirst1(3);
       ll.addFirst1(2);
       ll.addFirst1(1);
       ll.print();
      //ll.head= ll.MergeSort(ll.head);
      ll.ZZLL(ll.head);
       ll.print();

    }
    
} 
    

