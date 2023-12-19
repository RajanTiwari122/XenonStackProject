import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * arr, represents the given list of numbers.
 */
public class Solution1
{
	public static int[]  interchange(int[] arr)
	{
		int[]  answer = new int[100];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(i,arr[i]);
		}
		for(Integer key:map.keySet()){
			answer[map.get(key)]=key;
			//map.remove(key);
		}
		
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input for arr
		int arr_size = in.nextInt();
		int arr[] = new int[arr_size];
		for(int idx = 0; idx < arr_size; idx++)
		{
			arr[idx] = in.nextInt();
		}
		
		int[] result = interchange(arr);
		for(int idx = 0; idx < result.length - 1; idx++)
		{
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}
}



//-----------errorScore--
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /*
//  * 
//  */
// public class Solution
// {
// 	public static int  minProject(int[] errorScore, int compP, int othQ)
// 	{
// 		int  answer = 0;
// 		// Write your code here
// 		for(int i=0;i<errorScore.length;i++){
// 			if(errorScore[i]>0){
// 				compP=errorScore[i];
// 				for(int j=i;j<errorScore.length;j++){
// 					if(errorScore[j]>=compP){
// 						errorScore[j]-=compP;
// 						break;
// 					}else{
// 						errorScore[j]-=othQ;
// 						errorScore[j]=0;
// 					}
// 				}
// 				answer++;
// 			}
// 		}
		
		
// 		return answer;
// 	}

// 	public static void main(String[] args)
// 	{
// 		Scanner in = new Scanner(System.in);
// 		//input for errorScore
// 		int errorScore_size = in.nextInt();
// 		int errorScore[] = new int[errorScore_size];
// 		for(int idx = 0; idx < errorScore_size; idx++)
// 		{
// 			errorScore[idx] = in.nextInt();
// 		}
// 		// input for compP
// 		int compP = in.nextInt();
		
// 		// input for othQ
// 		int othQ = in.nextInt();
		
		
// 		int result = minProject(errorScore, compP, othQ);
// 		System.out.print(result);
		
// 	}
// }


