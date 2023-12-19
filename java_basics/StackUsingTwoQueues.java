import java.util.*;
import java.util.LinkedList;
public class StackUsingTwoQueues {
    static class Stack{
       static  Queue<Integer> q1=new LinkedList<>();
       static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty()&& q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
              
            }
            return top;   
           
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    
                    
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                   
                    q1.add(top);
                }
                
            }
            return top;

        }
       
    }
    //InterLeave 
    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> FirstH =new LinkedList<>();
        int size =q.size();
        for(int i=0;i<size/2;i++){
            FirstH.add(q.remove());
        }
        while(!FirstH.isEmpty()){
            q.add(FirstH.remove());
            q.add(q.remove());
        }
    }
    //reverse Queue
   
     public static void main(String[] args) {
             Queue<Integer> q=new LinkedList<>();
             q.add(1);
             q.add(2);
             q.add(3);
             q.add(4);
             q.add(5);
             q.add(6);
             InterLeave(q);
             while(!q.isEmpty()){
                System.err.print(q.remove()+" ");

             }
             System.out.println();

             }
             
        }
    

