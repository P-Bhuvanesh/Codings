import java.util.*;

class Main{
    
    // moves the smaller elements to left of the pivot. recurisively divide array into 2 partitions.
    
    // Runtime: BestCase: O(n log(n))
    //          AverageCase : O(n log(n)) Worst Case: O(n^2) if already sorted.
    
    // Space Complexity: O(n log(n)) due to recursion.
    public static void quickSort(int arr[], int start, int end)
    {
        if(start>=end) return ;
        
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    
    public static int partition(int arr[], int st, int end)
    {
        int pivot = arr[end];
        int i = st-1;
        for(int j=st;j<end;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
    
    public static void main(String args[])
    {
        int[] arr = { 78, 23 ,46, 72, 14, 27, 50};
        
        quickSort(arr, 0, arr.length-1);
        
        for (int i: arr) System.out.print(i+" ");
        
    }
}