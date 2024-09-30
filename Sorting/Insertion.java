import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] =  {30, 10, 50, 20, 40, 60};
		// Insertion Sort 
		for(int i=1;i<arr.length;i++)
		{
		    int j = i-1;
		    int key = arr[i];
		    
		    while(j >= 0 && arr[j] < key)
		    {
		        arr[j+1] = arr[j];
		        j = j-1;
		    }
		    arr[j+1] = key;
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