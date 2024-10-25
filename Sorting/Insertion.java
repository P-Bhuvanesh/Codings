import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] =  {30, 10, 50, 20, 40, 60};
		// Insertion Sort 
		// 10 30 50 20 40 60
		// 10 30 50 20 40 60
		for(int i=1;i<arr.length;i++) // i=1 || i = 2 || i = 3
		{
		    int j = i-1; // j = 0 || j =1 || j = 2
		    int key = arr[i]; // key = 10 || key = 50 || key = 20
		    
		    while(j >= 0 && arr[j] > key) // 30>10 || 30>50 || 50>20 -> 30>20 -> 1>20||
		    {
		        arr[j+1] = arr[j]; // arr[1]=30 || arr[3]=50 -> arr[2]=30
		        j = j-1; // j=-1 || j = 1 -> j = 0 
		    }
		    arr[j+1] = key; // arr[0] = 10 || arr[2] = 50 || arr[1] = 20
			// 10 30 50 20 40 60
			// 10 30 50 20 40 60
			// 10 20 30 50 40 60
			
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*
Work Case: O(n^2)
Best Case: O(n) :: already sorted 
Average Case: O(n^2)


Initially   -> 30 (10) 50 20 40 60 
First Pass  -> 10 (30) 50 20 40 60 
Second Pass -> 10 30 (50) 20 40 60  
Third Pass  -> 10 (20) 30 50 40 60 
Fourth Pass -> 10 20 30 (40) 50 60 
Fifth Pass  -> 10 20 30 40 50 (60)

*/
