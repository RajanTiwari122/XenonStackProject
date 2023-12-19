import java.util.ArrayList;

public class MultidimensionAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer> List= new ArrayList();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        mainlist.add(List);
         ArrayList<Integer> List1= new ArrayList();
         List1.add(2);
         List1.add(4);
         List1.add(6);
         List1.add(8);
         mainlist.add(List1);

        ArrayList<Integer> List2= new ArrayList();
         List2.add(3);
         List2.add(6);
         List2.add(9);
         List2.add(12);
         mainlist.add(List2);

         for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> curr= mainlist.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(" "+curr.get(j)+" ");
            }
            System.out.println();
         }
         System.out.println(mainlist);

    }
    
}
