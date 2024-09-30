import java.util.*;


public class Main
{
    
    static void merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int n1 = low;
        int n2 = mid+1;
        while(n1<=mid && n2<=high)
        {
            if(arr[n1]<arr[n2])
            {
                temp.add(arr[n1]);
                n1++;
            }
            else
            {
                temp.add(arr[n2]);
                n2++;
            }
        }
        
        while(n1<=mid)
        {
            temp.add(arr[n1]);
            n1++;
        }
        
        while(n2<=high)
        {
            temp.add(arr[n2]);
            n2++;
        }
        
        System.out.println(temp);
        
        for(int i=low;i<=high;i++)
        {
            arr[i] = temp.get(i-low);
        }
        
    }
    
    static void mergeSort(int[] arr, int st, int end)
    {
        if(st>=end) return;
        int mid = (st+end)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    } 
    
	public static void main(String[] args) {
		int arr[] = {30, 24, 14, 90, 56, 71};
		int n = arr.length;
		System.out.println("Before sorting the array: "+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After sorting the array: "+Arrays.toString(arr));
	}
}