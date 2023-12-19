import java.util.*;
public class Itenerary {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("CHENNAI","BENGALURU");
        map.put("MUMBAI","DELHI");
        map.put("GOA","CHENNAI");
        map.put("DELHI","GOA");
        String start=getStart(map);
        System.out.print(start);
        for(String key:map.keySet()){
            System.out.print("->"+map.get(start));
            start=map.get(start);
        }
        System.out.println();
    }
    

}