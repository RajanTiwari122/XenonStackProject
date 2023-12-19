public class Indices_Of_key {
    public static void Find_indices(int arr[],int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.println(idx+" ");
            Find_indices(arr, key, idx+1);
        }
        else{
            Find_indices(arr, key, idx+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        Find_indices(arr, 2, 0);
    }
    
}
