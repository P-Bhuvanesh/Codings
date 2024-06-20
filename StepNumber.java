import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        for(int i=st;i<=end;i++)
        {
            int temp = i,flag=1;
            int prev = -1;
            while(temp>0)
            {
                int ld = temp%10;
                if(prev != -1)
                {
                    if(Math.abs(prev-ld) != 1) flag=0;
                }
                temp/=10;
                prev = ld;
            }
            if(flag == 1) System.out.print(i+" ");
        }
    }
}
