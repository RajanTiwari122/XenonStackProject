import java.util.*;
public class UnionNIntersection {
    public static void main(String[] args) {
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,4};
        int len=Math.max(num1.length,num2.length);
        HashSet<Integer>set =new HashSet<>();
        //Union of two arrays
        for(int i=0;i<len;i++){
            if(i<num1.length){

                set.add(num1[i]);
            }
            set.add(num2[i]);
        }
        System.out.println("The union of two array is :"+set);
        //Intersection of two arrays
        HashSet<Integer> sett=new HashSet<>();
        for(int i=0;i<num1.length;i++){
            sett.add(num1[i]);

        }
        int count=0;
        for(int i=0;i<num2.length;i++){
         if(sett.contains(num2[i])){
            count++;

            System.out.print(num2[i]+" ");
            sett.remove(num2[i]);

         }
         
        }
        System.out.println();
        System.out.println(count);

    }
}
