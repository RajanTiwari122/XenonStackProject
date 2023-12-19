import java.util.*;
public class trapped_water {
    public static int trapped_water1(int height[]){
        int n = height.length;
        int leftMax[]= new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);

        }
        int rightMax[]=new int [n];
        rightMax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1], height[j]);

        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int Waterlevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=Waterlevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped_water1(height));
    }
    
}
