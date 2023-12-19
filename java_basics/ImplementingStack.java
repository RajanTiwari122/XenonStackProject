import java.util.*;
public class ImplementingStack {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);

    }
    public static String reverseString(String str){
       Stack<Character> s= new Stack<>();
       int i=0;
       while(i<str.length()){
        s.push(str.charAt(i));
        i++;
       }
       StringBuilder result= new StringBuilder("");
       while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);
       }
       return result.toString();
    }
    //reverse Stack
    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        ReverseStack(s);
        PushAtBottom(s, top);
    }
    //Print Stack
    public static void PrintStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
     // PrintStack(s);
    ReverseStack(s);
    PrintStack(s);
      
    //   String str="abcdefghijklmnopqrstuvwxyz";
    //       String str1=reverseString(str);
    //       System.out.println(str1);
        }

    
}
