import java.util.*;
public class reverse_array {
    public static void reverse_array1(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<=last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
       
    }
    public static void main(String[] args) {
        int numbers[]={12,3,4,5,6};
        reverse_array1(numbers);
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        
    }
    
}
