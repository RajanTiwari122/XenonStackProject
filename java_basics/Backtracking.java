public class Backtracking {
    public static void ChangeArr(int arr[],int i,int val){
        if(i==arr.length){
            PrintArr(arr);
            return;
        }
         arr[i]=val;
         ChangeArr(arr, i+1, val+2);
         arr[i]=val-2;
    }
    //FOR FINDING SUBSET GOR GIVEN STRING
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void FindSubsets(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        FindSubsets(str, i+1, ans+str.charAt(i));
        FindSubsets(str, i+1, ans);
    }
    // FOR FINDING PERMUTATION FOR GIVEN STRING
    public static void findPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        int i;
        for( i=0;i<str.length();i++){
          char curr=str.charAt(i);
          String NewStr=str.substring(0, i)+str.substring(i+1);
          findPermutation(NewStr, ans+curr);
        }
        
    }
    public static void main(String[] args) {
       // int arr[]=new int[5];
       // ChangeArr(arr, 0, 1);
        String str="ABC";
      //  FindSubsets(str, 0, "");
       // PrintArr(arr);
       
       findPermutation(str, "");
    }
    
}
