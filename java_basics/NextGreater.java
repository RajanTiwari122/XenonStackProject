import java.util.*;
public class NextGreater {
     public static void main(String[] args) {
        int arr[]={7,5,9,3,1,4};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i]=-1;

            }
            else{
                nxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.err.print(nxtGreater[i]+" ");
        }
        System.out.println();

    }
    
}
