public class bubble_sort {
    public static void bubble_sort(int arr[]){
        int swap=0; 
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }

                
            }
        }
        System.out.println(swap);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2};
        bubble_sort(arr);
        printArr(arr);
        
    }
    
}
