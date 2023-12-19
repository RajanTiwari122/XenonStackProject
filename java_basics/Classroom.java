import java.util.*;
public class Classroom {
    public static boolean isvalid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
              char ch=str.charAt(i);
             
              if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }
            else{ if(s.isEmpty()){
                return false;
              }

              
              if((s.peek()=='('&& ch==')')||(s.peek()=='{'&& ch=='}')||(s.peek()=='['&& ch==']')){
                s.pop();
              }
              else{
                return false;
              }
            }
        }
              if(s.isEmpty()){
                return true;
              }
              else{
                return false;
              }
      
    }
    //isDuplicate
    public static boolean isDuplicate(String str){
        Stack <Character> s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }

        }
        return false;
    }
    //max area of a histogram
    public static void maxArea(int arr[]){
      int maxarea=0;
      int nsl[]=new int[arr.length];
      int nsr[]=new int[arr.length];
      //next smaller Right
      Stack<Integer> s=new Stack<>();
      for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
          s.pop();
        }
        if(s.isEmpty()){
          nsr[i]=arr.length;
        }else{
          nsr[i]=s.peek();

        }
        s.push(i);
      }

      //next smaller left
      s=new Stack<>();
      for(int i=0;i<arr.length;i++){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
          s.pop();
        }
        if(s.isEmpty()){
          nsl[i]=-1;
        }else{
          nsl[i]=s.peek();

        }
        s.push(i);
      }

      for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int area=height*width;
        maxarea=Math.max(maxarea, area);
      }
      System.out.println("the max area of histogram is: "+maxarea);


    }
    public static void main(String[] args) {
        // String str ="{([])}";
        // String str2="((a+b))";
        // System.out.println(isDuplicate(str2));
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }

    
}
