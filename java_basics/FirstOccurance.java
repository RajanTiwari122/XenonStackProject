public class FirstOccurance {
    public static int Check_FirstOccurance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Check_FirstOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(Check_FirstOccurance(arr, 0, 5));
    }
    
}
