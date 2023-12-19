public class selection_sort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j; 
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        
            }
            public static  void printArr(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
        }
    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
           
                while(prev>=0 && arr[prev]>curr ){
                    arr[prev+1]=arr[prev];
                   
                        prev--;
                    
                    

                }
                arr[prev+1]=curr;
            }
        }
        public static void counting_sort(int arr[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest, arr[i]);
                
            }
            int count[]=new int [largest+1];
            for(int j=0;j<arr.length;j++){
                count[arr[j]]++;
            }
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
        }
    
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        counting_sort(arr);
        printArr(arr);
    }
    
}
