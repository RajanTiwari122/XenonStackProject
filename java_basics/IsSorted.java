public class IsSorted {
    public static boolean check_sorted(int arr[],int i){
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check_sorted(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        System.out.println(check_sorted(arr, 0));
    }
    
}
