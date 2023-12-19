import java.util.* ;
public class DistictElementUsingSet {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,4,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            int it=num[i];
            map.put(it,map.getOrDefault(it,0)+1);
        }
        System.out.println(map.size());
    //     HashSet<Integer> set=new HashSet<>();
    //     for(int i=0;i<num.length;i++){
    //         set.add(num[i]);
    //     }
    //     System.out.println("unique elements are :"+set.size() );
     }
}
