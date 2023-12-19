import java.util.*;
public class FindMajority {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,3,2,5,1,3,1,5,1};
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);

            // }else{
            //     map.put(arr[i], 1);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            }
            // Set<Integer> key=map.keySet();
            for ( Integer kk :map.keySet()) {
                if(map.get(kk)>arr.length/3){
                    System.out.println(kk);
                }
            }
        }
    }
    

