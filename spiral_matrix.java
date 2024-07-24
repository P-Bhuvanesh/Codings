
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = 3;
// 		 sc.nextInt();
		 int m = 3;
// 		 sc.nextInt();
		 
// 		 int mat[][] = new int[n][m];
		 
// 		 for(int i=0;i<n;i++)
// 		 {
// 		     for(int j=0;j<m;j++)
// 		     {
// 		         mat[i][j] = sc.nextInt();
// 		     }
// 		 }
		 
		 int mat[][] = {{1,2,3},
		                {4,5,6},
		                {7,8,9}};
		 
		 System.out.println("Spiral Matrix: ");
		 int top = 0, bottom = n-1, left = 0, right=m-1;
		 
		 while(top<=bottom && left<=right)
		 {
		     for(int i = left;i<=right;++i) System.out.print(mat[top][i]+" ");
		     top++;
		     
		     for(int i= top;i<=bottom;++i) System.out.print(mat[i][right]+" ");
		     right--;
		     
		     if(top<=bottom)
		     {
		         for(int i=right;i>=left;i--)
		         {
		             System.out.print(mat[bottom][i]+" ");
		         }
		         bottom--;
		     }
		     
		     if(left <= right)
		     {
		         for(int i=bottom;i>=top;i--)
		         {
		             System.out.print(mat[i][left]+" ");
		         }
		         left++;
		     }
		 }
	}
}
